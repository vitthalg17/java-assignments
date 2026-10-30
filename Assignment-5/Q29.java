import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {
    String label() default "";
}

class ReportService {
    @LogExecutionTime(label = "Monthly sales report")
    public void generateSalesReport() throws InterruptedException {
        Thread.sleep(400);
    }

    @LogExecutionTime
    public void sendEmails() throws InterruptedException {
        Thread.sleep(250);
    }

    @LogExecutionTime(label = "Sum of first 10 million numbers")
    public void crunchNumbers() {
        long sum = 0;
        for (int i = 1; i <= 10000000; i++) {
            sum = sum + i;
        }
        System.out.println("  sum = " + sum);
    }

    public void cleanUp() {
        System.out.println("  cleaning temp files");
    }
}

class TimingRunner {
    public static void runAll(Object target) throws Exception {
        for (Method m : target.getClass().getDeclaredMethods()) {
            LogExecutionTime log = m.getAnnotation(LogExecutionTime.class);
            String name = (log == null || log.label().isEmpty()) ? m.getName() : log.label();

            System.out.println("Running " + name);
            long start = System.currentTimeMillis();
            m.invoke(target);
            long end = System.currentTimeMillis();

            if (log != null) {
                System.out.println("  [LOG] " + name + " took " + (end - start) + " ms");
            }
        }
    }
}

public class Q29 {
    public static void main(String[] args) throws Exception {
        TimingRunner.runAll(new ReportService());
        System.out.println("-------------------------");
        System.out.println("Only methods marked with @LogExecutionTime have their time logged");
    }
}
