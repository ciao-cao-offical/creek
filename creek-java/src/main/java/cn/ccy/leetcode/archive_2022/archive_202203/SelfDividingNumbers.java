package cn.ccy.leetcode.archive_2022.archive_202203;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/31
 * @description https://leetcode-cn.com/problems/self-dividing-numbers/
 * 试试【打表+二分】和【打表+哈希表】-【宫水三叶】
 */
public class SelfDividingNumbers {
    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        System.out.println(new SelfDividingNumbers().selfDividingNumbers(left, right));
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int temp = i;
            while (temp != 0) {
                int part = temp % 10;
                if (part == 0 || i % part != 0) {
                    break;
                }

                temp /= 10;
            }

            if (temp == 0) {
                ans.add(i);
            }
        }
        return ans;
    }
}
