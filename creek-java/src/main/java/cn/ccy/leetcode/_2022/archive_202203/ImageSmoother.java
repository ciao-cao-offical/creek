package cn.ccy.leetcode._2022.archive_202203;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/24
 * @description https://leetcode-cn.com/problems/image-smoother/
 */
public class ImageSmoother {
    public static void main(String[] args) {
        int[][] img = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        System.out.println(Arrays.deepToString(new ImageSmoother().imageSmoother(img)));
    }

    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        if (m == 1 && n == 1) {
            return img;
        }

        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = img[i][j];
                int count = 1;

                // i-1,j-1
                if (i - 1 >= 0 && j - 1 >= 0) {
                    sum += img[i - 1][j - 1];
                    count++;
                }
                // i-1,j
                if (i - 1 >= 0) {
                    sum += img[i - 1][j];
                    count++;
                }
                // i-1,j+1
                if (i - 1 >= 0 && j + 1 < n) {
                    sum += img[i - 1][j + 1];
                    count++;
                }
                // i,j-1
                if (j - 1 >= 0) {
                    sum += img[i][j - 1];
                    count++;
                }
                // i,j+1
                if (j + 1 < n) {
                    sum += img[i][j + 1];
                    count++;
                }
                // i+1,j-1
                if (i + 1 < m && j - 1 >= 0) {
                    sum += img[i + 1][j - 1];
                    count++;
                }
                // i+1,j
                if (i + 1 < m) {
                    sum += img[i + 1][j];
                    count++;
                }
                // i+1,j+1
                if (i + 1 < m && j + 1 < n) {
                    sum += img[i + 1][j + 1];
                    count++;
                }

                ans[i][j] = sum / count;
            }
        }
        return ans;
    }
}
