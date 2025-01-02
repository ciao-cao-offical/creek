package cn.ccy.leetcode._2024.archive_202409;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/9/14 21:57:01
 * @description https://leetcode.cn/problems/removing-stars-from-a-string/?envType=daily-question&envId=2024-09-14
 */
public class RemoveStars {
    public static void main(String[] args) {

    }

    public String removeStars(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '*') {
                res.append(c);
            } else {
                res.setLength(res.length() - 1);
            }
        }
        return res.toString();
    }
}
