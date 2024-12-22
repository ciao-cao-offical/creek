package cn.ccy.leetcode.archive_2022.archive_202204;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/24
 * @description https://leetcode-cn.com/problems/flower-planting-with-no-adjacent/
 */
public class GardenNoAdj {
    public static void main(String[] args) {
        int n = 3;
        int[][] paths = {{1, 2}, {2, 3}, {3, 1}};
        System.out.println(Arrays.toString(new GardenNoAdj().gardenNoAdj(n, paths)));
    }

    //染色问题
    public int[] gardenNoAdj(int n, int[][] paths) {
        int[] ans = new int[n];
        //初始化图 key：花园id；value：和当前花园相连的其他花园
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<>());
        }
        //画出花园相连关系
        for (int[] path : paths) {
            int a = path[0];
            int b = path[1];
            map.get(a).add(b);
            map.get(b).add(a);
        }

        for (int i = 0; i < n; i++) {
            //颜色标记 由于花的颜色是从1开始的，所以此处申请5个标记位，只使用后面4个来标记哪个颜色已经被使用
            boolean[] flag = new boolean[5];
            for (int gardenId : map.get(i + 1)) {
                if (ans[gardenId - 1] != 0) {
                    //标记颜色已经被使用
                    flag[ans[gardenId - 1]] = true;
                }
            }

            //遍历标记，第一个未被使用的颜色即为当前花园颜色
            for (int j = 1; j < 5; j++) {
                if (!flag[j]) {
                    ans[i] = j;
                }
            }
        }
        return ans;
    }
}
