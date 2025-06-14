package cn.ccy.leetcode._2025._06;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-difference-by-remapping-a-digit/?envType=daily-question&envId=2025-06-14">2566. 替换一个数字后的最大差值</a>
 * @since 2025/6/14 19:57
 */
public class MinMaxDifference {
    public static void main(String[] args) {
        System.out.println(new MinMaxDifference().minMaxDifference(00));
    }

    public int minMaxDifference(int num) {
        String numStr = String.valueOf(num);
        StringBuilder max = new StringBuilder();
        StringBuilder min = new StringBuilder();
        char[] chars = numStr.toCharArray();
        char maxChangeChar = '0';
        for (char c : chars) {
            if (c != '9') {
                maxChangeChar = c;
                break;
            }
        }
        char minChangeChar = '0';
        for (char c : chars) {
            if (c != 0) {
                minChangeChar = c;
                break;
            }
        }
        for (char aChar : chars) {
            if (aChar == maxChangeChar) {
                max.append(9);
            } else {
                max.append(aChar);
            }

            if (aChar == minChangeChar) {
                min.append(0);
            } else {
                min.append(aChar);
            }

        }

        return Integer.parseInt(max.toString()) - Integer.parseInt(min.toString());
    }
}
