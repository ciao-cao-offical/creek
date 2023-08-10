package cn.ccy.leetcode.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/13
 * @description https://leetcode-cn.com/problems/utf-8-validation/
 * ☆☆
 */
public class ValidUtf8 {
    private static final int MASK1 = 1 << 7;
    private static final int MASK2 = (1 << 7) + (1 << 6);

    public static void main(String[] args) {
        int[] data = {197, 130, 1};
        System.out.println(new ValidUtf8().validUtf8(data));
    }

    public boolean validUtf8(int[] data) {
        for (int i = 0; i < data.length; ) {
            int num = data[i];
            int n = getBytes(num);
            if (n < 0 || i + n > data.length) {
                return false;
            }
            for (int j = 1; j < n; j++) {
                if (!isValid(data[i + j])) {
                    return false;
                }
            }
            i += n;
        }
        return true;
    }

    private int getBytes(int num) {
        if ((num & MASK1) == 0) {
            return 1;
        }

        int n = 0;
        int mask = MASK1;
        while ((num & mask) != 0) {
            n++;
            if (n > 4) {
                return -1;
            }
            mask >>= 1;
        }

        return n >= 2 ? n : -1;
    }

    private boolean isValid(int num) {
        return (num & MASK2) == MASK1;
    }
}
