public class Question6 {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int divisor = 2; divisor <= number / divisor; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }

    public static boolean isPalindromicPrime(int number) {
        return isPrime(number) && number == reverseNumber(number);
    }

    public static boolean isEmirp(int number) {
        int reversed = reverseNumber(number);
        return isPrime(number) && number != reversed && isPrime(reversed);
    }

    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        System.out.println("First 20 palindromic primes:");
        while (count < 20) {
            if (isPalindromicPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }

        System.out.println("\n\nFirst 20 emirps:");
        count = 0;
        number = 2;
        while (count < 20) {
            if (isEmirp(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
        System.out.println();
    }
}
