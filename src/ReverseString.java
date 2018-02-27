public class ReverseString {

    public static void main(String[] args) {
        System.out.println(solution("world"));
        System.out.println(solution2("world"));
    }

    public static String solution(String str) {

        StringBuilder reverseString = new StringBuilder(str);
        reverseString.reverse();
        return reverseString.toString();
    }

    public static String solution2(String str){
        StringBuilder reverseString = new StringBuilder("");
        for (int i = str.length()-1 ; i >=0 ; i--) {
            reverseString.append(str.charAt(i));
        }
        return reverseString.toString();
    }
}
