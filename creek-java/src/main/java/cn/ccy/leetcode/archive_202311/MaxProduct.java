package cn.ccy.leetcode.archive_202311;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/11/6 0006 00:17:15
 * @description https://leetcode.cn/problems/maximum-product-of-word-lengths/?envType=daily-question&envId=2023-11-06
 */
public class MaxProduct {
    public static void main(String[] args) {

    }

    // 位运算
    public int maxProduct(String[] words) {
        int length = words.length;
        int[] masks = new int[length];
        for (int i = 0; i < length; i++) {
            String word = words[i];
            int wordLength = word.length();
            for (int j = 0; j < wordLength; j++) {
                masks[i] |= 1 << (word.charAt(j) - 'a');
            }
        }
        int maxProd = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if ((masks[i] & masks[j]) == 0) {
                    maxProd = Math.max(maxProd, words[i].length() * words[j].length());
                }
            }
        }
        return maxProd;
    }
}
