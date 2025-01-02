package cn.ccy.leetcode._2023.archive_202303;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/2 0002 22:41:40
 * @description https://leetcode.cn/problems/bianry-number-to-string-lcci/
 */
public class PrintBin {
    public static void main(String[] args) {
        double num = 0.625;
        System.out.println(new PrintBin().printBin(num));
    }

    //至多循环六次的这个答案我是没看懂，😂，有机会再回来看看
    // 【灵茶山艾府】https://leetcode.cn/problems/bianry-number-to-string-lcci/solutions/2141577/zheng-ming-zhi-duo-xun-huan-6-ci-pythonj-b6sj/
    public String printBin(double num) {
        StringBuilder sb = new StringBuilder("0.");
        while (num != 0) {
            if (sb.length() >= 32) {
                return "ERROR";
            }
            int quo = (int) (num * 2);
            num = num * 2 % 1;
            sb.append(quo);
        }

        return sb.toString();
    }
}
