package cn.ccy.leetcode.archive_202310;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/10/26 0026 00:43:18
 * @description https://leetcode.cn/problems/count-the-digits-that-divide-a-number/?envType=daily-question&envId=2023-10-26
 */
public class CountDigits {
    public static void main(String[] args) {

    }

    public int countDigits(int num) {
        int count = 0;
        int t = num;
        while (t != 0) {
            int i = t % 10;
            if (num % i == 0) {
                count++;
            }
            t /= 10;
        }
        return count;
    }
}
