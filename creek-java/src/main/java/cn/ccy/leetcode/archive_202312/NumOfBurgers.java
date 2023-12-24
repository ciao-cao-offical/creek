package cn.ccy.leetcode.archive_202312;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/12/25 0025 00:25:09
 * @description https://leetcode.cn/problems/number-of-burgers-with-no-waste-of-ingredients/?envType=daily-question&envId=2023-12-25
 */
public class NumOfBurgers {
    public static void main(String[] args) {

    }

    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        if (tomatoSlices % 2 != 0 || tomatoSlices < cheeseSlices * 2 || cheeseSlices * 4 < tomatoSlices) {
            return new ArrayList<>();
        }
        List<Integer> ans = new ArrayList<Integer>();
        ans.add(tomatoSlices / 2 - cheeseSlices);
        ans.add(cheeseSlices * 2 - tomatoSlices / 2);
        return ans;
    }
}
