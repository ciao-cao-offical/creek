package cn.ccy.leetcode.archive_202410;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/8 00:29:48
 * @description https://leetcode.cn/problems/destination-city/?envType=daily-question&envId=2024-10-08
 */
public class DestCity {
    public static void main(String[] args) {

    }

    public String destCity(List<List<String>> paths) {
        Set<String> citiesA = new HashSet<String>();
        for (List<String> path : paths) {
            citiesA.add(path.get(0));
        }
        for (List<String> path : paths) {
            if (!citiesA.contains(path.get(1))) {
                return path.get(1);
            }
        }
        return "";
    }
}
