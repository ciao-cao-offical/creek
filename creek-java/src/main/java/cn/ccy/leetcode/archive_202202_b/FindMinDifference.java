package cn.ccy.leetcode.archive_202202_b;

import java.util.Collections;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/18
 * @description https://leetcode-cn.com/problems/minimum-time-difference/solution/zui-xiao-shi-jian-chai-by-leetcode-solut-xolj/
 */
public class FindMinDifference {
    public static void main(String[] args) {
        FindMinDifference findMinDifference = new FindMinDifference();
        System.out.println(findMinDifference.getMinutes("23:59"));
        System.out.println('1' - '0');
    }

    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        if (n > 1440) {
            return 0;
        }
        Collections.sort(timePoints);
        int ans = Integer.MAX_VALUE;
        int t0Minutes = getMinutes(timePoints.get(0));
        int preMinutes = t0Minutes;
        for (int i = 1; i < n; ++i) {
            int minutes = getMinutes(timePoints.get(i));
            ans = Math.min(ans, minutes - preMinutes); // 相邻时间的时间差
            preMinutes = minutes;
        }
        ans = Math.min(ans, t0Minutes + 1440 - preMinutes); // 首尾时间的时间差
        return ans;
    }

    //"23:59"
    public int getMinutes(String t) {
        return ((t.charAt(0) - '0') * 10 + (t.charAt(1) - '0')) * 60 + (t.charAt(3) - '0') * 10 + (t.charAt(4) - '0');
    }
}
