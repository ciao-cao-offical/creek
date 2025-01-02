package cn.ccy.leetcode._2022.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/29 0029
 * @description https://leetcode-cn.com/problems/construct-quad-tree/
 * ☆☆☆ 试试【递归 + 二维前缀和优化】
 */
public class Construct {
    public static void main(String[] args) {
        int[][] grid = {{0, 1}, {1, 0}};
        System.out.println(new Construct().construct(grid));
    }

    private int[][] grid;

    public Node construct(int[][] grid) {
        this.grid = grid;
        int m = grid.length;
        return dfs(0, 0, m - 1, m - 1);
    }

    private Node dfs(int ltm, int ltn, int rbm, int rbn) {
        boolean isSame = true;
        int flag = grid[ltm][ltn];
        for (int i = ltm; i <= rbm && isSame; i++) {
            for (int j = ltn; j <= rbn; j++) {
                if (flag != grid[i][j]) {
                    isSame = false;
                    break;
                }
            }
        }

        if (isSame) {
            return new Node(flag == 1, true);
        }
        Node root = new Node(flag == 1, false);
        int md = rbm - ltm + 1;
        int nd = rbn - ltn + 1;
        root.topLeft = dfs(ltm, ltn, ltm + md / 2 - 1, ltn + nd / 2 - 1);
        root.topRight = dfs(ltm, ltn + nd / 2, ltm + md / 2 - 1, rbn);
        root.bottomLeft = dfs(ltm + md / 2, ltn, rbm, ltn + nd / 2 - 1);
        root.bottomRight = dfs(ltm + md / 2, ltn + nd / 2, rbm, rbn);
        return root;
    }
}

class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;


    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
};
