package generatecolorrgb;

import java.util.Random;

/**
 * Generate a valid randomly generated rgb color string. Assume all of them have 6 digits always.
 */
public class GenerateColorRGB {

    public static void main(String[] args) {
        String color = generateColor(new Random());
        System.out.println(color);
    }

    /**
     * This method use a array with the possible values in the hexadecimal unit.
     * @param r This is a random object which create aleatory number
     * @return a String with the valid value of a representation of color in HTML
     */
    public static String generateColor(Random r){

        String[] hexadecimalNumbers = new String[]{"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
        StringBuilder colorRGB = new StringBuilder();
        colorRGB.append("#");
        for (int i = 0; i < 6; i++) {
            int value = r.nextInt(16);
            colorRGB.append(hexadecimalNumbers[value]);
        }
        return colorRGB.toString();
    }
}
