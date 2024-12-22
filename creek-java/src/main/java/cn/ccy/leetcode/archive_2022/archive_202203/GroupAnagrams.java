package cn.ccy.leetcode.archive_2022.archive_202203;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/13
 * @description https://leetcode-cn.com/problems/group-anagrams/
 */
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(new GroupAnagrams().groupAnagrams(strs));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            List<String> list = map.getOrDefault(new String(chars), new ArrayList<>());
            list.add(str);
            map.put(new String(chars), list);
        }

        return new ArrayList<>(map.values());
    }
}
