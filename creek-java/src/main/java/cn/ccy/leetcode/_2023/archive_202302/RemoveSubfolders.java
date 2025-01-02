package cn.ccy.leetcode._2023.archive_202302;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/2/8 0008 22:15:08
 * @description https://leetcode.cn/problems/remove-sub-folders-from-the-filesystem/
 */
public class RemoveSubfolders {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString("/a/b".split("/")));
        String[] folder = {"/ap/aq/ar/as", "/ap/aq/ar", "/ap/ax/ay/az", "/ap", "/ap/aq/ar/at"};
        System.out.println(new RemoveSubfolders().removeSubfolders(folder));
    }

    //排序【反证法】，有点意思呀，有时间看看【字典树】：https://leetcode.cn/problems/remove-sub-folders-from-the-filesystem/solutions/2097563/shan-chu-zi-wen-jian-jia-by-leetcode-sol-0x8d/
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> ans = new ArrayList<>();
        ans.add(folder[0]);
        for (int i = 1; i < folder.length; ++i) {
            int pre = ans.get(ans.size() - 1).length();
            if (!(pre < folder[i].length() && ans.get(ans.size() - 1).equals(folder[i].substring(0, pre)) && folder[i].charAt(pre) == '/')) {
                ans.add(folder[i]);
            }
        }
        return ans;
    }

//    以下方法，略显笨拙，但是想到了排序，有进步
/*    public List<String> removeSubfolders(String[] folder) {
        List<String> list = new ArrayList<>();
        Arrays.sort(folder, Comparator.comparingInt(String::length));
        for (int i = 0; i < folder.length; i++) {
            String cur = folder[i];
            if (cur == null) {
                continue;
            }
            folder[i] = null;
            for (int j = i + 1; j < folder.length; j++) {
                String temp = folder[j];
                if (temp == null) {
                    continue;
                }
                String pf = getParentFolder(cur, temp);
                if (pf != null) {
                    cur = pf;
                    folder[j] = null;
                }
            }
            list.add(cur);

        }
        return list;
    }

    private String getParentFolder(String folder1, String folder2) {
        int f1l = folder1.length();
        int f2l = folder2.length();
        for (int i = 0; i < Math.min(f1l, f2l); i++) {
            if (folder1.charAt(i) != folder2.charAt(i)) {
                return null;
            }
        }

        if (f1l > f2l && (folder1.charAt(f2l) == '/')) {
            return folder2;

        } else if (f1l < f2l && (folder2.charAt(f1l) == '/')) {
            return folder1;

        } else if (f1l == f2l) {
            return folder1;
        }

        return null;
    }*/
}
