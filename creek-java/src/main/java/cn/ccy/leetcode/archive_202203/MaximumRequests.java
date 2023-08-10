package cn.ccy.leetcode.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/1
 * @description https://leetcode-cn.com/problems/maximum-number-of-achievable-transfer-requests/
 */
public class MaximumRequests {
    //楼栋状态记录表
    int[] buildings;
    //楼栋数量
    int buildingNum;
    //配平的楼栋数（配平即搬出的住户数等于搬入的住户数）
    int zeroBuildingNum;
    //满足的最大请求数目
    int ans;
    //当前所有楼栋配平状态下满足的请求数目
    int cur;

    public static void main(String[] args) {
        int n = 5;
        int[][] requests = {{0, 1}, {1, 0}, {0, 1}, {1, 2}, {2, 0}, {3, 4}};
        System.out.println(new MaximumRequests().maximumRequests(n, requests));
    }

    public int maximumRequests(int n, int[][] requests) {
        this.buildings = new int[n];
        buildingNum = n;
        zeroBuildingNum = n;
        dfs(requests, 0);
        return ans;
    }

    private void dfs(int[][] requests, int pos) {
        //已经完成了最后一个请求的处理
        if (pos == requests.length) {
            //所有楼栋均已配平
            if (zeroBuildingNum == buildingNum) {
                //取二者较大值
                ans = Math.max(ans, cur);
            }
            return;
        }

        //不选择pos
        dfs(requests, pos + 1);

        //选择pos
        int ozn = zeroBuildingNum;
        //满足的请求+1
        cur++;
        int[] request = requests[pos];
        //x楼栋状态（搬出x）
        int x = request[0];
        //y楼栋状态（搬入y）
        int y = request[1];

        //若x楼栋的原始状态为0，则zeroNum需要减去1
        zeroBuildingNum -= buildings[x] == 0 ? 1 : 0;
        //x楼栋搬出
        buildings[x]--;
        //若x楼栋经过一次搬出操作后为0，则zeroNum需要+1
        zeroBuildingNum += buildings[x] == 0 ? 1 : 0;

        //若y楼栋的原始状态为0，则zeroNum需要减去1
        zeroBuildingNum -= buildings[y] == 0 ? 1 : 0;
        //y楼栋搬入
        buildings[y]++;
        //若y楼栋经过一次搬入操作后为0，则zeroNum需要+1
        zeroBuildingNum += buildings[y] == 0 ? 1 : 0;

        //继续下一个请求
        dfs(requests, pos + 1);

        //还原现场
        buildings[x]++;
        buildings[y]--;
        cur--;
        zeroBuildingNum = ozn;
    }
}
