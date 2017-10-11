package DuplicateEncoder;

import java.util.HashMap;

/**
 * The goal of this exercise is to convert a string to a new string where each character in the new string
 * is '(' if that character appears only once in the original string, or ')' if that character appears more
 * than once in the original string. Ignore capitalization when determining if a character is a duplicate.
 * Examples:
 * "din"     => "((("
 * "recede"  => "()()()"
 * "Success" => ")())())"
 * "(( @"    => "))(("
 *
 */
public class DuplicateEncoder {


    public static String encode(String word){

        final char CLOSE = ')';
        final char OPEN = '(';

        word = word.toLowerCase();
        char[] charArrayWord = word.toCharArray();
        HashMap<Character,Integer> ocurrency = new HashMap<Character, Integer>();

        for (char c : charArrayWord) {
            ocurrency.merge(c, 1, Integer::sum);
            //ocurrency.merge(c, 1, (a, b) -> a + b);
//            if((ocurrency.get(charArrayWord[i]))==null) {
//                ocurrency.put(new Character(charArrayWord[i]), new Integer(1));
//            }else{
//                int actualOccurrence = ocurrency.get(charArrayWord[i]);
//                actualOccurrence++;
//                ocurrency.put(new Character(charArrayWord[i]), new Integer(actualOccurrence));
//            }
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < charArrayWord.length; i++) {
            if (ocurrency.get(charArrayWord[i])==1){
                sb.append(OPEN);
            }else{
                sb.append(CLOSE);
            }
        }

        return sb.toString();
    }

}
