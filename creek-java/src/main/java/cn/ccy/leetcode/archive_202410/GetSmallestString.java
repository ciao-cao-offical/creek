package cn.ccy.leetcode.archive_202410;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/30 01:05:09
 * @description https://leetcode.cn/problems/lexicographically-smallest-string-after-a-swap/?envType=daily-question&envId=2024-10-30
 */
public class GetSmallestString {
    public static void main(String[] args) {

    }

    public String getSmallestString(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i + 1 < arr.length; i++) {
            if (arr[i] > arr[i + 1] && arr[i] % 2 == arr[i + 1] % 2) {
                char temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                break;
            }
        }
        return new String(arr);
    }
}
