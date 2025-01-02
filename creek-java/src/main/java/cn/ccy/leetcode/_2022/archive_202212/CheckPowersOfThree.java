package cn.ccy.leetcode._2022.archive_202212;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/12/9 0009
 * @description https://leetcode.cn/problems/check-if-number-is-a-sum-of-powers-of-three/
 */
public class CheckPowersOfThree {
    public static void main(String[] args) {

    }

    //【进制转换】
    public boolean checkPowersOfThree(int n) {
        while (n != 0) {
            if (n % 3 == 2) {
                return false;
            }
            n /= 3;
        }
        return true;
    }
}
