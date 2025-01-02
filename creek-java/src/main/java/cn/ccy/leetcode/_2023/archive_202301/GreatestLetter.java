package cn.ccy.leetcode._2023.archive_202301;

/**
 * @author Chengyin
 * @version v 1.0.0
 * @date 2023/1/27
 * @description https://leetcode.cn/problems/greatest-english-letter-in-upper-and-lower-case/
 * 试试官方答案的位运算记录方式...
 */
public class GreatestLetter {
    public static void main(String[] args) {
        String s = "lEeTcOdE";
        System.out.println(new GreatestLetter().greatestLetter(s));

    }

    public String greatestLetter(String s) {
        Character res = null;
        int[] small = new int[26];
        int[] capital = new int[26];
        for (char c : s.toCharArray()) {
            int gap;
            boolean isSmall = true;
            if ('a' <= c && 'z' >= c) {
                gap = c - 'a';
                small[gap] = 1;

            } else {
                gap = c - 'A';
                capital[gap] = 1;
                isSmall = false;
            }

            if (small[gap] == 1 && capital[gap] == 1) {
                if (isSmall) {
                    c = (char) ('A' + gap);
                }

                if (res == null || c > res) {
                    res = c;
                }
            }
        }
        return res == null ? "" : String.valueOf(res);
    }

//    public String greatestLetter(String s) {
//        int lower = 0, upper = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (Character.isLowerCase(c)) {
//                lower |= 1 << (c - 'a');
//            } else {
//                upper |= 1 << (c - 'A');
//            }
//        }
//        for (int i = 25; i >= 0; i--) {
//            if ((lower & upper & (1 << i)) != 0) {
//                return String.valueOf((char) ('A' + i));
//            }
//        }
//        return "";
//    }

}
