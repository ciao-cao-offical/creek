package cn.ccy.leetcode.archive_202204;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/1
 * @description https://leetcode-cn.com/problems/binary-watch/
 * 试试【二进制枚举】
 */
public class ReadBinaryWatch {
    public static void main(String[] args) {
        System.out.println(new ReadBinaryWatch().readBinaryWatch(1));
    }

    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
                    ans.add(String.format("%d:%02d", h, m));
                }
            }
        }
        return ans;
    }
}
