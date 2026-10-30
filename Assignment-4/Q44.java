import java.util.HashMap;
import java.util.Map;

public class Q44 {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(1001, "Ananya Sharma");
        employees.put(1002, "Rahul Verma");
        employees.put(1003, "Meera Iyer");

        employees.put(1004, "Arjun Nair");
        employees.put(1005, "Sara Khan");
        System.out.println("Employees after adding new ones : " + employees);

        System.out.println("-------------------------");

        int[] lookups = {1003, 1010};
        for (int id : lookups) {
            if (employees.containsKey(id)) {
                System.out.println("ID " + id + " exists, belongs to " + employees.get(id));
            }
            else {
                System.out.println("ID " + id + " does not exist");
            }
        }

        System.out.println("-------------------------");

        System.out.println("Iterating using keySet()");
        for (Integer id : employees.keySet()) {
            System.out.println(id + " : " + employees.get(id));
        }

        System.out.println("-------------------------");

        System.out.println("Iterating using entrySet()");
        for (Map.Entry<Integer, String> e : employees.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
