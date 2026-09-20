import java.util.Calendar;
import java.util.Date;

public class Q26 {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Date object gives : " + now);

        System.out.println("-------------------------");

        Calendar cal = Calendar.getInstance();

        System.out.println("Day of month : " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Month        : " + (cal.get(Calendar.MONTH) + 1));
        System.out.println("Year         : " + cal.get(Calendar.YEAR));
        System.out.println("Hour         : " + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute       : " + cal.get(Calendar.MINUTE));
        System.out.println("Second       : " + cal.get(Calendar.SECOND));
    }
}
