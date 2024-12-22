package cn.ccy.leetcode.archive_2023.archive_202302;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/2/23 0023 23:26:49
 * @description https://leetcode.cn/problems/gray-code/
 */
public class GrayCode {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(new GrayCode().grayCode(n));
    }

    //【归纳法】，看题解看懂了，好像是懂了...https://leetcode.cn/problems/gray-code/solutions/13637/gray-code-jing-xiang-fan-she-fa-by-jyd/
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(0);

        int head = 1;
        for (int i = 0; i < n; i++) {
            for (int j = res.size() - 1; j >= 0; j--) {
                res.add(head + res.get(j));
            }

            head <<= 1;
        }

        return res;
    }
}
