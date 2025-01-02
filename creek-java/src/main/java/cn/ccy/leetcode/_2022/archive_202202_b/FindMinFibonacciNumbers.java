package cn.ccy.leetcode._2022.archive_202202_b;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/3
 * @description https://leetcode-cn.com/problems/find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k/
 */
public class FindMinFibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(new FindMinFibonacciNumbers().findMinFibonacciNumbers(19));
    }

    public int findMinFibonacciNumbers(int k) {
        if (k == 0) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        if (k == 2) {
            return 1;
        }

        List<Integer> list = new ArrayList<>();
        //1 1 2 3 5 8 13 21 34 ...
        int a = 1, b = 1;
        list.add(a);
        list.add(b);
        while (a + b <= k) {
            int c = a + b;
            list.add(c);
            a = b;
            b = c;
        }

        int ans = 0;
        for (int i = list.size() - 1; i >= 0 && k > 0; i--) {
            Integer cur = list.get(i);
            if (k - cur >= 0) {
                k -= cur;
                ans++;
            }
        }

        return ans;
    }
}
