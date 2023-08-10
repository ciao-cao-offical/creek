package cn.ccy.leetcode.archive_202206;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/6/21
 * @description https://leetcode.cn/problems/defanging-an-ip-address/
 */
public class DefangIPaddr {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        System.out.println(new DefangIPaddr().defangIPaddr(address));
    }

    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (char c : address.toCharArray()) {
            if ('.' == c) {
                sb.append('[').append(c).append(']');
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
