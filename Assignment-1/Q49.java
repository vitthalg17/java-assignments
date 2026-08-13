public class Q49 {
    public static void change(String s){
        s = s+ " Changed";
        System.out.println("Inside method:"+ s);
    }

    public static void main(String args[]){
        String name = "Vitthal";

        System.out.println("Before method:"+ name);
        change(name);
        System.out.println("After method:"+ name);

        String a = "Java";
        String b = a;
        a = a+ " Program";

        System.out.println("a:"+ a);
        System.out.println("b:"+ b);

        String d = a.replace("Java", "Python");
        System.out.println("a after replace:"+ a);
        System.out.println("d:"+ d);
    }
}
