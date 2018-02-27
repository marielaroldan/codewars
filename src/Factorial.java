import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(5));
        System.out.println(factorial(9));
        System.out.println(factorial(15));
    }

    public static String factorial(int n) {

        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <=n ; i++) {
            fact = fact.multiply(new BigInteger(i+""));
        }

        return fact.toString();
    }
}
