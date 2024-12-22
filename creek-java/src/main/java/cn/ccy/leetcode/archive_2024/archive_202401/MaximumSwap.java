package cn.ccy.leetcode.archive_2024.archive_202401;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/1/22 0022 00:19:09
 * @description https://leetcode.cn/problems/maximum-swap/description/?envType=daily-question&envId=2024-01-22
 */
public class MaximumSwap {
    public static void main(String[] args) {

    }

    public int maximumSwap(int num) {
        char[] charArray = String.valueOf(num).toCharArray();
        int n = charArray.length;
        int maxNum = num;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(charArray, i, j);
                maxNum = Math.max(maxNum, Integer.parseInt(new String(charArray)));
                swap(charArray, i, j);
            }
        }
        return maxNum;
    }

    public void swap(char[] charArray, int i, int j) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }
}
