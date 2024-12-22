package cn.ccy.leetcode.archive_2022.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/26
 * @description https://leetcode-cn.com/problems/verifying-an-alien-dictionary/
 */
public class IsAlienSorted {
    public static void main(String[] args) {
        String[] words = {"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.println(new IsAlienSorted().isAlienSorted(words, order));
    }

    public boolean isAlienSorted(String[] words, String order) {
        int[] dir = new int[26];
        char[] chars = order.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            dir[chars[i] - 'a'] = i;
        }

        int len = words.length;
        A:
        for (int i = 0; i < len; i++) {
            if (i + 1 < len) {
                String w1 = words[i];
                String w2 = words[i + 1];
                int min = Math.min(w1.length(), w2.length());
                for (int j = 0; j < min; j++) {
                    if (w1.charAt(j) != w2.charAt(j)) {
                        if (dir[w1.charAt(j) - 'a'] > dir[w2.charAt(j) - 'a']) {
                            return false;
                        }
                        continue A;

                    }
                }
                if (w1.length() > w2.length()) {
                    return false;
                }
            }

        }

        return true;
    }
}
