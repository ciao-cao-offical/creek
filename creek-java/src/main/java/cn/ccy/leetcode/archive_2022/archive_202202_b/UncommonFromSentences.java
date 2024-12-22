package cn.ccy.leetcode.archive_2022.archive_202202_b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/30
 * @description https://leetcode-cn.com/problems/uncommon-words-from-two-sentences/
 */
public class UncommonFromSentences {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new UncommonFromSentences().uncommonFromSentences("this apple is sweet", "this apple is sour")));
    }

    public String[] uncommonFromSentences(String s1, String s2) {
        String[] split1 = s1.split(" ");
        String[] split2 = s2.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : split1) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);

            } else {
                map.put(s, 1);
            }
        }
        for (String s : split2) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);

            } else {
                map.put(s, 1);
            }
        }

        ArrayList<String> list = new ArrayList<>();
        map.forEach((key, value) -> {
            if (value == 1) {
                list.add(key);
            }
        });

        return list.toArray(new String[0]);
    }
}
