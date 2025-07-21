package cn.ccy.leetcode._2025._07;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/delete-characters-to-make-fancy-string/?envType=daily-question&envId=2025-07-21">1957. 删除字符使字符串变好</a>
 * @since 2025/7/21 23:05
 */
public class MakeFancyString {
    public static void main(String[] args) {
        System.out.println(new MakeFancyString().makeFancyString("leeetcode"));
        ;
    }

    /*
    public String makeFancyString(String s) {
        char[] chars = s.toCharArray();
        List<Integer> exIndex = new ArrayList<>();
        for (int i = 0; i < chars.length - 2; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = i; j < i + 3; j++) {
                map.put(chars[j], map.getOrDefault(chars[j], 0) + 1);
                if (map.get(chars[j]) == 3) {
                    exIndex.add(j - 2);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (exIndex.contains(i)) {
                continue;
            }
            sb.append(chars[i]);
        }

        return sb.toString();
    }
    */

    public String makeFancyString(String s) {
        StringBuilder res = new StringBuilder();   // 删除后的字符串
        // 遍历 s 模拟删除过程
        for (char ch : s.toCharArray()) {
            int n = res.length();
            if (n >= 2 && res.charAt(n - 1) == ch && res.charAt(n - 2) == ch) {
                // 如果 res 最后两个字符与当前字符均相等，则不添加
                continue;
            }
            // 反之则添加
            res.append(ch);
        }
        return res.toString();
    }
}
