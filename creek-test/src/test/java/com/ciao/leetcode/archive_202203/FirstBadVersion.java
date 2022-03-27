package com.ciao.leetcode.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/26 0026
 * @description https://leetcode-cn.com/problems/first-bad-version/
 */
public class FirstBadVersion extends VersionControl {
    public static void main(String[] args) {
        System.out.println(new FirstBadVersion().firstBadVersion(5));
    }

    public int firstBadVersion(int n) {
        //二分查找
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;

            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

class VersionControl {
    boolean isBadVersion(int version) {
        return version >= 4;
    }
}
