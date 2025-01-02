package cn.ccy.leetcode._2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/12
 * @description https://leetcode-cn.com/problems/next-greater-element-iii/
 */
public class NextGreaterElement {
    public static void main(String[] args) {
        System.out.println(new NextGreaterElement().nextGreaterElement(12));
    }

    public int nextGreaterElement(int n) {
        char[] nc = String.valueOf(n).toCharArray();
        int i = nc.length - 2;
        while (i >= 0 && nc[i + 1] <= nc[i]) {
            i--;
        }
        if (i < 0) {
            return -1;
        }

        int j = nc.length - 1;
        while (j >= 0 && nc[j] <= nc[i]) {
            j--;
        }
        swap(nc, i, j);
        reverse(nc, i + 1);

        try {
            return Integer.parseInt(String.valueOf(nc));

        } catch (NumberFormatException e) {
            return -1;
        }

    }

    private void swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private void reverse(char[] a, int start) {
        int end = a.length - 1;
        while (start < end) {
            swap(a, start, end);
            start++;
            end--;
        }
    }
}
