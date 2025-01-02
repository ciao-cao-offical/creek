package cn.ccy.leetcode._2023.archive_202301;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/1/1 0001 17:46:30
 * @description https://leetcode.cn/problems/first-letter-to-appear-twice/
 */
public class RepeatedCharacter {
    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(new RepeatedCharacter().repeatedCharacter(s));
    }

    //【哈希表】，下次试试【状态压缩】
    public char repeatedCharacter(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            int idx = c - 'a';
            if (count[idx] == 1) {
                return c;
            }

            count[idx]++;
        }
        return '0';
    }
}
