package TwoToOne;

import java.util.HashSet;

public class TwoToOne {

    public static String longest(String s1, String s2){

        char[] stringA = s1.toCharArray();
        char[] stringB = s2.toCharArray();

        HashSet<Character> alphabet = new HashSet();
        extractCharsFromString(stringA, alphabet);
        extractCharsFromString(stringB, alphabet);

        char[] alphabetSort = new char[26];
        for (Character c:alphabet) {
            int character = (int)c;
            alphabetSort[(character)-97] = (char) character;
        }
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < alphabetSort.length; i++) {
            if(alphabetSort[i] != '\u0000'){
                finalString.append(alphabetSort[i]);
            }
        }
        return finalString.toString();
    }

    private static void extractCharsFromString(char[] stringA, HashSet<Character> alphabet) {
        for (int i = 0; i < stringA.length; i++) {
            alphabet.add(stringA[i]);
        }
    }
}
