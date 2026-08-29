package exp_package2;

public class Primenumbers {

    public static boolean isPrime(int n) {
        // Numbers less than or equal to 1 are not prime
        if (n <= 1) {
            return false;
        }

        // 2 is the only even prime number
        if (n == 2) {
            return true;
        }

        // Any other even number is not prime
        if (n % 2 == 0) {
            return false;
        }

        // Check divisibility by odd numbers only, without using Math.sqrt()
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int number = 3;

        if (isPrime(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}
