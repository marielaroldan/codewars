package countingduplicates;

import java.util.HashMap;

public class CountingDuplicates {

    public static void main(String[] args) {
        System.out.println(duplicateCount("abscbcbcbcbc"));
    }

    public static int duplicateCount(String text){

        char[] repited = text.toLowerCase().toCharArray();
        HashMap<Character,Integer> countMap =  new HashMap<>();

        for (int i = 0; i < repited.length; i++) {
            char key = repited[i];
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
