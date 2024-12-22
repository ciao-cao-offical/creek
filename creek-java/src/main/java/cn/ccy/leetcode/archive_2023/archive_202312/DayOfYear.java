package cn.ccy.leetcode.archive_2023.archive_202312;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/12/31 0031 17:48:55
 * @description https://leetcode.cn/problems/day-of-the-year/description/?envType=daily-question&envId=2023-12-31
 * 兔年最后一天，拜拜，新年快乐！
 */
public class DayOfYear {
    public static void main(String[] args) {

    }

    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));

        int[] amount = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            ++amount[1];
        }

        int ans = 0;
        for (int i = 0; i < month - 1; ++i) {
            ans += amount[i];
        }
        return ans + day;
    }
}
