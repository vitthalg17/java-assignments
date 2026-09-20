import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q27 {
    public static void main(String[] args) {
        String rule = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(rule);

        String[] entries = {
            "vitthal.goel@amity.edu",
            "lighthouse_keeper99@mail.co.in",
            "no-at-sign.com",
            "two@@dots.com",
            "missing@domain",
            "spaced mail@gmail.com"
        };

        System.out.println("Checking the entries of a workshop registration form");
        System.out.println("-------------------------");

        for (int i = 0; i < entries.length; i++) {
            Matcher matcher = pattern.matcher(entries[i]);

            if (matcher.matches()) {
                System.out.println("VALID   : " + entries[i]);
            }
            else {
                System.out.println("INVALID : " + entries[i]);
            }
        }
    }
}
