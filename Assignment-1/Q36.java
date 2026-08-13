public class Q36 {
    public static void main(String args[]){
        int a = 10;
        int b = 5;
        int c = 2;

        System.out.println("a + b * c = "+ (a+b*c));
        System.out.println("(a + b) * c = "+ ((a+b)*c));

        System.out.println("a - b + c = "+ (a-b+c));
        System.out.println("a - (b + c) = "+ (a-(b+c)));

        System.out.println("a / b * c = "+ (a/b*c));
        System.out.println("a / (b * c) = "+ (a/(b*c)));

        System.out.println("a > b && b > c = "+ (a>b && b>c));
        System.out.println("a + b > c * 3 = "+ (a+b>c*3));

        int x = 5;
        System.out.println("x++ = "+ (x++)+ " and x = "+ x);

        int y = 5;
        System.out.println("++y = "+ (++y)+ " and y = "+ y);
    }
}
