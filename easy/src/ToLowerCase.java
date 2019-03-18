public class ToLowerCase {

    public static void main(String[] args) {



        String test = "dakgSDG Dklag ADgl \\\\N gdSK a ga #@% 53 dSGS GS $W6 SDG";


        long startTime = System.nanoTime();

        System.out.println(elegantToLowerCase(test));

        long endTime = System.nanoTime();

        System.out.println((endTime-startTime) / 1000000. + " ms");
    }

    private static String elegantToLowerCase(String s){

        StringBuilder lowerCaseString = new StringBuilder();

        for (char c: s.toCharArray()){
            if (c >= 'A' && c <='Z'){
                c = (char) (c+32);
            }
            lowerCaseString.append(c);
        }

        return lowerCaseString.toString();
    }



    private static String monstrousToLowerCase(String s){

        StringBuilder lowerCaseString = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {

            switch (s.charAt(i)){
                case 'A':
                    lowerCaseString.append("a");
                    break;
                case 'B':
                    lowerCaseString.append("b");
                    break;
                case 'C':
                    lowerCaseString.append("c");
                    break;
                case 'D':
                    lowerCaseString.append("d");
                    break;
                case 'E':
                    lowerCaseString.append("e");
                    break;
                case 'F':
                    lowerCaseString.append("f");
                    break;
                case 'G':
                    lowerCaseString.append("g");
                    break;
                case 'H':
                    lowerCaseString.append("h");
                    break;
                case 'I':
                    lowerCaseString.append("i");
                    break;
                case 'J':
                    lowerCaseString.append("j");
                    break;
                case 'K':
                    lowerCaseString.append("k");
                    break;
                case 'L':
                    lowerCaseString.append("l");
                    break;
                case 'M':
                    lowerCaseString.append("m");
                    break;
                case 'N':
                    lowerCaseString.append("n");
                    break;
                case 'O':
                    lowerCaseString.append("o");
                    break;
                case 'P':
                    lowerCaseString.append("p");
                    break;
                case 'Q':
                    lowerCaseString.append("q");
                    break;
                case 'R':
                    lowerCaseString.append("r");
                    break;
                case 'S':
                    lowerCaseString.append("s");
                    break;
                case 'T':
                    lowerCaseString.append("t");
                    break;
                case 'U':
                    lowerCaseString.append("u");
                    break;
                case 'V':
                    lowerCaseString.append("v");
                    break;
                case 'W':
                    lowerCaseString.append("w");
                    break;
                case 'X':
                    lowerCaseString.append("x");
                    break;
                case 'Y':
                    lowerCaseString.append("y");
                    break;
                case 'Z':
                    lowerCaseString.append("z");
                    break;
                default:
                    lowerCaseString.append(s.charAt(i));
                    break;
            }
        }

        return lowerCaseString.toString();
    }
}
