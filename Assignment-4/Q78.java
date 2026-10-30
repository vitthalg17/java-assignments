import java.util.HashMap;
import java.util.Map;

class Bank {
    private Map<String, Double> accounts = new HashMap<>();

    public void openAccount(String id, double amount) {
        if (accounts.containsKey(id)) {
            System.out.println("Account " + id + " already exists");
            return;
        }
        accounts.put(id, amount);
        System.out.println("Opened account " + id + " with Rs." + amount);
    }

    public void deposit(String id, double amount) {
        if (!accounts.containsKey(id)) {
            System.out.println("No account " + id);
            return;
        }
        accounts.put(id, accounts.get(id) + amount);
        System.out.println("Deposited Rs." + amount + " in " + id + ", balance Rs." + accounts.get(id));
    }

    public void withdraw(String id, double amount) {
        if (!accounts.containsKey(id)) {
            System.out.println("No account " + id);
            return;
        }
        if (accounts.get(id) < amount) {
            System.out.println("Cannot withdraw Rs." + amount + " from " + id + ", balance is only Rs." + accounts.get(id));
            return;
        }
        accounts.put(id, accounts.get(id) - amount);
        System.out.println("Withdrew Rs." + amount + " from " + id + ", balance Rs." + accounts.get(id));
    }

    public void transfer(String from, String to, double amount) {
        if (!accounts.containsKey(from) || !accounts.containsKey(to)) {
            System.out.println("Transfer failed, account not found");
            return;
        }
        if (accounts.get(from) < amount) {
            System.out.println("Transfer of Rs." + amount + " from " + from + " failed, not enough balance");
            return;
        }
        accounts.put(from, accounts.get(from) - amount);
        accounts.put(to, accounts.get(to) + amount);
        System.out.println("Transferred Rs." + amount + " from " + from + " to " + to);
    }

    public void printStatement() {
        System.out.println("-------------------------");
        for (Map.Entry<String, Double> e : accounts.entrySet()) {
            System.out.println("  " + e.getKey() + " : Rs." + e.getValue());
        }
        System.out.println("-------------------------");
    }
}

public class Q78 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.openAccount("CUST101", 5000);
        bank.openAccount("CUST102", 12000);
        bank.openAccount("CUST103", 800);
        bank.openAccount("CUST101", 100);
        bank.printStatement();

        bank.deposit("CUST103", 1200);
        bank.withdraw("CUST101", 1500);
        bank.withdraw("CUST103", 5000);
        bank.transfer("CUST102", "CUST101", 4000);
        bank.transfer("CUST103", "CUST102", 9000);
        bank.deposit("CUST999", 100);
        bank.printStatement();
    }
}
