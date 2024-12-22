package cn.ccy.leetcode.archive_2022.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/26
 * @description https://leetcode-cn.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
 */
public class FreqAlphabets {
    public static void main(String[] args) {
        System.out.println(new FreqAlphabets().freqAlphabets("10#11#12"));
    }

    public String freqAlphabets(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; ) {
            if (i + 2 < len && chars[i + 2] == '#') {
                sb.append((char) ((chars[i] - '0') * 10 + (chars[i + 1] - '1') + 'a'));
                i += 3;

            } else {
                sb.append((char) (chars[i] - '1' + 'a'));
                i++;
            }
        }
        return sb.toString();
    }
}
