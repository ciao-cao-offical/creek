package com.ciao.leetcode.archive_202205;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/5/22 0022
 * @description https://leetcode.cn/problems/can-i-win/
 * ☆☆☆【位运算】标记法
 */
public class CanIWin {
    public static void main(String[] args) {
        System.out.println(new CanIWin().canIWin(10, 11));
    }

    //记忆
    Map<Integer, Boolean> memo = new HashMap<>();

    //记忆化搜索 + 状态压缩
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if ((1 + maxChoosableInteger) * maxChoosableInteger / 2 < desiredTotal) {
            return false;
        }
        return dfs(maxChoosableInteger, 0, desiredTotal, 0);
    }

    private boolean dfs(int maxChoosableInteger, int useNumbers, int desiredTotal, int currentTotal) {
        if (!memo.containsKey(useNumbers)) {
            boolean res = false;
            for (int i = 0; i < maxChoosableInteger; i++) {
                if (((useNumbers >> i) & 1) == 0) {
                    if (currentTotal + i + 1 >= desiredTotal) {
                        res = true;
                        break;

                    } else if (!dfs(maxChoosableInteger, useNumbers | (1 << i), desiredTotal, currentTotal + 1 + i)) {
                        res = true;
                        break;
                    }
                }
            }
            memo.put(useNumbers, res);
        }

        return memo.get(useNumbers);
    }
}
