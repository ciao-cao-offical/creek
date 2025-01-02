package cn.ccy.leetcode._2023.archive_202310;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/10/20 22:17
 * @description https://leetcode.cn/problems/categorize-box-according-to-criteria/?envType=daily-question&envId=2023-10-20
 */
public class CategorizeBox {
    public static void main(String[] args) {

    }

    public String categorizeBox(int length, int width, int height, int mass) {
        long maxd = Math.max(length, Math.max(width, height)), vol = 1L * length * width * height;
        boolean isBulky = maxd >= 10000 || vol >= 1000000000, isHeavy = mass >= 100;
        if (isBulky && isHeavy) {
            return "Both";
        } else if (isBulky) {
            return "Bulky";
        } else if (isHeavy) {
            return "Heavy";
        } else {
            return "Neither";
        }
    }
}
