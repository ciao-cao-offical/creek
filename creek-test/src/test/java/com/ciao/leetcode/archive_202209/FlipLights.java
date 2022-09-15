package com.ciao.leetcode.archive_202209;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/9/15
 * @description https://leetcode.cn/problems/bulb-switcher-ii/
 * ⭐️⭐️⭐️ b2t
 * 试试【宫水三叶】：https://leetcode.cn/problems/bulb-switcher-ii/solution/by-ac_oier-3ttx/
 */
public class FlipLights {
    public static void main(String[] args) {
        System.out.println(new FlipLights().flipLights(2, 1));
    }

    //降低【降低搜索空间】有点复杂，没太看懂 😂
    public int flipLights(int n, int presses) {
        Set<Integer> seen = new HashSet<Integer>();
        for (int i = 0; i < 1 << 4; i++) {
            int[] pressArr = new int[4];
            for (int j = 0; j < 4; j++) {
                pressArr[j] = (i >> j) & 1;
            }
            int sum = Arrays.stream(pressArr).sum();
            if (sum % 2 == presses % 2 && sum <= presses) {
                int status = pressArr[0] ^ pressArr[1] ^ pressArr[3];
                if (n >= 2) {
                    status |= (pressArr[0] ^ pressArr[1]) << 1;
                }
                if (n >= 3) {
                    status |= (pressArr[0] ^ pressArr[2]) << 2;
                }
                if (n >= 4) {
                    status |= (pressArr[0] ^ pressArr[1] ^ pressArr[3]) << 3;
                }
                seen.add(status);
            }
        }
        return seen.size();
    }

    /*
    以下实现方式运行超时...
    Set<String> set = new HashSet<>();
    int[] lights;

    public int flipLights(int n, int presses) {
        lights = new int[n];
        Arrays.fill(lights, 0);
        dfs(presses);
        return set.size();
    }

    private void dfs(int presses) {
        if (presses == 0) {
            set.add(Arrays.toString(lights));
            return;
        }

        for (int i = 1; i <= 4; i++) {
            int[] temp = Arrays.copyOf(lights, lights.length);

            pressBtn(i);
            dfs(presses - 1);

            //恢复
            lights = temp;
        }
    }

    private void pressBtn(int i) {
        if (i == 1) {
            for (int j = 1; j <= lights.length; j++) {
                reverse(j);
            }
        } else if (i == 2) {
            for (int j = 1; j < lights.length; j++) {
                if ((j & 1) == 0) {
                    reverse(j);
                }
            }

        } else if (i == 3) {
            for (int j = 1; j < lights.length; j++) {
                if ((j & 1) == 1) {
                    reverse(j);
                }
            }

        } else if (i == 4) {
            for (int j = 1; (3 * j + 1) < lights.length; j++) {
                reverse(3 * j + 1);
            }
        }
    }

    private void reverse(int j) {
        if (lights[j - 1] == 1) {
            lights[j - 1] = 0;

        } else {
            lights[j - 1] = 1;
        }
    }*/
}
