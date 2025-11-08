// 142913828922
public class warren10 {
    // Summation of Primes
    // The sum of the primes below 10 is 2+3+5+7 = 17.
    //
    // Find the sum of all the primes below two million.

    public static void main(String[] args) {
        int target = 2000000;
        int[] primes = Eratosthenes(target);
        long sum = 0;
        for(int i = 0; i < primes.length; i++) {
            sum += primes[i];
        }
        System.out.println(sum);
    }

    private static int[] Eratosthenes(int n) {
        boolean[] places = new boolean[n + 1];
        int m = 0;

        for(int i=2; i*i <=n; i++) {
            for(int j = i*i; j <=n; j +=i) {
                if(j%i == 0 && !places[j]) {
                    places[j] = true;
                    m++;
                }
            }
        }

        int[] primes = new int[n - m + 2];
        int x = 0;

        for(int i = 2; i <= n; i++) {
            if(!places[i]) {
                primes[x] = i;
                x++;
            }
        }

        return primes;
    }
}
