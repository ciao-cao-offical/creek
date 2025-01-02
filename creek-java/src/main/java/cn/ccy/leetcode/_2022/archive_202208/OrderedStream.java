package cn.ccy.leetcode._2022.archive_202208;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/8/16 0016
 * @description https://leetcode.cn/problems/design-an-ordered-stream/
 */
public class OrderedStream {
    public static void main(String[] args) {

    }

    String[] stream;
    int ptr;

    public OrderedStream(int n) {
        stream = new String[n + 1];
        ptr = 1;
    }

    public List<String> insert(int idKey, String value) {
        stream[idKey] = value;
        List<String> list = new ArrayList<>();
        while (ptr < stream.length && stream[ptr] != null) {
            list.add(stream[ptr++]);
        }
        return list;
    }
}
