import java.util.*;


import static java.util.Comparator.comparingInt;

public class LongestCommonSubsequence {
    public static void main(String[] args) {

//        subSequences("abc").forEach(System.out::println);
        System.out.println(lcs("abcdef","abc"));
        System.out.println(lcs("abcdef", "acf"));
        System.out.println(lcs("132535365", "123456789"));
    }

    public static String lcs(String x, String y) {

        Set<String> subX = subSequences(x);
        Set<String> subY = subSequences(y);

        return subX.stream()
                .filter(subY::contains)
                .max(comparingInt(String::length))
                .orElse("");

    }

    private static Set<String> subSequences(String str) {
        Set<String> subX = new HashSet<>();
        for (int i = 1, n = (int) Math.pow(2,str.length());i < n ; i++) {
            subX.add(subSequence(str,i));
        }
        return subX;
    }

    private static String subSequence(String str, int bitMask){

        StringBuilder mask = new StringBuilder();
        mask.append(Integer.toBinaryString(bitMask));
        mask.reverse();

        StringBuilder subSeq = new StringBuilder();
        for (int i = 0; i < mask.length(); i++) {
            char binaryChar = mask.charAt(i);
            if(binaryChar == '1'){
                subSeq.append(str.charAt(i));
            }
        }
        return subSeq.toString();

    }
}
