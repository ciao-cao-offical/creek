package cn.ccy.leetcode._2022.archive_202203;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/6
 * @description https://baike.uu.163.com/scholar/
 */
public class GoodDaysToRobBank {
    public static void main(String[] args) {
        int[] security = {5, 3, 3, 3, 5, 6, 2};
        int time = 2;
        System.out.println(new GoodDaysToRobBank().goodDaysToRobBank(security, time));
    }

    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int len = security.length;
        List<Integer> ans = new ArrayList<>();
        if (len < (2 * time + 1)) {
            return new ArrayList<>();
        }

        int[] left = new int[len];
        int[] right = new int[len];
        for (int i = 1; i < len; i++) {
            if (security[i] <= security[i - 1]) {
                left[i] = left[i - 1] + 1;
            }

            if (security[len - i - 1] <= security[len - i]) {
                right[len - i - 1] = right[len - i] + 1;
            }
        }

        for (int i = time; i < len - time; i++) {
            if (left[i] >= time && right[i] >= time) {
                ans.add(i);
            }
        }

        return ans;
    }
}
