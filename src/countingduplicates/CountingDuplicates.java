package countingduplicates;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingDuplicates {

    public static void main(String[] args) {
        System.out.println(duplicateCount("abscbcbcbcbc"));
    }

    public static int duplicateCount(String text){

        char[] repited = text.toLowerCase().toCharArray();
        Map<Character,Integer> countMap =  new HashMap<>();
        Map<Character, Long> countMap2 = text.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        countMap2.values().stream()
                .filter(count -> count > 1)
                .count();
        for (int i = 0; i < repited.length; i++) {
            char key = repited[i];
//            countMap.merge(key,1,Integer::sum);
            if(countMap.containsKey(key)){
                int num = countMap.get(key);
                countMap.put(key,++num);
            }else{
                countMap.put(key,1);
            }
        }
        int cantRepeted = 0;
        for (Character c:countMap.keySet()) {
            int num = countMap.get(c);
            if (num!=1){
                cantRepeted++;
            }
        }
        return cantRepeted;
    }
}
