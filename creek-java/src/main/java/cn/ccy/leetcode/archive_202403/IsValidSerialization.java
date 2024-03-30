package cn.ccy.leetcode.archive_202403;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/3/31 0031 00:25:06
 * @description https://leetcode.cn/problems/verify-preorder-serialization-of-a-binary-tree/description/?envType=daily-question&envId=2024-03-31
 */
public class IsValidSerialization {
    public static void main(String[] args) {

    }
    
    public boolean isValidSerialization(String preorder) {
        int n = preorder.length();
        int i = 0;
        Deque<Integer> stack = new LinkedList<Integer>();
        stack.push(1);
        while (i < n) {
            if (stack.isEmpty()) {
                return false;
            }
            if (preorder.charAt(i) == ',') {
                i++;
            } else if (preorder.charAt(i) == '#') {
                int top = stack.pop() - 1;
                if (top > 0) {
                    stack.push(top);
                }
                i++;
            } else {
                // 读一个数字
                while (i < n && preorder.charAt(i) != ',') {
                    i++;
                }
                int top = stack.pop() - 1;
                if (top > 0) {
                    stack.push(top);
                }
                stack.push(2);
            }
        }
        return stack.isEmpty();
    }
}
