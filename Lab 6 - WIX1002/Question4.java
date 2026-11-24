public class Question4 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("GCD of (24, 8): " + gcd(24, 8));
        System.out.println("GCD of (200, 625): " + gcd(200, 625));
    }
}
