package cn.ccy.leetcode._2026._05;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/destroying-asteroids/?envType=daily-question&envId=2026-05-31">2126. 摧毁小行星</a>
 * @since 2026/5/31 00:39
 */
public class AsteroidsDestroyed {
    public static void main(String[] args) {

    }

    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);   // 按照质量升序排序
        long currentMass = mass;  // 防止整数溢出
        for (int asteroid : asteroids) {
            // 按顺序遍历小行星，尝试摧毁并更新质量或者返回结果
            if (currentMass < asteroid) {
                return false;
            }
            currentMass += asteroid;
        }
        return true;   // 成功摧毁所有小行星
    }
}
