package cn.ccy.leetcode.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/27 0027
 * @description https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
 */
public class MinArray {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 1, 2};
        System.out.println(new MinArray().minArray(numbers));
    }

    //二分查找+暴力
    public int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] > numbers[right]) {
                left = mid + 1;

            } else if (numbers[mid] < numbers[right]) {
                right = mid;

            } else if (numbers[mid] == numbers[right]) {
                right--;
            }
        }

        return numbers[left];
    }
}
