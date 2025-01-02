package cn.ccy.leetcode._2025._01;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/1/1 20:26:26
 * @description https://leetcode.cn/problems/convert-date-to-binary/?envType=daily-question&envId=2025-01-01
 */
public class ConvertDateToBinary {
    public static void main(String[] args) {
        String date = "1900-01-01";
        System.out.println(new ConvertDateToBinary().convertDateToBinary(date));
    }

    // 位运算
    private String binary(int x) {
        StringBuilder s = new StringBuilder();
        for (; x != 0; x >>= 1) {
            s.append(x & 1);
        }
        return s.reverse().toString();
    }

    public String convertDateToBinary(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        return binary(year) + "-" + binary(month) + "-" + binary(day);
    }

    /*public String convertDateToBinary(String date) {
        return convert(date.substring(0, 4)) + "-" + convert(date.substring(5, 7)) + "-" + convert(date.substring(8, 10));
    }

    private String convert(String numStr) {
        StringBuffer sb = new StringBuffer();
        dfs(sb, Integer.valueOf(numStr));
        return sb.reverse().toString();
    }

    private void dfs(StringBuffer sb, Integer num) {
        int remainder = num % 2;
        sb.append(remainder);

        int quotient = num / 2;
        if (quotient != 0) {
            dfs(sb, quotient);
        }
    }*/
}

