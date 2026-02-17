package cn.ccy.leetcode._2026._02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/binary-watch/?envType=daily-question&envId=2026-02-17">401. 二进制手表</a>
 * @since 2026/2/17 21:10
 */
public class ReadBinaryWatch {
    public static void main(String[] args) {

    }

    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<String>();
        for (int h = 0; h < 12; ++h) {
            for (int m = 0; m < 60; ++m) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
                    ans.add(h + ":" + (m < 10 ? "0" : "") + m);
                }
            }
        }
        return ans;
    }
}
