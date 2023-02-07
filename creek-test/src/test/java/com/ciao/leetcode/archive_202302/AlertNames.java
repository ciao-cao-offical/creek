package com.ciao.leetcode.archive_202302;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/2/7
 * @description https://leetcode.cn/problems/alert-using-same-key-card-three-or-more-times-in-a-one-hour-period/
 */
public class AlertNames {
    public static void main(String[] args) {
        String[] keyName = {"daniel", "daniel", "daniel", "luis", "luis", "luis", "luis"};
        String[] keyTime = {"10:00", "10:40", "11:00", "09:00", "11:00", "13:00", "15:00"};
        System.out.println(new AlertNames().alertNames(keyName, keyTime));
    }

    public List<String> alertNames(String[] keyName, String[] keyTime) {
        Map<String, List<String>> map = new HashMap<>();
        int len = keyName.length;
        for (int i = 0; i < len; i++) {
            String name = keyName[i];
            String time = keyTime[i];
            List<String> list;
            if (!map.containsKey(name)) {
                list = new ArrayList<>();
                map.put(name, list);

            } else {
                list = map.get(name);
            }
            list.add(time);
        }

        List<String> nameList = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String name = entry.getKey();
            List<String> times = entry.getValue();
            if (times.size() < 3) {
                continue;
            }

            times.sort(String::compareTo);
            boolean check = false;
            for (int i = 0; i < times.size(); i++) {
                int count = 1;
                int startSecond = getSecond(times.get(i));
                for (int j = i + 1; j < times.size(); j++) {
                    if (getSecond(times.get(j)) - startSecond <= 3600) {
                        count++;
                    } else {
                        break;
                    }

                    if (count >= 3) {
                        check = true;
                        break;
                    }
                }

                if (check) {
                    break;
                }
            }
            if (check) {
                nameList.add(name);
            }
        }

        if (nameList.size() != 0) {
            nameList.sort(String::compareTo);
        }
        return nameList;
    }

    private int getSecond(String time) {
        String[] split = time.split(":");
        return Integer.parseInt(split[0]) * 3600 +
                Integer.parseInt(split[1]) / 10 * 60 +
                Integer.parseInt(split[1]) % 10;
    }
}
