import java.util.HashSet;

public class UniqueMorseCodeWords {

    private static String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    private static char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void main(String[] args) {

        String[] inputWords = {"gin", "zen", "gig", "msg"};

        long startTime = System.nanoTime();

        System.out.println(getNumberOfUniqueTransformations(inputWords));

        long endTime = System.nanoTime();

        System.out.println((endTime-startTime) / 1000000. + " ms");

    }

    private static int getNumberOfUniqueTransformations(String[] inputWords){
        /* 90% faster than other Java solutions, but ~37 Mbs which is bad! */


        HashSet<String> uniqueTransformations = new HashSet<>();

        for (String word: inputWords) {

            StringBuilder transformation = new StringBuilder();
            for (char c: word.toCharArray()) {
                for (byte i = 0; i < letters.length; i++){
                    if (c == letters[i]){
                        transformation.append(morseCode[i]);
                        break;
                    }
                }
            }
//            System.out.println(transformation);
            uniqueTransformations.add(transformation.toString());
        }

        return uniqueTransformations.size();
    }

}
