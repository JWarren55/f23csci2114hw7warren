public class warren7 {
    // 10,001st Prime
    // By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
    // we can see that the 6th prime is 13.
    //
    // What is the 10,001st prime number?

    public static void main(String[] args) {
        int primeNumber = 10001;
        int number = 2;
        int i = 2;
        while(i <= primeNumber) {
            number++;
            if(isPrime(number)) {
                i++;
            }
        }
        System.out.println(number);
    }

    static boolean isPrime(int n) {
        // base case
        if (n <= 1) {
            return false;
        }

        // Check for odd number
        if(n%2 == 0) {
            return false;
        }

        // Check from 2 to n-1
        for (int i = 3; i < n; i+=2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
