package cn.ccy.leetcode._2025._07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/remove-sub-folders-from-the-filesystem/?envType=daily-question&envId=2025-07-19">1233. 删除子文件夹</a>
 * @since 2025/7/19 11:54
 */
public class RemoveSubfolders {
    public static void main(String[] args) {

    }

    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> ans = new ArrayList<String>();
        ans.add(folder[0]);
        for (int i = 1; i < folder.length; ++i) {
            int pre = ans.get(ans.size() - 1).length();
            if (!(pre < folder[i].length() && ans.get(ans.size() - 1).equals(folder[i].substring(0, pre)) && folder[i].charAt(pre) == '/')) {
                ans.add(folder[i]);
            }
        }
        return ans;
    }
}
