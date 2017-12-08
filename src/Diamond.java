
public class Diamond {

    public static void main(String[] args) {

        System.out.printf(print(9));
    }

    public static String print(int n) {
        if (n < 0 || n % 2 == 0) {
            return null;
        }
        StringBuilder diam = new StringBuilder();
        for (int i = 1; i <= n; i = i + 2) {
            diam.append(addSpace(i, n));
            diam.append(addStars(i, n));
        }
        for (int i = n - 2; i >= 1; i = i - 2) {
            diam.append(addSpace(i, n));
            diam.append(addStars(i, n));
        }
        return diam.toString();
    }

    public static String addStars(int pos, int n) {
        StringBuilder stars = new StringBuilder();
        for (int i = 1; i <= pos; i++) {
            stars.append("*");
        }
        return stars + "\n";
    }

    public static StringBuilder addSpace(int pos, int n) {
        StringBuilder row = new StringBuilder();
        int med = (n / 2) + 1;
        for (int i = 1; i < (med - pos / 2); i++) {
            row.append(" ");
        }
        return row;
        //
    }
}
