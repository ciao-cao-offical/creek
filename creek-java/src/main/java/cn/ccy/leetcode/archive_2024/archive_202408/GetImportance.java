package cn.ccy.leetcode.archive_2024.archive_202408;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/8/26 00:54:20
 * @description https://leetcode.cn/problems/employee-importance/?envType=daily-question&envId=2024-08-26
 */
public class GetImportance {
    public static void main(String[] args) {

    }

    Map<Integer, Employee> map = new HashMap<Integer, Employee>();

    public int getImportance(List<Employee> employees, int id) {
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        return dfs(id);
    }

    public int dfs(int id) {
        Employee employee = map.get(id);
        int total = employee.importance;
        List<Integer> subordinates = employee.subordinates;
        for (int subId : subordinates) {
            total += dfs(subId);
        }
        return total;
    }

    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }
}
