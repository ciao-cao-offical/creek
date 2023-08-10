package cn.ccy.leetcode.archive_202204;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/7
 * @description https://leetcode-cn.com/problems/max-submatrix-lcci/
 * ☆☆☆☆☆ cv
 */
public class GetMaxMatrix {
    public static void main(String[] args) {
        int[][] matrix =
                {
                        {-1, 0},
                        {0, -1}
                };
        System.out.println(Arrays.toString(new GetMaxMatrix().getMaxMatrix(matrix)));
    }

    //降维 将多行列拍扁，二维降维成为一维
    //思路来源：
    // https://leetcode-cn.com/problems/max-submatrix-lcci/solution/zhe-yao-cong-zui-da-zi-xu-he-shuo-qi-you-jian-dao-/
    public int[] getMaxMatrix(int[][] matrix) {
        //行
        int m = matrix.length;
        //列
        int n = matrix[0].length;
        //最大矩阵和
        int maxSum = Integer.MIN_VALUE;
        //备选矩阵左上角坐标
        int cr1 = 0;
        int cc1 = 0;
        //最终答案左上+右下坐标
        int[] ans = new int[4];
        //当前列的和
        int[] b = new int[n];
        //按照行 自上而下扫描
        for (int i = 0; i < m; i++) {
            //最上层行变化以后，需清空b，重新计算
            for (int j = 0; j < n; j++) {
                b[j] = 0;
            }

            //从最上层行开始，依次遍历每一种矩阵组合<矩阵上边界不变，从上向下，从左向右，向外拓展>
            for (int j = i; j < m; j++) {
                //步骤矩阵和
                int stepSum = 0;
                for (int k = 0; k < n; k++) {
                    b[k] += matrix[j][k];
                    //当stepSum大于0时，加上至当前坐标值
                    if (stepSum > 0) {
                        stepSum += b[k];

                    } else {
                        //当stepSum小于等于0时，加上当前坐标值只会让矩阵和与当前坐标值相比相等或更小，
                        // 不如另起起点（左上角）
                        stepSum = b[k];
                        //临时保存新左上角坐标
                        cr1 = i;
                        cc1 = k;
                    }

                    //若当前步骤矩阵和大于当前最大矩阵和，则更新结果
                    if (stepSum > maxSum) {
                        maxSum = stepSum;
                        ans[0] = cr1;
                        ans[1] = cc1;
                        ans[2] = j;
                        ans[3] = k;
                    }
                }
            }
        }

        return ans;
    }
}
