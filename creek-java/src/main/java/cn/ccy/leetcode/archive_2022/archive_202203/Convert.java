package cn.ccy.leetcode.archive_2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/1
 * @description https://leetcode-cn.com/problems/zigzag-conversion/
 */
public class Convert {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(new Convert().convert(s, numRows));
    }

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] builders = new StringBuilder[Math.min(s.length(), numRows)];
        for (int i = 0; i < builders.length; i++) {
            builders[i] = new StringBuilder();
        }
        char[] chars = s.toCharArray();
        int index = 0;
        boolean gd = false;
        for (char aChar : chars) {
            builders[index].append(aChar);
            if (index == 0 || index == numRows - 1) {
                gd = !gd;
            }
            index += (gd ? 1 : -1);
        }

        StringBuilder sb = new StringBuilder();
        for (StringBuilder builder : builders) {
            sb.append(builder);
        }
        return sb.toString();
    }
}
