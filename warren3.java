public class warren3 {
    //The prime factors o 13195 are 5, 7, 13 and 29.
    //
    //What is the largest prime factor of the number 600851475143?
    public static void main(String[] args) {
        long target = 600851475143L;
        int[] primes = Eratosthenes(Math.sqrt(target));
        int len = primes.length -1;

        int largestPrimeFactor = 0;
        
        for(int i = len; i > 1; i--) {
            if(primes[i] != 0) {
                if(target % primes[i] == 0) {
                    largestPrimeFactor = primes[i];
                    // System.out.println(primes[i]);
                }
            }
        }
        System.out.println(largestPrimeFactor);
    }

    private static int[] Eratosthenes(double n) {
        boolean[] places = new boolean[(int)n];
        int m = 0;

        for (int i = 2; i < Math.sqrt(places.length); i++) {
            for (int j = i + i; j < places.length; j+= i) {
                if(j%i == 0) {
                    places[j] = true;
                    m++;
                }
            }
        }

        int[] primes = new int[m];
        int x = 0;

        for (int i = places.length - 1; i > 0; i--) {
            if (!places[i]) {
                primes[x] = i;
                x++;
            }
        }

        return primes;
    }
}