package scramblies;

import java.util.Map;
import java.util.stream.Collectors;

public class Scramble {

    public static boolean scramble(String str1, String str2){
        Map<Character, Long> countStr1 = str1.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        boolean scrableWord = false;
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if(countStr1.containsKey(c) && countStr1.get(c)>0){
                scrableWord = true;
                Long aLong = countStr1.get(c);
                countStr1.put(c,--aLong);
            }else{
                return false;
            }
        }
        return scrableWord;
    }
}
