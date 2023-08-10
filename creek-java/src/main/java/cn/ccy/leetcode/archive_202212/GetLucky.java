package cn.ccy.leetcode.archive_202212;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/12/15 0015 22:20:34
 * @description https://leetcode.cn/problems/sum-of-digits-of-string-after-convert/description/
 */
public class GetLucky {
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 2;
        System.out.println(new GetLucky().getLucky(s, k));
    }

    public int getLucky(String s, int k) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int loc = s.charAt(i) - 'a' + 1;
            while (loc > 0) {
                res += loc % 10;
                loc /= 10;
            }
        }

        for (int i = 1; i < k; i++) {
            int temp = 0;
            while (res > 0) {
                temp += res % 10;
                res /= 10;
            }
            res = temp;
        }

        return res;
    }
}
