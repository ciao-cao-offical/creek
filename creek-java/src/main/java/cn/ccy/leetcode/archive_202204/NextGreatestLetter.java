package cn.ccy.leetcode.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/3 0003
 * @description https://leetcode-cn.com/problems/find-smallest-letter-greater-than-target/
 * ☆☆☆☆☆ cv
 */
public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        System.out.println(new NextGreatestLetter().nextGreatestLetter(letters, target));
    }

    public char nextGreatestLetter(char[] letters, char target) {
        if (letters[0] > target) {
            return letters[0];
        }
        int len = letters.length;
        if (letters[len - 1] <= target) {
            return letters[0];
        }

        int left = 0;
        int right = len - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            char md = letters[mid];
            if (md > target) {
                right = mid;

            } else {
                left = mid + 1;
            }
        }
        return letters[left];
    }
}
