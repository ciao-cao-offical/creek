package com.ciao.leetcode;

interface VersionControl {
    int firstBadVersion(int n);
}

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/17
 * @description https://leetcode-cn.com/problems/first-bad-version/
 */
public class BadVersion implements VersionControl {

    private static final Integer badVersion = 4;

    @Override
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int mid = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;

            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean isBadVersion(int n) {
        return badVersion.equals(n);
    }
}

