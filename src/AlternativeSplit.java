public class AlternativeSplit {

    public static void main(String[] args) {
//        System.out.println(encrypt("This is a test!",1));
        System.out.println(decrypt(null, 2));
    }

    public static String encrypt(final String text, final int n) {
        try{
            if (text.length() <= 0 || n <= 0) {
                return text;
            }

            String finalText = text;
            for (int i = 0; i < n; i++) {
                finalText = rotateString(finalText);
            }
            return finalText;
        }catch (NullPointerException e){
            return text;
        }
    }

    public static String decrypt(final String encryptedText, final int n) {
        try {


            if (encryptedText.length() <= 0 || n <= 0) {
                return encryptedText;
            }
            int splitIndexEncryptText = encryptedText.length() / 2;
            String text = encryptedText;
            StringBuilder finalText = new StringBuilder();
            for (int i = 0; i < n; i++) {

                String odds = text.substring(0, splitIndexEncryptText);
                String evens = text.substring(splitIndexEncryptText);

                int minLength = 0;
                if (odds.length() < evens.length()) {
                    minLength = odds.length();
                } else {
                    minLength = evens.length();
                }
                for (int j = 0; j < minLength; j++) {
                    finalText.append(evens.charAt(j));
                    finalText.append(odds.charAt(j));
                }
                if (odds.length() > evens.length()) {
                    char oddChar = odds.charAt(odds.length() - 1);
                    finalText.append(oddChar);
                } else if (odds.length() < evens.length()) {
                    char evenChar = evens.charAt(evens.length() - 1);
                    finalText.append(evenChar);
                }
                text = finalText.toString();
                finalText = new StringBuilder();
            }
            return text;
        }catch (NullPointerException e){
            return encryptedText;
        }
    }

    private static String rotateString(String text) {
        String stringA = "";
        String stringB = "";

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (i % 2 == 0) {
                stringA += letter;
            } else {
                stringB += letter;
            }
        }
        return stringB + stringA;
    }
}
