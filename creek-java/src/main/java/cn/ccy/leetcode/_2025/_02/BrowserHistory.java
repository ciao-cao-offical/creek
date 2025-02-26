package cn.ccy.leetcode._2025._02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/2/26 21:34
 * @description/link https://leetcode.cn/problems/design-browser-history/?envType=daily-question&envId=2025-02-26
 */
public class BrowserHistory {
    public static void main(String[] args) {

    }

    private List<String> urls;
    private int currIndex;

    public BrowserHistory(String homepage) {
        this.urls = new ArrayList<>();
        this.urls.add(homepage);
        this.currIndex = 0;
    }

    public void visit(String url) {
        while (urls.size() > currIndex + 1) {
            urls.remove(urls.size() - 1);
        }
        urls.add(url);
        this.currIndex++;
    }

    public String back(int steps) {
        currIndex = Math.max(currIndex - steps, 0);
        return urls.get(currIndex);
    }

    public String forward(int steps) {
        currIndex = Math.min(currIndex + steps, urls.size() - 1);
        return urls.get(currIndex);
    }
}
