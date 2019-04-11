public class Test {
    public static void main(String[] args) {


        String testStr = "test.email+alex@leetcode.com";

        System.out.println(testStr.split("@")[1]);
        System.out.println(testStr.split("#")[0]);

    }
}
