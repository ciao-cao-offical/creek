package cn.ccy.leetcode.archive_2022.archive_202209;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/9/9
 * @description https://leetcode.cn/problems/crawler-log-folder/
 */
public class MinOperations {
    public static void main(String[] args) {
        String[] logs = {"d1/", "d2/", "../", "d21/", "./"};
        System.out.println(new MinOperations().minOperations(logs));
    }

    public int minOperations(String[] logs) {
        int step = 0;
        for (String log : logs) {
            switch (log) {
                case "./":
                    break;

                case "../":
                    if (step > 0) {
                        step--;
                    }
                    break;

                default:
                    step++;
                    break;
            }
        }
        return step;
    }
}
