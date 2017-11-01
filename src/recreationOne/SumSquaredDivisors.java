package recreationOne;

public class SumSquaredDivisors {

    public static void main(String[] args) {


        System.out.println("[[1, 1], [42, 2500], [246, 84100]]".equals(listSquared(1,250)));
        System.out.println(listSquared(1, 250));
    }

    private static String listSquared(int m, int n){
        StringBuilder result = new StringBuilder("[");
        for (int i = m; i <= n; i++) {
            int num = sumSquareDivisor(i);
            if (isSqueared(num)){
                if (result.length() > 1) {
                    result.append(", ");
                }
                result.append(String.format("[%d, %d]", i, num));
            }
        }
        result.append("]");
        return result.toString();

    }

    private static int sumSquareDivisor(int n){
        int divisor = 0;
        for (int i =  1; i <= n ; i++) {
            if(n%i==0){
                divisor+= i*i;
            }
        }
        return divisor;

    }
    private static boolean isSqueared(int n){

        double raiz = Math.sqrt(n);
        return raiz - (int) raiz == 0;
    }


}
