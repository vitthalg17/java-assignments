public class Q12 {
    public static void main(String args[]){
        String s1 = "Hello";
        System.out.println("s1:"+ s1);

        s1.concat(" World");
        System.out.println("s1 after concat:"+ s1);

        String s2 = s1.concat(" World");
        System.out.println("s2:"+ s2);

        s1.toUpperCase();
        System.out.println("s1 after toUpperCase:"+ s1);

        String s3 = "Hello";
        System.out.println("s1 == s3 :"+ (s1==s3));
        System.out.println("s1 == s2 :"+ (s1==s2));
    }
}
