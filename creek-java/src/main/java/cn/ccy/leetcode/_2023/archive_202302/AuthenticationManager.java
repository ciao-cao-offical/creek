package cn.ccy.leetcode._2023.archive_202302;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/2/9
 * @description https://leetcode.cn/problems/design-authentication-manager/
 */
public class AuthenticationManager {
    public static void main(String[] args) {

    }

    int timeToLive;
    Map<String, Integer> timeTable;

    public AuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
        timeTable = new HashMap<>();
    }

    public void generate(String tokenId, int currentTime) {
        timeTable.put(tokenId, currentTime + timeToLive);
    }

    public void renew(String tokenId, int currentTime) {
        if (timeTable.containsKey(tokenId) && timeTable.get(tokenId) > currentTime) {
            timeTable.put(tokenId, currentTime + timeToLive);
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        int count = 0;
        for (Integer value : timeTable.values()) {
            if (value > currentTime) {
                count++;
            }
        }
        return count;
    }
}
