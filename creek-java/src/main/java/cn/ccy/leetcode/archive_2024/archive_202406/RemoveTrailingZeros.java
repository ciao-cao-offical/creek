package cn.ccy.leetcode.archive_2024.archive_202406;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/6/29 20:53:53
 * @description https://leetcode.cn/problems/remove-trailing-zeros-from-a-string/?envType=daily-question&envId=2024-06-29
 */
public class RemoveTrailingZeros {
    public static void main(String[] args) {

    }

    public String removeTrailingZeros(String num) {
        char[] chars = num.toCharArray();
        int index = chars.length - 1;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != '0') {
                return num.substring(0, i + 1);
            }
        }
        return num;
    }
}
