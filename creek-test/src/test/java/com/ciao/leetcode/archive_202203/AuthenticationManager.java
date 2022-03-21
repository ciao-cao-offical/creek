package com.ciao.leetcode.archive_202203;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/21
 * @description https://leetcode-cn.com/problems/design-authentication-manager/
 */
public class AuthenticationManager {
    //token有效时间
    private int timeToLive;
    //key：tokenId；vale：tokenId过期时间点
    private Map<String, Integer> map;

    public AuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
        map = new HashMap<>();
    }

    public static void main(String[] args) {
        AuthenticationManager manager = new AuthenticationManager(5);
        manager.renew("aaa", 1);
        manager.generate("aaa", 2);
        System.out.println(manager.countUnexpiredTokens(6));
        manager.generate("bbb", 7);
        manager.renew("aaa", 8);
        manager.renew("bbb", 10);
        System.out.println(manager.countUnexpiredTokens(15));
    }

    public void generate(String tokenId, int currentTime) {
        map.put(tokenId, currentTime + timeToLive);
    }

    public void renew(String tokenId, int currentTime) {
        Integer expireTime = map.get(tokenId);
        if (expireTime == null || currentTime >= expireTime) {
            return;
        }

        map.put(tokenId, currentTime + timeToLive);
    }

    public int countUnexpiredTokens(int currentTime) {
        int count = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > currentTime) {
                count++;
            }
        }
        return count;
    }
}
