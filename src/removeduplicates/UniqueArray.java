package removeduplicates;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class UniqueArray{

    public static void main(String[] args) {
        int[] test = unique(new int[]{1,5,2,0,2,-3,1,10});
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }
    }
    public static int[] unique(int[] integers){
        int[] newWithoutRepeated;
        TreeMap<Integer, Integer> posRepetidos;
        if(integers.length==0){
            return new int[0];
        }else if(integers.length == 1){
            return integers;
        }else{
            //newWithoutRepeated = getInts(integers);
            int posRepetido;
            posRepetidos = new TreeMap<>();
            for (int i = 0; i < integers.length; i++) {
                if(!posRepetidos.containsKey(integers[i])){
                    posRepetido = isRepeated(integers, i,integers[i]);
                    if(posRepetido !=-1){
                        if(!posRepetidos.containsKey(integers[i])){
                            posRepetidos.put(integers[i],posRepetido);
                        }
                    }
                }
            }
        }
        List<Integer> provicional = new ArrayList<>();
        for (int i = 0; i < integers.length; i++) {
            Integer pos = posRepetidos.get(integers[i]);
            int num = integers[i];
            int numActual = integers[i];
            if(posRepetidos.containsKey(num) && pos != i){
                if(!provicional.contains(numActual)){
                    provicional.add(integers[i]);
                }
            }else if(posRepetidos.containsKey(num) && pos == i){
                continue;
            }else {
                if(!provicional.contains(numActual)){
                    provicional.add(integers[i]);
                }
            }
        }
        newWithoutRepeated = new int[provicional.size()];
        int i = 0;
        for (Integer num: provicional) {
            newWithoutRepeated[i] = num;
            i++;
        }
        return newWithoutRepeated;
    }
    private static int isRepeated(int[] integers,int posActual, int num){
        int position = -1;
        int i;
        for (i = 0; i < integers.length; i++) {
            if(integers[i] == num && posActual != i){
                position = i;
            }
        }
        return position;
    }
}
