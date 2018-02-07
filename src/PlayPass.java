/**
 * shift each letter by a given number but the transformed letter must be a letter (circular shift),
 * replace each digit by its complement to 9,
 * keep such as non alphabetic and non digit characters,
 * downcase each letter in odd position, upcase each letter in even position (the first character is in position 0),
 * reverse the whole result.
 */
public class PlayPass {

    public static void main(String[] args) {
        System.out.println(playPass("BORN IN 2015!", 1));//"!4897 Oj oSpC"
    }

    public static String playPass(String s, int n) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)){
                newString.append(shiftNumber(c));
            }else if (Character.isLetter(c)){
                newString.append(toUpperOrLower(shiftCharacter(c,n),i));
            }else{
                newString.append(c);
            }
        }
        newString.reverse();
        return newString.toString();

    }
    private static char toUpperOrLower(char c, int pos){
        if(pos%2==0){
            return c;
        }else{
            return Character.toLowerCase(c);
        }
    }
    private static int shiftNumber(char n){
        int x = Character.getNumericValue(n);
        return 9-x;
    }
    private static char shiftCharacter(char c, int shiffValue){

        int shiftedLetter = c + shiffValue;

        if(shiftedLetter >'Z'){
            shiftedLetter -= 26;
        }
        return (char) shiftedLetter;

    }
}
