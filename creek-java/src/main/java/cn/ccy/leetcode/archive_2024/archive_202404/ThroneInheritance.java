package cn.ccy.leetcode.archive_2024.archive_202404;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/4/7 22:44:56
 * @description https://leetcode.cn/problems/throne-inheritance/?envType=daily-question&envId=2024-04-07
 * ☆☆☆ 2024cvd
 */
public class ThroneInheritance {
    public static void main(String[] args) {

    }

    Map<String, List<String>> edges;
    Set<String> dead;
    String king;

    public ThroneInheritance(String kingName) {
        edges = new HashMap<String, List<String>>();
        dead = new HashSet<String>();
        king = kingName;
    }

    public void birth(String parentName, String childName) {
        List<String> children = edges.getOrDefault(parentName, new ArrayList<String>());
        children.add(childName);
        edges.put(parentName, children);
    }

    public void death(String name) {
        dead.add(name);
    }

    public List<String> getInheritanceOrder() {
        List<String> ans = new ArrayList<String>();
        preorder(ans, king);
        return ans;
    }

    private void preorder(List<String> ans, String name) {
        if (!dead.contains(name)) {
            ans.add(name);
        }
        List<String> children = edges.getOrDefault(name, new ArrayList<String>());
        for (String childName : children) {
            preorder(ans, childName);
        }
    }
}
