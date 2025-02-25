package cn.ccy.leetcode._2025._02;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/2/25 23:37
 * @description/link https://leetcode.cn/problems/design-memory-allocator/?envType=daily-question&envId=2025-02-25
 * ☆☆☆ 2025cvd
 */
public class Allocator {
    public static void main(String[] args) {

    }

    private int n;
    private int[] memory;

    public Allocator(int n) {
        this.n = n;
        this.memory = new int[n];
    }

    public int allocate(int size, int mID) {
        int count = 0;
        for (int i = 0; i < n; ++i) {
            if (memory[i] != 0) {
                count = 0;
            } else {
                ++count;
                if (count == size) {
                    for (int j = i - count + 1; j <= i; ++j) {
                        memory[j] = mID;
                    }
                    return i - count + 1;
                }
            }
        }
        return -1;
    }

    public int freeMemory(int mID) {
        int count = 0;
        for (int i = 0; i < n; ++i) {
            if (memory[i] == mID) {
                ++count;
                memory[i] = 0;
            }
        }
        return count;
    }
}
