package cn.ccy.leetcode.archive_2022.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/2
 * @description https://leetcode-cn.com/problems/add-strings/
 */
public class AddStrings {
    public static void main(String[] args) {
        String num1 = "456";
        String num2 = "77";
        System.out.println(new AddStrings().addStrings(num1, num2));
    }

    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuilder ans = new StringBuilder();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            ans.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }

        ans.reverse();
        return ans.toString();
    }
}
