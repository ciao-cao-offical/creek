package cn.ccy.leetcode._2023.archive_202303;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/13
 * @description https://leetcode.cn/problems/minimum-hours-of-training-to-win-a-competition/
 */
public class MinNumberOfHours {
    public static void main(String[] args) {
        int initialEnergy = 1, initialExperience = 1;
        int[] energy = {1, 1, 1, 1}, experience = {1, 1, 1, 50};
        System.out.println(new MinNumberOfHours().minNumberOfHours(initialEnergy, initialExperience, energy, experience));
    }

    //贪心
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int needEn = 0;
        int needEx = 0;
        for (int e : energy) {
            if (initialEnergy <= e) {
                needEn += e + 1 - initialEnergy;
                initialEnergy = 1;

            } else {
                initialEnergy -= e;
            }
        }

        for (int e : experience) {
            if (initialExperience <= e) {
                needEx += e + 1 - initialExperience;
                initialExperience = 2 * e + 1;

            } else {
                initialExperience += e;
            }
        }
        return needEn + needEx;
    }
}
