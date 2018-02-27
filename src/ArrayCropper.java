import java.util.ArrayList;
import java.util.List;

public class ArrayCropper {

    public static void main(String[] args) {
        int[][][] example = {
                {{0, 1, 0, 0},
                        {0, 0, 1, 0},
                        {1, 1, 1, 0},
                        {0, 0, 0, 0}},
                {{0, 1, 0},
                        {0, 0, 1},
                        {1, 1, 1}}
        };
        int[][] result = getCroppedFieldAsArray(example[1]);
        for (int i = 0; i < result.length; i++) {
            System.out.print("{");
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println("}");
        }
    }

    public static int[][] getCroppedFieldAsArray(int[][] src) {

        List<Integer> rowToCroop = ceroRows(src);
        List<Integer> colToCroop = ceroColumn(src);

        return cutColAndRows(rowToCroop, colToCroop, src);
    }

    private static List<Integer> ceroColumn(int[][] src) {

        List<Integer> colCeros = new ArrayList<>();
        for (int i = 0; i < src.length; i++) {
            int ones = 0;
            for (int j = 0; j < src[i].length; j++) {
                if (src[j][i] == 1) {
                    ones++;
                }
            }
            if (ones == 0) {
                colCeros.add(i);
            }
        }

        return colCeros;
    }

    private static List<Integer> ceroRows(int[][] src) {
        List<Integer> rowToCroop = new ArrayList<>();
        for (int i = 0; i < src.length; i++) {
            int ones = 0;
            for (int j = 0; j < src[i].length; j++) {
                if (src[i][j] == 1) {
                    ones++;
                }
            }
            if (ones == 0) {
                rowToCroop.add(i);
            }
        }
        return rowToCroop;
    }

    private static int[][] cutColAndRows(List<Integer> rows, List<Integer> col, int[][] src) {
        int top = -1;
        int bottom = src.length;
        int left = -1;
        int rigth = src[0].length;
        if (rows.size() > 0) {
            top = topMargin(rows,src.length);
            bottom = bottomMargin(rows,src.length);
        }
        if (col.size() > 0) {
            left = topMargin(col,src[0].length);
            rigth = bottomMargin(col,src[0].length);
        }
        int[][] result = new int[bottom - top - 1][rigth - left - 1];

        for (int i = top + 1, ri = 0; i <= bottom - 1; ri++, i++) {
            for (int j = left + 1, rj = 0; j <= rigth - 1; rj++, j++) {
                result[ri][rj] = src[i][j];
            }
        }

        return result;
    }

    private static int bottomMargin(List<Integer> rows, int n) {
        int bottom0 = n;
        for (int i = rows.size() - 1; i >= 0; i--) {
            if (bottom0 == rows.get(i) + 1) {
                bottom0 = rows.get(i);
            } else {
                break;
            }
        }
        return bottom0;
    }

    private static int topMargin(List<Integer> rows, int n) {
        int top0 = -1;
        for (int i = 0; i < rows.size(); i++) {
            if (top0 == rows.get(i) - 1) {
                top0 = rows.get(i);
            } else {
                break;
            }
        }
        return top0;
    }

}
