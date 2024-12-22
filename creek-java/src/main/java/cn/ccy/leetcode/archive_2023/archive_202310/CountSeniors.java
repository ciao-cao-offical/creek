package cn.ccy.leetcode.archive_2023.archive_202310;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/10/23 0023 01:22:11
 * @description https://leetcode.cn/problems/number-of-senior-citizens/?envType=daily-question&envId=2023-10-23
 */
public class CountSeniors {
    public static void main(String[] args) {

    }

    public int countSeniors(String[] details) {
        int count = 0;
        for (String detail : details) {
            int age = Integer.parseInt(detail.substring(11, 13));
            if (age > 60) {
                count++;
            }
        }
        return count;
    }
}
