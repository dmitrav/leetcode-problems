public class JewelsAndStones {
    public static void main(String[] args) {

        byte count = 0;

        String jewels = "aA";
        String stones = "aAAbbbb";

        for (byte i = 0; i < jewels.length(); i++){
            for (byte j = 0; j < stones.length(); j++){
                if (jewels.charAt(i) == stones.charAt(j)){
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
