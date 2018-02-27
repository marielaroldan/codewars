public class SimpleStrandDNA {
    public static void main(String[] args) {
        String DNA = "AGGTGACACCGCAAGCCTTATATTAGC";
        System.out.println(decomposeDoubleStrand(DNA));

    }

    static final String TO_T = "T";
    static final String TO_C = "C";
    static final String TO_A = "A";
    static final String TO_G = "G";

    public static String decomposeDoubleStrand(final String doubleStrand) {

        StringBuilder result = new StringBuilder();
        String frame1 = romper(doubleStrand, 3);
        String frame2 = romper(doubleStrand, 1);
        String frame3 = romper(doubleStrand, 2);

        result.append("Frame 1: " + frame1 + "\n");
        result.append("Frame 2: " + frame2 + "\n");
        result.append("Frame 3: " + frame3 + "\n\n");

        String reverse = transform(reverse(doubleStrand));
        result.append("Reverse Frame 1: " + romper(reverse,3)+"\n");
        result.append("Reverse Frame 2: " + romper(reverse,1)+"\n");
        result.append("Reverse Frame 3: " + romper(reverse,2));
        return result.toString();
    }

    private static String transform(String dna) {
        String reversedFrame = "";
        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i)=='A') {
                reversedFrame += TO_T;
            } else if (dna.charAt(i) == 'G') {
                reversedFrame += TO_C;
            } else if (dna.charAt(i) == 'T') {
                reversedFrame += TO_A;
            } else if (dna.charAt(i)=='C'){
                reversedFrame += TO_G;
            }
        }
        return reversedFrame.trim();
    }

    private static String reverse(String dna) {
        String reverseFrame = "";
        for (int i = dna.length() - 1; i >= 0; i--) {
            reverseFrame += dna.charAt(i);
        }
        return reverseFrame.trim();
    }

    private static String romper(String dna, int split) {
        String frame = split <= 2 ? dna.substring(0, split) + " " : "";
        dna = dna.substring(split!=3?split:0);
        for (int i = 0; i < dna.length(); i += 3) {
            if (dna.length() - i <= 3 - split) {
                frame += dna.substring(i);
            } else {
                frame += dna.substring(i, i + 3) + " ";
            }
        }
        return frame.trim();
    }
}
