/*
Description:

Count the number of prime numbers less than a non-negative number, n.
 */
public class CountPrimes {

    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 1; i * i < n; ++i) {
            if (isPrime[i]) {
                for (int j = i; i * j < n; ++j) {
                    isPrime[i * j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; ++i) {
            count += isPrime[i] ? 1 : 0;
        }
        return count;
    }

}
