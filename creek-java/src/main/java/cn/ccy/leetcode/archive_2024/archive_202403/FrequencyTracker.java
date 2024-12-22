package cn.ccy.leetcode.archive_2024.archive_202403;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/3/21 0021 00:08:43
 * @description https://leetcode.cn/problems/frequency-tracker/description/?envType=daily-question&envId=2024-03-21
 */
public class FrequencyTracker {
    public static void main(String[] args) {

    }
    
    private static final int N = 100001;
    private int[] freq;
    private int[] freqCnt;

    public FrequencyTracker() {
        freq = new int[N];
        freqCnt = new int[N];
    }

    public void add(int number) {
        --freqCnt[freq[number]];
        ++freq[number];
        ++freqCnt[freq[number]];
    }

    public void deleteOne(int number) {
        if (freq[number] == 0) {
            return;
        }
        --freqCnt[freq[number]];
        --freq[number];
        ++freqCnt[freq[number]];
    }

    public boolean hasFrequency(int frequency) {
        return freqCnt[frequency] > 0;
    }
}
