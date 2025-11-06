package function;

public class Eratosthenese {
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
