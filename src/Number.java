public class Number {

    public static void main(String[] args) {
        Number num = new Number();
        System.out.println(num.isEven((-4)));
    }

    private boolean isEven(double n) {
        return n % 2 == 0;
    }
}
