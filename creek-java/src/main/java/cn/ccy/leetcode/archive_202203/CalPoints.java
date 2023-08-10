package cn.ccy.leetcode.archive_202203;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/26 0026
 * @description https://leetcode-cn.com/problems/baseball-game/
 */
public class CalPoints {
    public static void main(String[] args) {
        String[] ops = {"5", "2", "C", "D", "+"};
        System.out.println(new CalPoints().calPoints(ops));
    }

    public int calPoints(String[] ops) {
        List<Integer> nums = new ArrayList<>();
        int ans = 0;
        for (String op : ops) {
            int size = nums.size();
            if ("C".equals(op)) {
                ans -= nums.get(size - 1);
                nums.remove(size - 1);

            } else if ("D".equals(op)) {
                int lastOneDouble = nums.get(size - 1) * 2;
                ans += lastOneDouble;
                nums.add(lastOneDouble);

            } else if ("+".equals(op)) {
                int lastTwnItemSum = nums.get(size - 1) + nums.get(size - 2);
                ans += lastTwnItemSum;
                nums.add(lastTwnItemSum);

            } else {
                int num = Integer.parseInt(op);
                ans += num;
                nums.add(num);
            }
        }
        return ans;
    }
}
