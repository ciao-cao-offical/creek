package cn.ccy.leetcode._2025._03;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/adding-spaces-to-a-string/?envType=daily-question&envId=2025-03-30">2109. 向字符串添加空格</a>
 * @since 2025/3/30 22:31
 */
public class AddSpaces {
    public static void main(String[] args) {

    }

    public String addSpaces(String s, int[] spaces) {
        StringBuilder ans = new StringBuilder(s.length() + spaces.length);
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < spaces.length && spaces[j] == i) {
                ans.append(' ');
                j++;
            }
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}
