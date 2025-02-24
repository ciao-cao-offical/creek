package cn.ccy.leetcode._2025._02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/2/24 23:11
 * @description/link https://leetcode.cn/problems/design-an-ordered-stream/?envType=daily-question&envId=2025-02-24
 */
public class OrderedStream {
    public static void main(String[] args) {

    }

    private String[] stream;
    private int ptr;

    public OrderedStream(int n) {
        stream = new String[n + 1];
        ptr = 1;
    }

    public List<String> insert(int idKey, String value) {
        stream[idKey] = value;
        List<String> res = new ArrayList<String>();
        while (ptr < stream.length && stream[ptr] != null) {
            res.add(stream[ptr]);
            ++ptr;
        }
        return res;
    }
}
