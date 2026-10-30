import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Length {
    int min() default 0;
    int max() default Integer.MAX_VALUE;
    String message() default "length is out of range";
}

class Tweet {
    @Length(min = 3, max = 15, message = "handle must be 3 to 15 characters")
    String handle;

    @Length(min = 1, max = 280, message = "tweet must be 1 to 280 characters")
    String text;

    Tweet(String handle, String text) {
        this.handle = handle;
        this.text = text;
    }
}

class LengthValidator {
    public static boolean validate(Object obj) throws IllegalAccessException {
        boolean valid = true;

        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Length.class)) {
                Length rule = field.getAnnotation(Length.class);
                field.setAccessible(true);
                String value = (String) field.get(obj);
                int len = (value == null) ? 0 : value.length();

                if (len < rule.min() || len > rule.max()) {
                    System.out.println("  FAIL " + field.getName() + " (" + len + " chars) : " + rule.message());
                    valid = false;
                }
                else {
                    System.out.println("  OK   " + field.getName() + " (" + len + " chars)");
                }
            }
        }
        return valid;
    }
}

public class Q17 {
    public static void main(String[] args) throws IllegalAccessException {
        Tweet[] tweets = {
            new Tweet("vitthal_g", "Finished my Java annotations assignment!"),
            new Tweet("vg", "Hello world"),
            new Tweet("the_longest_handle_ever", ""),
        };

        for (Tweet t : tweets) {
            System.out.println("Checking tweet by @" + t.handle);
            boolean ok = LengthValidator.validate(t);
            System.out.println(ok ? "Tweet posted" : "Tweet rejected");
            System.out.println("-------------------------");
        }
    }
}
