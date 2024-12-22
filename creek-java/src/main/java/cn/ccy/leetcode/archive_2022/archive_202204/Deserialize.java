package cn.ccy.leetcode.archive_2022.archive_202204;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/15
 * @description https://leetcode-cn.com/problems/mini-parser/
 * ☆☆ 试试【递归】和【深度优先】两种模拟方式
 */
public class Deserialize {
    public static void main(String[] args) {

    }

    //模拟 递归
    public NestedInteger deserialize(String s) {
        if (s.charAt(0) != '[') {
            return new NestedInteger(Integer.parseInt(s));
        }

        Deque<NestedInteger> stack = new LinkedList<>();
        int num = 0;
        boolean negative = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '-') {
                negative = true;

            } else if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');

            } else if (c == '[') {
                stack.push(new NestedInteger());

            } else if (c == ',' || c == ']') {
                if (Character.isDigit(s.charAt(i - 1))) {
                    if (negative) {
                        num *= -1;
                    }
                    stack.peek().add(new NestedInteger(num));
                }
                num = 0;
                negative = false;
                if (c == ']' && stack.size() > 1) {
                    NestedInteger pop = stack.pop();
                    stack.peek().add(pop);
                }
            }
        }

        return stack.pop();
    }
}

//模拟 深度优先
    /*private int index = 0;
    public NestedInteger deserialize(String s) {
        NestedInteger integer = new NestedInteger();
        if (s.charAt(index) == '[') {
            index++;
            while (s.charAt(index) != ']') {
                integer.add(deserialize(s));
                if (s.charAt(index) == ',') {
                    index++;
                }
            }
            index++;
            return integer;

        } else {
            boolean negative = false;
            if (s.charAt(index) == '-') {
                negative = true;
                index++;
            }
            int nums = 0;
            while (index < s.length() && Character.isDigit(s.charAt(index))) {
                nums = nums * 10 + (s.charAt(index) - '0');
                index++;
            }
            if (negative) {
                nums *= -1;
            }
            integer.setInteger(nums);
        }

        return integer;
    }
}*/

class NestedInteger implements Nested {
    public NestedInteger() {

    }

    public NestedInteger(int value) {

    }

    @Override
    public boolean isInteger() {
        return false;
    }

    @Override
    public Integer getInteger() {
        return null;
    }

    @Override
    public void setInteger(int value) {

    }

    @Override
    public void add(NestedInteger ni) {

    }

    @Override
    public List<NestedInteger> getList() {
        return null;
    }
}

// This is the interface that allows for creating nested lists.
// You should not implement it, or speculate about its implementation
interface Nested {
    // Constructor initializes an empty nested list.
    // public NestedInteger();

    // Constructor initializes a single integer.
    // public NestedInteger(int value);

    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();

    // Set this NestedInteger to hold a single integer.
    public void setInteger(int value);

    // Set this NestedInteger to hold a nested list and adds a nested integer to it.
    public void add(NestedInteger ni);

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return empty list if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}
