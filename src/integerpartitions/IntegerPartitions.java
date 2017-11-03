package integerpartitions;

public class IntegerPartitions {

    public static String part(long n){
        double average = 0.0;
        double media = 0.0;
        long range = n;
        StringBuilder sb = new StringBuilder();

        




        sb.append("Range: ").append(range);
        sb.append("Average: ").append(average);
        sb.append("Median: ").append(media);
        return sb.toString();
    }
}
