package cn.ccy.leetcode._2024.archive_202408;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/8/18 19:08:24
 * @description https://leetcode.cn/problems/student-attendance-record-i/?envType=daily-question&envId=2024-08-18
 */
public class CheckRecord {
    public static void main(String[] args) {

    }

    public boolean checkRecord(String s) {
        int absents = 0, lates = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                absents++;
                if (absents >= 2) {
                    return false;
                }
            }
            if (c == 'L') {
                lates++;
                if (lates >= 3) {
                    return false;
                }
            } else {
                lates = 0;
            }
        }
        return true;
    }
}
