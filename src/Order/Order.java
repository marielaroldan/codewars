package Order;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Your task is to sort a given string. Each word in the String will contain a single number. This number
 * is the position the word should have in the result.
 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 * If the input String is empty, return an empty String. The words in the input String will only contain
 * valid consecutive numbers.
 * For an input: "is2 Thi1s T4est 3a" the function should return "Thi1s is2 3a T4est"
 */
public class Order {

    public static final Pattern NUMBER_PATTERN = Pattern.compile("[1-9]");

    public static String order(String words) {
        String[] wordArray = words.split(" ");
        String[] newWordsArray = new String[wordArray.length];

        StringBuilder sb = new StringBuilder();

        newWordsArray = createNewString(wordArray);
        if(newWordsArray[0]!=null){
            for (int i = 0; i < newWordsArray.length; i++) {
                String word = newWordsArray[i];
                sb.append(word+" ");
            }
            return sb.toString().trim();
        }else{
            return "";
        }
    }

    public static String[] createNewString(String[] wordArray) {
        String[] newWordsArray = new String[wordArray.length];
        for (int i = 0; i < wordArray.length; i++) {
            String word = wordArray[i];
            int indexWord = lookForNumber(word);
            if(indexWord>0) {
                newWordsArray[indexWord - 1] = word;
            }
        }
        return newWordsArray;
    }

    public static int lookForNumber(String word) {
        Matcher matcher = NUMBER_PATTERN.matcher(word);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(0));
        }
        return 0;
//        String number="0";
//        for (int i = 1; i <= 9; i++) {
//            int position = word.indexOf(""+i);
//            if (position != -1) {
//                number = word.substring(position,position+1);
//            }
//        }
//        return Integer.parseInt(number);
    }

}
