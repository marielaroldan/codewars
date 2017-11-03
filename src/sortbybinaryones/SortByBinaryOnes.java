package sortbybinaryones;

import java.util.*;

public class SortByBinaryOnes {

    public static void main(String[] args) {

        Integer[] list = sort(new Integer[]{1,21,80,14,3,5,11});
//        Integer[] list = sort(new Integer[]{1,15,5,7,3});
    }

    public static Integer[] sort(Integer[] list){

        Arrays.sort(list);
        Arrays.sort(list,(o1, o2) -> compareBinary(o1,o2));
//        Arrays.stream(list).forEach(integer -> System.out.print(integer + " "));
        return list;
    }

    private static int compareBinary(Integer o1, Integer o2) {
        String onesO1 = Integer.toBinaryString(o1);
        String onesO2 = Integer.toBinaryString(o2);

        int onesO1Count = Collections.frequency(Arrays.asList(onesO1.split("")),"1");
        int onesO2Count = Collections.frequency(Arrays.asList(onesO2.split("")),"1");

        if (onesO1Count == onesO2Count){
            if (onesO1.length() == onesO2.length()){
                return o1 - o2;
            }else if (onesO2.length()<onesO1.length()) {
                return 1;
            }else{
                int salida = onesO2.length() - onesO1.length();
                return salida;
            }
        }else {
            int salida = onesO2Count - onesO1Count;
            String[] sa = {new String("aaa")};
            return  salida;
        }

    }
}
