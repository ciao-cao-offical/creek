package com.ciao.leetcode.archive_202305;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/5/17 0017 23:56:42
 * @description https://leetcode.cn/problems/determine-if-two-events-have-conflict/description/
 */
public class HaveConflict {
    public static void main(String[] args) {

    }

    public boolean haveConflict(String[] event1, String[] event2) {
        return !(event1[1].compareTo(event2[0]) < 0 || event2[1].compareTo(event1[0]) < 0);
    }
}
