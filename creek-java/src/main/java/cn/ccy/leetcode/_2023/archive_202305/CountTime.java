package cn.ccy.leetcode._2023.archive_202305;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/5/9 23:09
 * @description https://leetcode.cn/problems/number-of-valid-clock-times/
 */
public class CountTime {
    public static void main(String[] args) {

    }

    int res = 0;

    public int countTime(String time) {
        char[] arr = time.toCharArray();
        dfs(arr, 0);
        return res;
    }

    public void dfs(char[] arr, int pos) {
        if (pos == arr.length) {
            if (check(arr)) {
                res++;
            }
            return;
        }
        if (arr[pos] == '?') {
            for (int i = 0; i <= 9; i++) {
                arr[pos] = (char) ('0' + i);
                dfs(arr, pos + 1);
                arr[pos] = '?';
            }
        } else {
            dfs(arr, pos + 1);
        }
    }

    public boolean check(char[] arr) {
        int hh = (arr[0] - '0') * 10 + arr[1] - '0';
        int mm = (arr[3] - '0') * 10 + arr[4] - '0';
        return hh < 24 && mm < 60;
    }
}
