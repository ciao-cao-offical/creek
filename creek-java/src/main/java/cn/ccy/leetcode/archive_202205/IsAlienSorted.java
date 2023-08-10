package cn.ccy.leetcode.archive_202205;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/5/17 0017
 * @description https://leetcode.cn/problems/verifying-an-alien-dictionary/
 */
public class IsAlienSorted {
    public static void main(String[] args) {
        String[] words = {"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.println(new IsAlienSorted().isAlienSorted(words, order));
    }

    //直接遍历
    public boolean isAlienSorted(String[] words, String order) {
        int[] dir = new int[26];
        char[] chars = order.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            dir[chars[i] - 'a'] = i;
        }
        A:
        for (int i = 0; i < words.length - 1; i++) {
            String w1 = words[i];
            String w2 = words[i + 1];
            int minLen = Math.min(w1.length(), w2.length());
            for (int j = 0; j < minLen; j++) {
                if (w1.charAt(j) != w2.charAt(j)) {
                    if (dir[w1.charAt(j) - 'a'] > dir[w2.charAt(j) - 'a']) {
                        return false;

                    } else {
                        continue A;
                    }
                }
            }

            if (w1.length() > w2.length()) {
                return false;
            }
        }
        return true;
    }
}
