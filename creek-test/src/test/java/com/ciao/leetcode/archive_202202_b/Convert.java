package com.ciao.leetcode.archive_202202_b;

import java.util.ArrayList;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/16
 * @description https://leetcode-cn.com/problems/zigzag-conversion/
 */
public class Convert {
    public static void main(String[] args) {
        System.out.println(new Convert().convert("PAYPALISHIRING", 3));
    }

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        ArrayList<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < Math.min(s.length(), numRows); i++) {
            list.add(new StringBuilder());
        }

        int curRow = 0;
        boolean goDown = false;
        for (char c : s.toCharArray()) {
            list.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) {
                goDown = !goDown;
            }
            curRow += goDown ? 1 : -1;
        }

        StringBuilder ans = new StringBuilder();
        for (StringBuilder builder : list) {
            ans.append(builder);
        }
        return ans.toString();
    }
}
