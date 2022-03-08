package com.ciao.leetcode.archive_202203;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/7
 * @description https://leetcode-cn.com/problems/add-to-array-form-of-integer/
 */
public class AddToArrayForm {
    public static void main(String[] args) {
        int[] num = {2, 1, 5};
        int k = 806;
        System.out.println(new AddToArrayForm().addToArrayForm(num, k));
    }

    //逐位相加
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        int n = num.length;
        for (int i = n - 1; i >= 0 || k > 0; --i, k /= 10) {
            if (i >= 0) {
                k += num[i];
            }
            res.add(k % 10);
        }
        Collections.reverse(res);
        return res;
    }

    /*public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        for (int i = num.length - 1; i >= 0; i--) {
            ans.add(num[i]);
        }
        int size = ans.size();
        for (int i = 0; ; i++) {
            if (i < size) {
                ans.set(i, ans.get(i) + k % 10);

            } else {
                ans.add(k % 10);
            }

            k /= 10;
            if (k == 0) {
                break;
            }

        }
        size = ans.size();
        for (int i = 0; i < size; i++) {
            int r = ans.get(i) / 10;
            if (r != 0) {
                ans.set(i, ans.get(i) % 10);

                if (i != size - 1) {
                    ans.set(i + 1, ans.get(i + 1) + r);

                } else {
                    ans.add(r);
                }
            }
        }
        size = ans.size();
        for (int i = 0; i < size / 2; i++) {
            int temp = ans.get(i);
            ans.set(i, ans.get(size - 1 - i));
            ans.set(size - 1 - i, temp);
        }

        return ans;
    }*/
}
