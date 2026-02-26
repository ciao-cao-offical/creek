package cn.ccy.leetcode._2026._02;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/?envType=daily-question&envId=2026-02-26">1404. 将二进制表示减到 1 的步骤数</a>
 * @since 2026/2/26 23:34
 */
public class NumSteps {
    public static void main(String[] args) {

    }

    public int numSteps(String s) {
        int steps = 0;
        StringBuilder sb = new StringBuilder(s);

        while (!sb.toString().equals("1")) {
            ++steps;
            if (sb.charAt(sb.length() - 1) == '0') {
                // 偶数的情况
                sb.deleteCharAt(sb.length() - 1);
            } else {
                // 第一步：找出最低位的 0
                // 第二步：把这个 0 变成 1，并将后面所有的 1 变成 0，这样就实现了 +1
                // 特别地，如果 s 中全是 1，那么会有额外的进位
                for (int i = sb.length() - 1; i >= 0; --i) {
                    if (sb.charAt(i) == '1') {
                        sb.setCharAt(i, '0');
                        if (i == 0) {
                            sb.insert(0, '1');
                            break;
                        }
                    } else {
                        sb.setCharAt(i, '1');
                        break;
                    }
                }
            }
        }
        return steps;
    }
}
