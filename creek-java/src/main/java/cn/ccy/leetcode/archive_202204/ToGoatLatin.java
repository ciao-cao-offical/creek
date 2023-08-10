package cn.ccy.leetcode.archive_202204;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/21
 * @description https://leetcode-cn.com/problems/goat-latin/
 */
public class ToGoatLatin {
    public static void main(String[] args) {
        System.out.println(new ToGoatLatin().toGoatLatin("I speak Goat Latin"));
    }

    List<Character> vowels = new ArrayList<Character>() {{
        add('a');
        add('e');
        add('i');
        add('o');
        add('u');
        add('A');
        add('E');
        add('I');
        add('O');
        add('U');
    }};

    //模拟
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char fc = word.charAt(0);
            if (!vowels.contains(fc)) {
                sb.append(word.substring(1)).append(fc);

            } else {
                sb.append(word);
            }
            sb.append("ma");
            int j = 0;
            while (j <= i) {
                sb.append('a');
                j++;
            }
            if (i != words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
