package cn.ccy.leetcode.archive_2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/7
 * @description https://leetcode-cn.com/problems/add-binary/
 */
public class AddBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(new AddBinary().addBinary(a, b));
    }

    public String addBinary(String a, String b) {
        if ("0".equals(a)) {
            return b;

        } else if ("0".equals(b)) {
            return a;
        }

        int al = a.length();
        int bl = b.length();
        int[] ans = new int[Math.max(al, bl) + 1];
        int len = ans.length;
        for (int i = 0; i < al; i++) {
            ans[len - 1 - i] += a.charAt(al - 1 - i) - '0';
        }
        for (int i = 0; i < bl; i++) {
            ans[len - 1 - i] += b.charAt(bl - 1 - i) - '0';
        }

        for (int i = len - 1; i >= 1; i--) {
            ans[i - 1] += ans[i] / 2;
            ans[i] %= 2;
        }

        int start = ans[0] == 0 ? 1 : 0;
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < len; i++) {
            sb.append(ans[i]);
        }

        return sb.toString();
    }
}
