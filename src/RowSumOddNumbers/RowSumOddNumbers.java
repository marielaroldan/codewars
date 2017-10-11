public class RowSumOddNumbers {

    public static int rowSumOddNumbers(int n){
        if (n == 1){
            return 1;
        } else if (n>1){
            int aux = n-1;
            int j = (aux*aux)+aux+1;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += j;
                j = j + 2;
            }
            return sum;
        }
        return 0;
    }

}
