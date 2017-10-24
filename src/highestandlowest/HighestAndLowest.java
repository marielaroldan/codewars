package highestandlowest;

import java.util.Arrays;

public class HighestAndLowest {

    public static String highAndLow(String numbers){

        int[] input = Arrays.stream(numbers.split(" ")).mapToInt(i->Integer.parseInt(i)).toArray();
        int lowest = input[0];
        int highest = Integer.MIN_VALUE;
        for (int in: input) {
            if (in<lowest){
                lowest = in;
            }
            if(in>highest){
                highest = in;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(highest).append(" ").append(lowest);
        return sb.toString();
    }

}
