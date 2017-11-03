import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryRegexp {

    public static void main(String[] args) {
        multipleOf3();
    }

    public static Pattern multipleOf3(){


        Pattern patron = Pattern.compile("*[10]");
        Matcher prueba = patron.matcher("101010");
        System.out.println(prueba.matches());
        return Pattern.compile("");
    }
}
