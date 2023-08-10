package cn.ccy.leetcode.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/7
 * @description https://leetcode-cn.com/problems/base-7/
 */
public class ConvertToBase7 {
    public static void main(String[] args) {
        int num = -7;
        System.out.println(new ConvertToBase7().convertToBase7(num));
    }

    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        boolean isNegative = false;
        if (num < 0) {
            isNegative = true;
            num = -num;
        }
        while (true) {
            sb.append(num % 7);
            num /= 7;

            if (num == 0) {
                break;
            }
        }
        if (isNegative) {
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}
