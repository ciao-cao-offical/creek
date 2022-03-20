package com.ciao.leetcode.archive_202203;

import java.util.*;

// This is the interface that allows for creating nested lists.
// You should not implement it, or speculate about its implementation
interface NestedInteger {

    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return empty list if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/20 0020
 * @description https://leetcode-cn.com/problems/flatten-nested-list-iterator/
 * ★★ 迭代器
 */
public class NestedIterator implements Iterator<Integer> {
    private Deque<Iterator<NestedInteger>> stack;

    public NestedIterator(List<NestedInteger> nestedList) {
        stack = new ArrayDeque<>();
        stack.push(nestedList.iterator());

    }

    public static void main(String[] args) {

    }

    @Override
    public Integer next() {
        return stack.pop().next().getInteger();
    }

    @Override
    public boolean hasNext() {
        while (!stack.isEmpty()) {
            Iterator<NestedInteger> peek = stack.peek();
            if (!peek.hasNext()) {
                stack.pop();
                continue;
            }

            NestedInteger next = peek.next();
            if (next.isInteger()) {
                List<NestedInteger> list = new ArrayList<>();
                list.add(next);
                stack.push(list.iterator());
                return true;

            } else {
                stack.push(next.getList().iterator());
            }

        }
        return false;
    }
}
