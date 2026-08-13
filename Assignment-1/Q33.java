public class Q33 {
    public static void main(String args[]){
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = "java";

        System.out.println("s1 == s2 :"+ (s1==s2));
        System.out.println("s1.equals(s2) :"+ s1.equals(s2));

        System.out.println("s1 == s3 :"+ (s1==s3));
        System.out.println("s1.equals(s3) :"+ s1.equals(s3));

        System.out.println("s1.equals(s4) :"+ s1.equals(s4));
        System.out.println("s1.equalsIgnoreCase(s4) :"+ s1.equalsIgnoreCase(s4));
    }
}
