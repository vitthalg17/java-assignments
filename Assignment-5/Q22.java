import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ClassInfo {
    String author();
    String version() default "1.0";
    String date() default "unknown";
}

@ClassInfo(author = "Vitthal Goel", version = "2.3", date = "2026-10-30")
class WeatherApp {
    void forecast() {
        System.out.println("Tomorrow : Sunny, 31 C");
    }
}

@ClassInfo(author = "Riya Mehta")
class NotesApp {
    void save() {
        System.out.println("Note saved");
    }
}

class PlainApp {
}

public class Q22 {
    static void printInfo(Class<?> c) {
        System.out.println("Class : " + c.getSimpleName());

        if (c.isAnnotationPresent(ClassInfo.class)) {
            ClassInfo info = c.getAnnotation(ClassInfo.class);
            System.out.println("  Author  : " + info.author());
            System.out.println("  Version : " + info.version());
            System.out.println("  Date    : " + info.date());
        }
        else {
            System.out.println("  No @ClassInfo found on this class");
        }
    }

    public static void main(String[] args) {
        printInfo(WeatherApp.class);
        System.out.println("-------------------------");
        printInfo(NotesApp.class);
        System.out.println("-------------------------");
        printInfo(PlainApp.class);
    }
}
