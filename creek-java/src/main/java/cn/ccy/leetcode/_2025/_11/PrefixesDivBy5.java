package cn.ccy.leetcode._2025._11;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/binary-prefix-divisible-by-5/?envType=daily-question&envId=2025-11-24">1018. 可被 5 整除的二进制前缀</a>
 * @since 2025/11/24 22:46
 */
public class PrefixesDivBy5 {
    public static void main(String[] args) {

    }

    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> answer = new ArrayList<Boolean>();
        int prefix = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            prefix = ((prefix << 1) + nums[i]) % 5;
            answer.add(prefix == 0);
        }
        return answer;
    }
}
