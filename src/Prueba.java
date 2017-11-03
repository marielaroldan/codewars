import java.util.function.Function;
import java.util.stream.IntStream;

public class Prueba {
    public static void main(String[] args) {
        int number = 30 ;
        boolean isPrime = number > 1 && IntStream.range(2, number).noneMatch(i -> number % i == 0);
        System.out.println(isPrime);


    }

}
