package cn.ccy.leetcode.archive_202206;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/6/4 0004
 * @description https://leetcode.cn/problems/unique-email-addresses/
 */
public class NumUniqueEmails {
    public static void main(String[] args) {
        System.out.println(new NumUniqueEmails().numUniqueEmails(
                new String[]{"test.email+alex@leetcode.com",
                        "test.e.mail+bob.cathy@leetcode.com",
                        "testemail+david@lee.tcode.com" }
        ));
    }

    //模拟
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            int i = email.indexOf('@');
            String local = email.substring(0, i).split("\\+")[0].replace(".", "");
            set.add(local + email.substring(i));
        }
        return set.size();
    }
}
