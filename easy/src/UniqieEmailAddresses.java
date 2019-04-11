import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniqieEmailAddresses {

    public static void main(String[] args) {

//        String[] testSet = {"test.email+alex@leetcode.com",
//                            "test.e.mail+bob.cathy@leetcode.com",
//                            "testemail+david@lee.tcode.com"};

//        String[] testSet = {"test.email+alex@leetcode.com",
//                            "test.email.leet+alex@code.com"};

        String[] testSet = {"test.email+alex@leetcode.com",
                            "test.email@leetcode.com"};


        long startTime = System.nanoTime();
        System.out.println(getItFaster(testSet));

        System.out.println("Elapsed time " + ((System.nanoTime() - startTime) / 1000000.) + " ms");

    }

    private static int getNumberOfUniqueEmails(String[] emails){
        /* Faster than 50%, 50% less memory */


        HashSet<String> uniqueEmails = new HashSet<>();

        for(byte i = 0; i < emails.length; i++){

            String transformedEmail = emails[i].split("@")[0].split("\\+")[0].replace(".", "") +
                    "@" + emails[i].split("@")[1];

            uniqueEmails.add(transformedEmail);
        }

        return uniqueEmails.size();

    }

    private static int getItFaster(String[] emails){
        /* Faster than 99%, 78% less memory */

        Set<String> set = new HashSet<>();
        for(String email : emails) {
            StringBuilder sb = new StringBuilder();
            for(char c: email.toCharArray()) {
                if (c == '.') continue;
                if (c == '+') break;
                if (c == '@') break;
                sb.append(c);
            }
            String cur = sb.toString() + email.substring(email.indexOf('@'));
            System.out.println(cur);
            set.add(cur);
        }
        return set.size();

    }
}
