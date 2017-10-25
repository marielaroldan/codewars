package multiplesof3and5;

import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
    public static int solution(int number){
        int product = 0;
        HashSet<Integer> listOfNumbers = new HashSet<>();
        for (int i = 1; i < number ; i++) {
            if(i%3==0 && i%5==0){listOfNumbers.add(i);}
            else if (i%3==0){listOfNumbers.add(i);}
            else if (i%5==0){listOfNumbers.add(i);}
        }
        for (int i:listOfNumbers) {
            product += i;
        }
        return product;
    }
}
