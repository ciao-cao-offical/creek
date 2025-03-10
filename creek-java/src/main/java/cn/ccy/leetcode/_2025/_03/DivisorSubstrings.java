package cn.ccy.leetcode._2025._03;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-the-k-beauty-of-a-number/?envType=daily-question&envId=2025-03-10">2269. 找到一个数字的 K 美丽值</a>
 * @since 2025/3/10 22:26
 */
public class DivisorSubstrings {
    public static void main(String[] args) {
        System.out.println(new DivisorSubstrings().divisorSubstrings(240, 2));
    }

    public int divisorSubstrings(int num, int k) {
        int count = 0;
        String numStr = String.valueOf(num);
        for (int i = 0; i + k <= numStr.length(); i++) {
            String subStr = numStr.substring(i, i + k);
            int sub = Integer.parseInt(subStr);
            if (sub == 0) {
                continue;
            }

            if (num % sub == 0) {
                count++;
            }
        }

        return count;
    }
}
