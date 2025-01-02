package cn.ccy.leetcode._2022.archive_202206;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/6/30
 * @description https://leetcode.cn/problems/prime-arrangements/
 */
public class NumPrimeArrangements {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(new NumPrimeArrangements().numPrimeArrangements(n));
    }

    private static final Integer MOD = 1000000007;

    public int numPrimeArrangements(int n) {
        if (n == 1) {
            return 1;
        }

        int primeNum = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                primeNum++;
            }
        }
        return (int) (factional(primeNum) * factional(n - primeNum) % MOD);
    }

    private long factional(int num) {
        long total = 1;
        for (int i = 1; i <= num; i++) {
            total = total * i;
            total = total % MOD;
        }
        return total;
    }

    private boolean isPrime(int i) {
        if (i == 1) {
            return false;
        }

        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                return false;
            }
        }

        return true;
    }
}
