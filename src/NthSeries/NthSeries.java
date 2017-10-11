package NthSeries;

public class NthSeries {

    public static void main(String[] args) {
        System.out.println(seriesSum(2));
    }
    public static String seriesSum(int n) {
        // Happy Coding ^_^
        double sum = 0;
        int j=1;
        for (int i = 0; i < n; i++) {
            sum += (1.0/j);
            j=j+3;
        }
        return String.format("%.2f",sum);
    }
}
