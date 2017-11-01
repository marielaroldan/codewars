import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PascalTriangle {

    public static void main(String[] args) {
        int[][] result = triangel(6);
        for (int[] aResult : result) {
            System.out.println(Arrays.toString(aResult));
        }
    }

    private static List<List<Integer>> triangelPascal(int n) {
        List<List<Integer>> result = new ArrayList<>();
        if (n == 0) {
            return result;
        }
        result.add(Collections.singletonList(1));
        List<Integer> previewRow = result.get(0);

        for (int i = 2; i <= n; i++) {
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for (int j = 1; j < previewRow.size(); j++) {
                currentRow.add(previewRow.get(j)+previewRow.get(j-1));
            }
            currentRow.add(1);
            result.add(currentRow);
            previewRow = currentRow;
        }
        return result;
    }

    public static int[][] triangel(int n){

        int[][] result = new int[n][];

        if (n == 0){
            return result;
        }
        result[0]= new int[]{1};
        int[] previousRow = result[0];

        for (int i = 1; i < n ; i++) {
            int[] currentRow = new int[i+1];
            currentRow[0] = 1;
            for (int j = 1; j < i; j++) {
                currentRow[j] = previousRow[j] + previousRow[j-1];
            }
            currentRow[i] = 1;
            result[i] = currentRow;
            previousRow = currentRow;
        }
        return result;
    }
}
