package cn.ccy.leetcode._2025._01;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/1/11 23:21:24
 * @description https://leetcode.cn/problems/find-the-key-of-the-numbers/?envType=daily-question&envId=2025-01-11
 */
public class GenerateKey {
    public static void main(String[] args) {

    }

    public int generateKey(int num1, int num2, int num3) {
        int key = 0;
        for (int p = 1; num1 > 0 && num2 > 0 && num3 > 0; p *= 10) {
            key += Math.min(Math.min(num1 % 10, num2 % 10), num3 % 10) * p;
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
        }
        return key;
    }
}
