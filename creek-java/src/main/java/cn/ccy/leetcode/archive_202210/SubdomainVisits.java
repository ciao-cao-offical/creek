package cn.ccy.leetcode.archive_202210;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/10/5 0005
 * @description https://leetcode.cn/problems/subdomain-visit-count/
 */
public class SubdomainVisits {
    public static void main(String[] args) {
        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        System.out.println(new SubdomainVisits().subdomainVisits(cpdomains));


    }

    //模拟 + 哈希表
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] split = cpdomain.split(" ");
            String[] domainSplit = split[1].split("\\.");
            StringBuilder domain = new StringBuilder();
            for (int length = domainSplit.length; length > 0; length--) {
                if (domain.length() != 0) {
                    domain.insert(0, ".");
                }
                domain.insert(0, domainSplit[length - 1]);
                String domainKey = domain.toString();
                map.put(domainKey, map.getOrDefault(domainKey, 0) + Integer.parseInt(split[0]));
            }
        }

        List<String> res = new ArrayList<>();
        map.forEach((key, value) -> {
            res.add(String.format("%d %s", value, key));
        });
        return res;
    }
}
