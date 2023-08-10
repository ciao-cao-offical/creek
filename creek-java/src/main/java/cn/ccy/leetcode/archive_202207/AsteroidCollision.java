package cn.ccy.leetcode.archive_202207;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/7/13
 * @description https://leetcode.cn/problems/asteroid-collision/
 * 【栈模拟】
 */
public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids = {10, 2, -5};
        System.out.println(Arrays.toString(new AsteroidCollision().asteroidCollision(asteroids)));
    }

    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int aster : asteroids) {
            boolean alive = true;
            while (alive && aster < 0 && !stack.isEmpty() && stack.peek() > 0) {
                alive = stack.peek() < -aster; // aster 是否存在
                if (stack.peek() <= -aster) {  // 栈顶行星爆炸
                    stack.pop();
                }
            }
            if (alive) {
                stack.push(aster);
            }
        }
        int size = stack.size();
        int[] ans = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}
