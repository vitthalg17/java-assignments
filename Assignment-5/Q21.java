import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MinLength {
    int value();
}

class SignupForm {
    @MinLength(4)
    private String username;

    @MinLength(8)
    private String password;

    private String city;

    SignupForm(String username, String password, String city) {
        this.username = username;
        this.password = password;
        this.city = city;
    }
}

class MinLengthChecker {
    public static boolean check(Object form) throws IllegalAccessException {
        boolean passed = true;

        for (Field field : form.getClass().getDeclaredFields()) {
            MinLength rule = field.getAnnotation(MinLength.class);
            if (rule == null) {
                continue;
            }

            field.setAccessible(true);
            String value = (String) field.get(form);

            if (value == null || value.length() < rule.value()) {
                System.out.println("  " + field.getName() + " needs at least " + rule.value() + " characters");
                passed = false;
            }
        }
        return passed;
    }
}

public class Q21 {
    public static void main(String[] args) throws IllegalAccessException {
        SignupForm good = new SignupForm("vitthal", "java@2025", "Noida");
        SignupForm bad = new SignupForm("vg", "1234", "Pune");

        System.out.println("Form 1");
        System.out.println(MinLengthChecker.check(good) ? "  Account created" : "  Signup failed");

        System.out.println("-------------------------");

        System.out.println("Form 2");
        System.out.println(MinLengthChecker.check(bad) ? "  Account created" : "  Signup failed");
    }
}
