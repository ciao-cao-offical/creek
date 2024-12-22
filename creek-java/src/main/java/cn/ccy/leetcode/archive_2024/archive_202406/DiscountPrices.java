package cn.ccy.leetcode.archive_2024.archive_202406;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/6/18 01:50:08
 * @description https://leetcode.cn/problems/apply-discount-to-prices/?envType=daily-question&envId=2024-06-18
 */
public class DiscountPrices {
    public static void main(String[] args) {

    }

    public String discountPrices(String sentence, int discount) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.charAt(0) == '$' && isNumeric(word.substring(1))) {
                double price = Long.parseLong(word.substring(1)) * (1 - discount / 100.0);
                words[i] = String.format("$%.2f", price);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(words[i]);
        }
        return sb.toString();
    }

    public boolean isNumeric(String s) {
        if (s.isEmpty()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
