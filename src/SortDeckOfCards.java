import java.util.Arrays;
import java.util.HashMap;

public class SortDeckOfCards {

    private static final String REG_EX = "[ATJQK]";

    private static HashMap<String, Integer> constant = inicializar();

    public static String[] sortCards(String[] cards) {
        Arrays.sort(cards, (o1, o2) -> {
            if (o1.matches(REG_EX) || o2.matches(REG_EX)) {
                return compareBoth(o1, o2);
            } else {
                return o1.compareToIgnoreCase(o2);
            }
        });

        return cards;
    }

    public static HashMap<String, Integer> inicializar() {
        HashMap<String, Integer> constant = new HashMap<>();
        constant.put("A", 1);
        constant.put("T", 10);
        constant.put("J", 11);
        constant.put("Q", 12);
        constant.put("K", 13);
        return constant;
    }

    private static int compareBoth(String o1, String o2) {
        if (o1.matches(REG_EX) && o2.matches(REG_EX)) {
            return constant.get(o1) - constant.get(o2);
        } else if (o1.matches(REG_EX)) {
            return constant.get(o1) - Integer.parseInt(o2);
        } else if (o2.matches(REG_EX)) {
            return Integer.parseInt(o1) - constant.get(o2);
        }
        return 0;
    }

}
