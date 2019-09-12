public class RobotReturnToOrigin {

    private static boolean judgeCircle(String moves) {
        /* 15% faster than other Java solutions, but 100% less memory usage! */

        int sideStep = 0;
        int frontStep = 0;

        for (int i = 0; i < moves.length(); i++) {

            if (moves.charAt(i) == 'L') {
                sideStep++;
                continue;
            } else if (moves.charAt(i) == 'R') {
                sideStep--;
                continue;
            }

            if (moves.charAt(i) == 'U') {
                frontStep++;
            } else if (moves.charAt(i) == 'D') {
                frontStep--;
            }
        }

        return sideStep == 0 & frontStep == 0;

    }

    private static boolean judgeCircleFaster(String moves) {
        /* 77% faster than other Java solutions,  100% less memory usage! */

        int stepOff = 0;

        char[] symbols = moves.toCharArray();

        for (char symbol : symbols) {

            if (symbol == 'L') {
                stepOff++;
                continue;
            } else if (symbol == 'R') {
                stepOff--;
                continue;
            }

            if (symbol == 'U') {
                stepOff += 2;
            } else if (symbol == 'D') {
                stepOff -= 2;
            }
        }

        return stepOff == 0;

    }

    public static void main(String[] args) {

        String moves = "LRUDLRUD";

//        System.out.println(judgeCircle(moves));
        System.out.println(judgeCircleFaster(moves));

    }
}
