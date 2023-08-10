package cn.ccy.leetcode.archive_202301;

/**
 * @author Chengyin
 * @version v 1.0.0
 * @date 2023/1/29
 * @description https://leetcode.cn/problems/count-asterisks/
 */
public class CountAsterisks {
    public static void main(String[] args) {
        String s = "l|*e*et|c**o|*de|";
        System.out.println(new CountAsterisks().countAsterisks(s));
    }

    public int countAsterisks(String s) {
        int flag = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '|') {
                ++flag;
                continue;
            }

            if (c == '*' && (flag & 1) == 0) {
                ++count;
            }
        }
        return count;
    }
}
