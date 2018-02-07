import java.util.Arrays;
import java.util.List;


public class FindOddInt {

    public static int findIt(Integer[] input) {
        List<Integer> list = Arrays.asList(input);

        for (Integer num:input) {
            int odd= count(list,num);
            if(odd!=0 && (odd%3==0||odd==1) ){
                return num;
            }
        }
        return 0;
    }
    public static int count(List<Integer> list, int num){
        return (int) list.stream().filter(s->s==num).count();
    }
}
