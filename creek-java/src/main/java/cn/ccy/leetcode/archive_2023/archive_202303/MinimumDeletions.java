package cn.ccy.leetcode.archive_2023.archive_202303;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/6 0006 23:31:08
 * @description https://leetcode.cn/problems/minimum-deletions-to-make-string-balanced/
 */
public class MinimumDeletions {
    public static void main(String[] args) {

    }

    //前后缀分解（两次遍历），yyds，参考自https://leetcode.cn/problems/minimum-deletions-to-make-string-balanced/solutions/2149746/qian-hou-zhui-fen-jie-yi-zhang-tu-miao-d-dor2/
    public int minimumDeletions(String s) {
        char[] chars = s.toCharArray();
        int del = 0;
        //统计'a'的个数
        for (char c : chars) {
            del += ('b' - c);
        }

        //操作数，初始化为'a'的个数
        int ans = del;
        for (char c : chars) {
            //妙啊！
            del += (c - 'a') * 2 - 1;
            ans = Math.min(ans, del);
        }
        return ans;
    }
}
