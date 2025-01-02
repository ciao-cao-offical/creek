package cn.ccy.leetcode._2023.archive_202307;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/7/24 0024 00:11:33
 * @description https://leetcode.cn/problems/jewels-and-stones/
 */
public class NumJewelsInStones {
    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        System.out.println(new NumJewelsInStones().numJewelsInStones(jewels, stones));
    }

    public int numJewelsInStones(String jewels, String stones) {
        char[] jewelsArray = jewels.toCharArray();
        int count = 0;
        for (char stone : stones.toCharArray()) {
            for (char jewel : jewelsArray) {
                if (stone == jewel) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
