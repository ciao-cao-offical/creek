package cn.ccy.leetcode._2025._09;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/design-spreadsheet/solutions/?envType=daily-question&envId=2025-09-19">3484. 设计电子表格</a>
 * @since 2025/9/19 22:03
 */
public class Spreadsheet {
    public static void main(String[] args) {

    }

    private Map<String, Integer> cellValues = new HashMap<>();

    public Spreadsheet(int size) {

    }

    public void setCell(String cell, int value) {
        cellValues.put(cell, value);
    }

    public void resetCell(String cell) {
        cellValues.remove(cell);
    }

    public int getValue(String formula) {
        int i = formula.indexOf('+');
        String cell1 = formula.substring(1, i);
        String cell2 = formula.substring(i + 1);
        int val1 = Character.isLetter(cell1.charAt(0)) ? cellValues.getOrDefault(cell1, 0) : Integer.parseInt(cell1);
        int val2 = Character.isLetter(cell2.charAt(0)) ? cellValues.getOrDefault(cell2, 0) : Integer.parseInt(cell2);
        return val1 + val2;
    }
}
