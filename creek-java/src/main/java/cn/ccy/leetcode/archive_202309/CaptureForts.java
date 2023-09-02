package cn.ccy.leetcode.archive_202309;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/9/2 0002 22:19:41
 * @description https://leetcode.cn/problems/maximum-enemy-forts-that-can-be-captured/?envType=daily-question&envId=2023-09-02
 */
public class CaptureForts {
    public static void main(String[] args) {
        int[] forts = {-1, 0, -1, 0, 1, 1, 1, -1, -1, -1};
        System.out.println(new CaptureForts().captureForts(forts));
    }

    /* 官解方法
    public int captureForts(int[] forts) {
        int n = forts.length;
        int ans = 0, pre = -1;
        for (int i = 0; i < n; i++) {
            if (forts[i] == 1 || forts[i] == -1) {
                if (pre >= 0 && forts[i] != forts[pre]) {
                    ans = Math.max(ans, i - pre - 1);
                }
                pre = i;
            }
        }
        return ans;
    }*/

    public int captureForts(int[] forts) {
        int count = 0;
        for (int i = 0; i < forts.length; i++) {
            int sum = 0;
            if (forts[i] == 1 || forts[i] == -1) {
                int start = forts[i];
                while (++i <= forts.length - 1) {
                    if (forts[i] == 0) {
                        sum++;

                    } else if (forts[i] == start) {
                        i--;
                        break;

                    } else if (forts[i] == -start) {
                        count = Math.max(count, sum);
                        i--;
                        break;
                    }
                }
            }
        }

        return count;
    }
}
