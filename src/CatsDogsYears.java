import java.util.Arrays;

/**
 * Kata Task
 I have a cat and a dog.
 I got them at the same time as kitten/puppy. That was humanYears years ago.
 Return their respective ages now as [humanYears,catYears,dogYears]

 NOTES:

 humanYears >= 1
 Cat Years
 15 cat years for first year
 +9 cat years for second year
 +4 cat years for each year after that

 Dog Years
 15 dog years for first year
 +9 dog years for second year
 +5 dog years for each year after that
 */
public class CatsDogsYears {

    public static void main(String[] args) {
        Arrays.stream(humanYearsCatYearsDogYears(10)).forEach(System.out::println);

    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {

        int[] output = new int[3];
        output[0]= humanYears;
        output[1]=animalYears(humanYears,"cat");
        output[2]= animalYears(humanYears,"dog");

        return output;
    }

    private static int animalYears(int humanYears, String animal) {

        int animalYears=0;

        for (int i = 1; i <= humanYears; i++) {
            if (i==1){
                animalYears+=15;
            }else if(i==2){
                animalYears+=9;
            }else if(animal.equals("cat")){
                animalYears+=4;
            }else if(animal.equals("dog")){
                animalYears+=5;
            }
        }
        return animalYears;

    }
}
