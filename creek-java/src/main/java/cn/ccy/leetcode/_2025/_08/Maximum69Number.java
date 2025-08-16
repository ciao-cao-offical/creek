package cn.ccy.leetcode._2025._08;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-69-number/?envType=daily-question&envId=2025-08-16">1323. 6 和 9 组成的最大数字</a>
 * @since 2025/8/16 21:32
 */
public class Maximum69Number {
    public static void main(String[] args) {

    }

    public int maximum69Number(int num) {
        char[] chars = Integer.toString(num).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '6') {
                chars[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(chars));
    }
}
