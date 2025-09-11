package cn.ccy.leetcode._2025._09;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/sort-vowels-in-a-string/?envType=daily-question&envId=2025-09-11">2785. 将字符串中的元音字母排序</a>
 * @since 2025/9/11 23:01
 */
public class SortVowels {
    public static void main(String[] args) {

    }

    private static final Set<Character> vowels = new HashSet<>(Arrays.asList(
            'a', 'e', 'i', 'o', 'u',
            'A', 'E', 'I', 'O', 'U'
    ));

    public String sortVowels(String s) {
        List<Character> tmp = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            if (vowels.contains(ch)) {
                tmp.add(ch);
            }
        }

        Collections.sort(tmp);

        char[] arr = s.toCharArray();
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (vowels.contains(arr[i])) {
                arr[i] = tmp.get(idx++);
            }
        }

        return new String(arr);
    }
}
