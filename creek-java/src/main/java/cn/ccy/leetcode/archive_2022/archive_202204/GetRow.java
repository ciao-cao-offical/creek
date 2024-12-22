package cn.ccy.leetcode.archive_2022.archive_202204;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/20
 * @description https://leetcode-cn.com/problems/pascals-triangle-ii/
 * ☆☆ 试试【线性递推】
 */
public class GetRow {
    public static void main(String[] args) {
        int rowIndex = 3;
        System.out.println(new GetRow().getRow(rowIndex));
    }

    //递推
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            ans.add(0);
            for (int j = i; j >= 1; j--) {
                ans.set(j, ans.get(j - 1) + ans.get(j));
            }
        }
        return ans;
    }
}
