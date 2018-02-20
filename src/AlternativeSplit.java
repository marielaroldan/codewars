import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class AlternativeSplit {

    public static void main(String[] args) {
//        System.out.println(encrypt("This is a test!",1));
        System.out.println(decrypt("hsi  etTi sats!",1));
    }

    public static String encrypt(final String text, final int n) {

        if(text.length()<=0 || n <=0){
            return text;
        }

        String finalText = text;
        for (int i = 0; i < n; i++) {
            finalText = rotateString(finalText);
        }
        return finalText;
    }

    public static String decrypt(final String encryptedText, final int n) {


        int splitIndexEncryptText = encryptedText.length()/2;
        String odds = encryptedText.substring(0,splitIndexEncryptText);
        String evens = encryptedText.substring(splitIndexEncryptText);

        Queue<Character> odssLetters = putInQueue(odds);
        Queue<Character> evensLetters = putInQueue(evens);

        String finalText = "";
        for (int i = 0; i < encryptedText.length(); i++) {
            if (i%2==0){
                finalText += evensLetters.remove();
            }else{
                finalText += odssLetters.remove();
            }
        }

        return finalText;
    }

    private static Queue<Character> putInQueue(String text){
        List<Character> textAsList = text.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        return new ArrayDeque<Character>(textAsList);

    }
    private static String rotateString(String text) {
        String stringA = "";
        String stringB = "";

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (i % 2 == 0) {
                stringA += letter;
            } else {
                stringB += letter;
            }
        }
        return stringB + stringA;
    }
}
