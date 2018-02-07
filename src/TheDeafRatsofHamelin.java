import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheDeafRatsofHamelin {

    public static final Pattern RAT_PATTERN = Pattern.compile("(O~)|(~O)");
    public static final Pattern TOWN_PATTERN = Pattern.compile("(?<left>.*)P(?<right>.*)");
    public static final String DEAF_LEFT = "O~";
    public static final String DEAF_RIGHT = "~O";

    public static void main(String[] args) {
        System.out.println(countDeafRats("~O~O~O~O P"));
        System.out.println(countDeafRats("P O~ O~ ~O O~"));
        System.out.println(countDeafRats("~O~O~O~OP~O~OO~"));

    }

    public static int countDeafRats(final String town){
        Matcher matcher = TOWN_PATTERN.matcher(town);
        matcher.matches();

        String leftSide= matcher.group("left");
        String rightSide= matcher.group("right");

        int ratsDef = countDefRats(leftSide, DEAF_LEFT);
        ratsDef += countDefRats(rightSide, DEAF_RIGHT);

        return ratsDef;
    }

    private static int countDefRats(String side, String deafRat) {
        Matcher leftMatcher = RAT_PATTERN.matcher(side);
        int ratsDef = 0;
        while (leftMatcher.find()){
            if(leftMatcher.group().equals(deafRat)){
                ratsDef++;
            }
        }
        return ratsDef;
    }
}
