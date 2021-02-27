public class JewelsAndStones {

    public static void main(String[] args) {

        String jewels = "aA";
        String stones = "aAAbbbb";

        System.out.println(getNumOfJewels(jewels, stones));

    }

    private static int getNumOfJewels(String J, String S){

        byte count = 0;

        for (byte i = 0; i < J.length(); i++){
            for (byte j = 0; j < S.length(); j++){
                if (J.charAt(i) == S.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }

}
