import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpresions {

    public static void main(String[] args) {
//        System.out.println(isDigit("7"));
        System.out.println(isLetter(""));

    }


    public static boolean isDigit(String s){

        return s.matches("[0-9]");
    }

    public static boolean isLetter(String s){
        return s.matches("[a-zA-Z]");
    }
}
