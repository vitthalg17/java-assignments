public class Q25 {
    public static void main(String[] args) {
        System.out.println("Weather station report made with java.lang.Math");
        System.out.println("-------------------------");

        double rainfall = Math.random() * 50;
        System.out.println("Math.random() -> rainfall recorded : " + rainfall + " mm");

        int morning = 9;
        int night = 17;
        System.out.println("Math.abs()    -> temperature swing : " + Math.abs(morning - night) + " degrees");

        double side = 12;
        System.out.println("Math.pow()    -> volume of a " + (int) side + " m tank cube : " + Math.pow(side, 3) + " cubic metre");
    }
}
