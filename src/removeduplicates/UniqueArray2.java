package removeduplicates;

import java.util.ArrayList;
import java.util.List;

public class UniqueArray2 {

    public static int[] unique(int[] integers){
        List<Integer> list = new ArrayList<>();
        for (int i:integers) {
            if(!list.contains(i)){
                list.add(i);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
