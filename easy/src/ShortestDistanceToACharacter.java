import java.util.ArrayList;
import java.util.Arrays;

public class ShortestDistanceToACharacter {
    public static void main(String[] args) {

        String input = "loveleetcode";
        char c = 'e';

        long startTime = System.nanoTime();

        System.out.println(Arrays.toString(getArrayOfShortestDistances(input, c)));

        long endTime = System.nanoTime();
        System.out.println((endTime-startTime) / 1000000. + " ms");

    }

    private static int[] getArrayOfShortestDistances(String inputString, char c){
        /* Faster than ~30%, less memory than ~75%. */


        ArrayList<Integer> indexes = new ArrayList<>();
        // find all the positions of a character
        for(int i = 0; i < inputString.length(); i++){
            if(inputString.charAt(i) == c){
                indexes.add(i);
            }
        }

        int[] shortestIndexes = new int[inputString.length()];

        for(int i = 0; i < inputString.length(); i++){

            int shortestDistance = inputString.length();
            // find minimum distance from current position to any of the character indexes
            for (Integer index : indexes) {
                if (Math.abs(i - index) < shortestDistance) {
                    shortestDistance = Math.abs(i - index);
                }
            }
            shortestIndexes[i] = shortestDistance;
        }

        return shortestIndexes;
    }
}
