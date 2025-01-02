package cn.ccy.leetcode._2023.archive_202304;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/4/17 15:42
 * @description https://leetcode.cn/problems/count-days-spent-together/
 */
public class CountDaysTogether {
    public static void main(String[] args) {
        String arriveAlice = "10-01", leaveAlice = "10-31", arriveBob = "11-01", leaveBob = "12-31";
        System.out.println(new CountDaysTogether().countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }

    private static int[] daysMap = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int arriveAliceDay = getDay(arriveAlice);
        int leaveAliceDay = getDay(leaveAlice);
        int arriveBobDay = getDay(arriveBob);
        int leaveBobDay = getDay(leaveBob);

        if (leaveAliceDay < arriveBobDay || arriveAliceDay > leaveBobDay) {
            return 0;
        }

        return Math.min(leaveAliceDay, leaveBobDay) - Math.max(arriveAliceDay, arriveBobDay) + 1;
    }

    private static int getDay(String dateStr) {
        String[] split = dateStr.split("-");
        int days = 0;
        for (int i = 0; i < Integer.parseInt(split[0]) - 1; i++) {
            days += daysMap[i];
        }
        days += Integer.parseInt(split[1]);
        return days;
    }
}
