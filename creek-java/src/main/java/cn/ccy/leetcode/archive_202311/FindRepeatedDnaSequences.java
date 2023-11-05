package cn.ccy.leetcode.archive_202311;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/11/5 0005 22:52:37
 * @description https://leetcode.cn/problems/repeated-dna-sequences/?envType=daily-question&envId=2023-11-05
 * ☆☆☆ 2023b2t https://leetcode.cn/problems/repeated-dna-sequences/solutions/1035568/zhong-fu-de-dnaxu-lie-by-leetcode-soluti-z8zn/?envType=daily-question&envId=2023-11-05
 */
public class FindRepeatedDnaSequences {
    public static void main(String[] args) {

    }

    static final int L = 10;

    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<String>();
        Map<String, Integer> cnt = new HashMap<String, Integer>();
        int n = s.length();
        for (int i = 0; i <= n - L; ++i) {
            String sub = s.substring(i, i + L);
            cnt.put(sub, cnt.getOrDefault(sub, 0) + 1);
            if (cnt.get(sub) == 2) {
                ans.add(sub);
            }
        }
        return ans;
    }
}
