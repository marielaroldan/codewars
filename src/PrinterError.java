public class PrinterError {

    public static void main(String[] args) {

    }

    public static String printerError(String s) {
        long error = s.chars()
                .filter(c->c>'m')
                .count();
        return "" + error + "/" + s.length();
    }
}
