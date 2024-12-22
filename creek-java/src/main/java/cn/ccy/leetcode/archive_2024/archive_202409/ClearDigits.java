package cn.ccy.leetcode.archive_2024.archive_202409;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/9/5 00:04:42
 * @description https://leetcode.cn/problems/clear-digits/?envType=daily-question&envId=2024-09-05
 */
public class ClearDigits {
    public static void main(String[] args) {
        String str = "cb34";
        System.out.println(new ClearDigits().clearDigits(str));
    }

    public String clearDigits(String s) {
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if ('0' <= array[i] && array[i] <= '9') {
                array[i] = '/';
                if (i >= 1) {
                    for (int j = i - 1; j >= 0; j--) {
                        if ((array[j] < '0' || array[j] > '9') && array[j] != '/') {
                            array[j] = '/';
                            break;
                        }
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : array) {
            if (c != '/') {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
