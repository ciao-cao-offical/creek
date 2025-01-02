package cn.ccy.leetcode._2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/13
 * @description https://leetcode-cn.com/problems/time-needed-to-inform-all-employees/
 */
public class NumOfMinutes {
    public static void main(String[] args) {
        int n = 6;
        int headID = 2;
        int[] manager = {2, 2, -1, 2, 2, 2};
        int[] informTime = {0, 0, 1, 0, 0, 0};
        System.out.println(new NumOfMinutes().numOfMinutes(n, headID, manager, informTime));
    }

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        //全部通知到的时间耗时
        int ans = 0;
        //记录每一个员工下发通知所需时间
        int[] timeTable = new int[n];
        //遍历员工
        for (int i = 0; i < n; i++) {
            //跳过总负责人
            if (i == headID) {
                continue;
            }
            //当前员工传递消息所需时间
            int time = getTime(i, manager, informTime, timeTable);
            //记录当前员工下发通知所需时间
            timeTable[i] = time;
            //取最大值作为结果
            ans = Math.max(time, ans);
        }


        return ans;
    }

    private int getTime(int id, int[] manager, int[] informTime, int[] timeTable) {
        //当前员工领导
        int mId = manager[id];
        //如果领导是总负责人，则直接返回当前员工传递消息所需时间
        if (mId == -1) {
            return informTime[id];
        }
        //当前员工领导传递消息已知
        if (timeTable[mId] != 0) {
            return timeTable[mId] + informTime[id];
        }

        //当前员工领导传递消息未知，向上递归
        return getTime(mId, manager, informTime, timeTable) + informTime[id];
    }
}
