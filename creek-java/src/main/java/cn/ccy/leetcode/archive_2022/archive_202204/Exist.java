package cn.ccy.leetcode.archive_2022.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/25
 * @description https://leetcode-cn.com/problems/word-search/
 */
public class Exist {
    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        System.out.println(new Exist().exist(board, word));
    }

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean check = dfs(visited, board, i, j, word, 0);
                if (check) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(boolean[][] visited, char[][] board, int i, int j, String word, int index) {
        if (board[i][j] != word.charAt(index)) {
            return false;

        } else if (index == word.length() - 1) {
            return true;
        }

        //标记当前点已访问
        visited[i][j] = true;
        int[][] dirs = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        boolean result = false;
        for (int[] dir : dirs) {
            int ni = i + dir[0];
            int nj = j + dir[1];
            if (ni >= 0 && ni < board.length && nj >= 0 && nj < board[0].length) {
                if (!visited[ni][nj]) {
                    boolean check = dfs(visited, board, ni, nj, word, index + 1);
                    if (check) {
                        result = true;
                        break;
                    }
                }
            }
        }

        //回溯
        visited[i][j] = false;
        return result;
    }
}
