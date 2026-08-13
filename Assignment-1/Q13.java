class Defaults {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;
}

public class Q13 {
    public static void main(String args[]){
        Defaults d = new Defaults();

        System.out.println("Default Values:");
        System.out.println("byte:"+ d.b);
        System.out.println("short:"+ d.s);
        System.out.println("int:"+ d.i);
        System.out.println("long:"+ d.l);
        System.out.println("float:"+ d.f);
        System.out.println("double:"+ d.d);
        System.out.println("char:["+ d.c+ "]");
        System.out.println("boolean:"+ d.bool);

        byte b2 = 100;
        short s2 = 5000;
        int i2 = 250000;
        long l2 = 9000000000L;
        float f2 = 3.14f;
        double d2 = 12.3456;
        char c2 = 'V';
        boolean bool2 = true;

        System.out.println("Assigned Values:");
        System.out.println(b2+ " "+ s2+ " "+ i2+ " "+ l2);
        System.out.println(f2+ " "+ d2+ " "+ c2+ " "+ bool2);
    }
}
