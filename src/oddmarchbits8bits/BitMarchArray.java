package oddmarchbits8bits;

import java.util.Arrays;

public class BitMarchArray {

    public static void main(String[] args) {
        BitMarch(3);
    }

    public static int[][] BitMarch(int n){

        int row = (8 - n) + 1;
        int column = 8;
        int[][] battleBits = new int[row][column];
        int count = 1;
        int j = (column-count);
        for (int i = 0; i < row; i++) {
            for (; j >= column-n; j--) {
                battleBits[i][j] = 1;
            }
            j = (column-(++count));
            n++;
        }
        return battleBits;
    }

}
