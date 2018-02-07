import java.util.*;

public class NextBigNumberSameDigit {

    public static long nextBiggerNumber(long number) {

        String strNumber = Long.toString(number);

        if (strNumber.chars().distinct().count() == 1) {
            return -1;
        } else {
            List<String> newNumbers = computePermutations(strNumber);
            OptionalLong mimNextNumber = newNumbers.stream()
                    .mapToLong(Long::parseLong)
                    .filter(n -> n > number)
                    .min();
            return mimNextNumber.orElse(-1);
        }
    }

    private static List<String> computePermutations(String strNumber) {

        ArrayList<String> permutations = new ArrayList<>();
        permutation("", strNumber, permutations);
        return permutations;
    }

    private static void permutation(String prefix, String str, ArrayList<String> permutations) {
        int n = str.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), permutations);
        }
    }

}
