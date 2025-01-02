package cn.ccy.leetcode._2022.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/25
 * @description https://leetcode-cn.com/problems/complex-number-multiplication/
 */
public class ComplexNumberMultiply {
    public static void main(String[] args) {
        System.out.println(new ComplexNumberMultiply().complexNumberMultiply("1+-1i", "1+-1i"));
    }

    public String complexNumberMultiply(String num1, String num2) {
        String[] split1 = num1.split("\\+");
        String[] split2 = num2.split("\\+");
        int a = 0;
        int b = 0;
        for (String s1 : split1) {
            String[] s1s = s1.split("i");
            int m1 = Integer.parseInt(s1s[0]);
            for (String s2 : split2) {
                String[] s2s = s2.split("i");
                int m2 = Integer.parseInt(s2s[0]);
                if (s1.contains("i") && s2.contains("i")) {
                    a = a - (m1 * m2);

                } else if (s1.contains("i") || s2.contains("i")) {
                    b = b + (m1 * m2);

                } else {
                    a = a + (m1 * m2);
                }
            }
        }
        return a + "+" + b + "i";
    }
}
