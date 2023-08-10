package cn.ccy.leetcode.archive_202210;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/10/3 0003
 * @description https://leetcode.cn/problems/check-if-binary-string-has-at-most-one-segment-of-ones/
 */
public class CheckOnesSegment {
    public static void main(String[] args) {
        String s = "110";
        System.out.println(new CheckOnesSegment().checkOnesSegment(s));
    }

    public boolean checkOnesSegment(String s) {
        boolean conti = true;
        for (char c : s.toCharArray()) {
            if (c == '0' && conti) {
                conti = false;

            } else if (c == '1' && !conti) {
                return false;
            }
        }
        return true;
    }
}
