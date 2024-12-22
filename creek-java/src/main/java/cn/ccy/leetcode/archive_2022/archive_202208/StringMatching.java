package cn.ccy.leetcode.archive_2022.archive_202208;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/8/6 0006
 * @description https://leetcode.cn/problems/string-matching-in-an-array/
 */
public class StringMatching {
    public static void main(String[] args) {
        String[] words = {"mass", "as", "hero", "superhero"};
        System.out.println(new StringMatching().stringMatching(words));
    }

    //模拟
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    res.add(words[i]);
                    break;
                }
            }
        }
        return res;
    }
}
