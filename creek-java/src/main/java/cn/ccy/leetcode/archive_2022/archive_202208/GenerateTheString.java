package cn.ccy.leetcode.archive_2022.archive_202208;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/8/1
 * @description https://leetcode.cn/problems/generate-a-string-with-characters-that-have-odd-counts/
 */
public class GenerateTheString {
    public static void main(String[] args) {
        System.out.println(new GenerateTheString().generateTheString(4));
    }

    //脑筋急转弯？
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if ((n & 1) == 1) {
            for (int i = 0; i < n; i++) {
                sb.append("a");
            }

        } else {
            for (int i = 0; i < n - 1; i++) {
                sb.append("a");
            }
            sb.append("b");
        }

        return sb.toString();
    }
}
