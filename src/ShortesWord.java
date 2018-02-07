import java.util.Arrays;

public class ShortesWord {

    public static void main(String[] args) {
        System.out.println(findShortTest());
    }
    public static boolean findShortTest(){
//        return (3== findShort("bitcoin take over the world maybe who knows perhaps"));
        return (3==findShort("turns out random test cases are easier than writing out basic ones"));
    }

    public static int findShort(String s) {

        String[] words = Arrays.stream(s.split(" ")).sorted((w1, w2) -> (w1.length()-w2.length())).toArray(size->new String[size]);

        return words[0].length();
    }
}
