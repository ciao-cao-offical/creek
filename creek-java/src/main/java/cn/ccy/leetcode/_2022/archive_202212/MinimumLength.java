package cn.ccy.leetcode._2022.archive_202212;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/12/28 0028 21:41:20
 * @description https://leetcode.cn/problems/minimum-length-of-string-after-deleting-similar-ends/
 */
public class MinimumLength {
    public static void main(String[] args) {
        String s = "aabccabba";
        System.out.println(new MinimumLength().minimumLength(s));
    }

    public int minimumLength(String s) {
        int n = s.length();
        int left = 0, right = n - 1;
        while (left < right && s.charAt(left) == s.charAt(right)) {
            char c = s.charAt(left);
            while (left <= right && s.charAt(left) == c) {
                left++;
            }
            while (left <= right && s.charAt(right) == c) {
                right--;
            }
        }
        return right - left + 1;
    }
}
