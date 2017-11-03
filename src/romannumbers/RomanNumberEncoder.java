package romannumbers;

import jdk.nashorn.internal.objects.NativeUint8Array;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class RomanNumberEncoder {

    public final static String UNO = "I";
    public final static String CINCO = "V";
    public final static String DIEZ = "X";
    public final static String CINCUENTA = "L";
    public final static String CIEN= "C";
    public final static String QUINIENTOS= "D";
    public final static String MIL = "M";

    public static String encoder(int number){
        StringBuilder romanNumber = new StringBuilder();
        int[] posibilidades = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] otrasPosibilidaes = new String[]{MIL,CIEN+MIL,QUINIENTOS,CIEN+QUINIENTOS,CIEN,DIEZ+CIEN,CINCUENTA,DIEZ+CINCUENTA,DIEZ,UNO+DIEZ,CINCO,UNO+CINCO,UNO};

        for (int i = 0; i < posibilidades.length; i++) {
            while(number>=posibilidades[i]){
                romanNumber.append(otrasPosibilidaes[i]);
                number -= posibilidades[i];
            }
        }
        return romanNumber.toString();
    }

    public static String encoder2(int number){
        StringBuilder romanNumber = new StringBuilder();
        Queue<Integer> posibilidades = new ArrayDeque<>(Arrays.asList(1000,900,500,400,100,90,50,40,10,9,5,4,1));
        Queue<String> otrasPosibilidaes = new ArrayDeque<>(Arrays.asList(MIL,CIEN+MIL,QUINIENTOS,CIEN+QUINIENTOS,CIEN,DIEZ+CIEN,CINCUENTA,DIEZ+CINCUENTA,DIEZ,UNO+DIEZ,CINCO,UNO+CINCO,UNO));

        return encoder2Rec(number, romanNumber, posibilidades, otrasPosibilidaes);
    }

    private static String encoder2Rec(int number, StringBuilder romanNumber, Queue<Integer> posibilidades, Queue<String> otrasPosibilidaes) {
        if (posibilidades.isEmpty()) {
            return romanNumber.toString();
        }
        Integer pos = posibilidades.remove();
        String otro = otrasPosibilidaes.remove();
        return encoder2RecInterno(number, romanNumber, posibilidades, pos, otrasPosibilidaes, otro);
    }

    private static String encoder2RecInterno(int number, StringBuilder romanNumber, Queue<Integer> posibilidades, Integer pos, Queue<String> otrasPosibilidaes, String otro) {
        if (number >= pos) {
            return encoder2RecInterno(number - pos, romanNumber.append(otro), posibilidades, pos, otrasPosibilidaes, otro);
        }
        return encoder2Rec(number, romanNumber, posibilidades, otrasPosibilidaes);
    }

    public static void main(String[] args) {
        System.out.println(encoder2(2007));
    }
}
