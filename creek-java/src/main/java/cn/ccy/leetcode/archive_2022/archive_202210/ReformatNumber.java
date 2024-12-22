package cn.ccy.leetcode.archive_2022.archive_202210;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/10/1 0001
 * @description https://leetcode.cn/problems/reformat-phone-number/
 */
public class ReformatNumber {
    public static void main(String[] args) {
        String number = "12";
        System.out.println(new ReformatNumber().reformatNumber(number));
    }

    //简单模拟
    public String reformatNumber(String number) {
        List<Character> list = new ArrayList<>();
        for (char c : number.toCharArray()) {
            if (c == ' ' || c == '-') {
                continue;
            }
            list.add(c);
        }

        int size = list.size();
        StringBuilder sb = new StringBuilder();
        if (size <= 3) {
            for (Character character : list) {
                sb.append(character);
            }

            return sb.toString();
        }

        int quotient = size / 3;
        int remainder = size % 3;
        if (remainder == 1) {
            quotient--;
            remainder += 3;
        }
        for (int i = 0; i < quotient * 3; i++) {
            if (i != 0 && i % 3 == 0) {
                sb.append('-');
            }
            sb.append(list.get(i));
        }

        if (remainder != 0) {
            int divisor = remainder == 4 ? 2 : 3;
            for (int i = 0; i < remainder; i++) {
                if (sb.length() != 0 && i % divisor == 0) {
                    sb.append('-');
                }
                sb.append(list.get(quotient * 3 + i));
            }
        }


        return sb.toString();
    }
}
