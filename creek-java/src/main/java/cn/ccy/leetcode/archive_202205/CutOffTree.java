package cn.ccy.leetcode.archive_202205;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/5/23 0023
 * @description https://leetcode.cn/problems/cut-off-trees-for-golf-event/
 * ☆☆☆☆☆ 试试【方法二：Dijkstra 算法】和【方法三：A* 启发式搜索算法】
 */
public class CutOffTree {
    public static void main(String[] args) {
        List<List<Integer>> forest = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(0, 0, 4), Arrays.asList(7, 6, 5));
        System.out.println(new CutOffTree().cutOffTree(forest));
    }

    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int cutOffTree(List<List<Integer>> forest) {
        int m = forest.size();
        int n = forest.get(0).size();
        List<int[]> trees = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (forest.get(i).get(j) > 1) {
                    trees.add(new int[]{i, j});
                }
            }
        }
        //将树木按照从低到高进行排序
        //todo 研究一下【Comparator.comparingInt】
        trees.sort(Comparator.comparingInt(o -> forest.get(o[0]).get(o[1])));

        //遍历每一棵树
        int ans = 0;
        int cx = 0;
        int cy = 0;
        for (int[] tree : trees) {
            int step = dfs(forest, cx, cy, tree[0], tree[1]);
            if (step == -1) {
                return -1;
            }
            ans += step;
            cx = tree[0];
            cy = tree[1];
        }
        return ans;
    }

    //广度优先搜索
    private int dfs(List<List<Integer>> forest, int sx, int sy, int tx, int ty) {
        int step = 0;
        if (sx == tx && sy == ty) {
            return step;
        }
        Queue<int[]> queue = new ArrayDeque<>();
        int m = forest.size();
        int n = forest.get(0).size();
        boolean[][] visited = new boolean[m][n];
        queue.offer(new int[]{sx, sy});
        visited[sx][sy] = true;
        while (!queue.isEmpty()) {
            step++;
            int sz = queue.size();
            for (int i = 0; i < sz; i++) {
                int[] poll = queue.poll();
                int cx = poll[0];
                int cy = poll[1];
                for (int j = 0; j < 4; j++) {
                    int nx = cx + dirs[j][0];
                    int ny = cy + dirs[j][1];
                    if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                        if (!visited[nx][ny] && forest.get(nx).get(ny) > 0) {
                            if (nx == tx && ny == ty) {
                                return step;
                            }

                            visited[nx][ny] = true;
                            queue.offer(new int[]{nx, ny});
                        }
                    }
                }
            }
        }

        return -1;
    }
}
