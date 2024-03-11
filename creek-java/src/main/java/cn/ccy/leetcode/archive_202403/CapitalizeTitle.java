package cn.ccy.leetcode.archive_202403;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/3/11 0011 22:47:04
 * @description https://leetcode.cn/problems/capitalize-the-title/?envType=daily-question&envId=2024-03-11
 */
public class CapitalizeTitle {
    public static void main(String[] args) {
        System.out.println(new CapitalizeTitle().capitalizeTitle("capiTalIze tHe titLe"));

    }

    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder(title);
        int n = title.length();
        int l = 0, r = 0;   // 单词左右边界（左闭右开）
        while (r < n) {
            while (r < n && sb.charAt(r) != ' ') {
                ++r;
            }
            // 对于每个单词按要求处理
            if (r - l > 2) {
                sb.setCharAt(l, Character.toUpperCase(sb.charAt(l)));
                ++l;
            }
            while (l < r) {
                sb.setCharAt(l, Character.toLowerCase(sb.charAt(l)));
                ++l;
            }
            l = r + 1;
            ++r;
        }
        return sb.toString();
    }

}
