package droot;

public class DRoot {

    public static void main(String[] args) {
        System.out.println(digitalRoot(942));
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number >= 10) {
            sum += number % 10;
            number = number / 10;
        }
        return sum + number;
    }

    public static int digitalRoot(int n) {

        while (n >= 10) {
            n = sumOfDigits(n);
        }
        return n;
    }

    public static int sumOfDigits2(int number) {
        if (number < 10) {
            return number;
        }
        int sum = 0;
        while (number >= 10) {
            sum += number % 10;
            number = number / 10;
        }
        return sumOfDigits2(sum+number);
    }
}


