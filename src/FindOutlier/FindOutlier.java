package FindOutlier;

import java.util.ArrayList;
import java.util.List;

public class FindOutlier {

    public static int find(int[] integers) {

        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                evens.add(new Integer(integers[i]));
            } else {
                odds.add(new Integer(integers[i]));
            }
        }
        if (evens.size()==1){
            return evens.get(0);
        }else if (odds.size()==1){
            return odds.get(0);
        }
        return 0;
    }
}