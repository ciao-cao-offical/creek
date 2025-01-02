package cn.ccy.leetcode._2022.archive_202204;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/9 0009
 * @description https://leetcode-cn.com/problems/text-justification/
 * ☆☆☆☆
 */
public class FullJustify {
    public static void main(String[] args) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        System.out.println(new FullJustify().fullJustify(words, maxWidth));
    }

    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        int right = 0;
        int n = words.length;
        while (true) {
            //当前行第一个单词在words中的位置
            int left = right;
            //统计这一行单词长度之和
            int sumLen = 0;
            //循环确定当前行可以放多少个单词，单词之间至少应该有一个空格
            while (right < n && sumLen + words[right].length() + right - left <= maxWidth) {
                sumLen += words[right++].length();
            }

            //当前行是最后一行，单词左对齐，且单词之间应只有一个空格，在行末填充剩余空格
            if (right == n) {
                StringBuilder sb = join(words, left, right, " ");
                sb.append(blank(maxWidth - sb.length()));
                ans.add(sb.toString());
                return ans;
            }

            int numWords = right - left;
            int numSpaces = maxWidth - sumLen;

            //当前行只有一个单词，单词左对齐，在行末填充剩余空格
            if (numWords == 1) {
                StringBuilder sb = new StringBuilder(words[left]);
                sb.append(blank(numSpaces));
                ans.add(sb.toString());
                continue;
            }

            //当前行不止一个单词
            int avgSpace = numSpaces / (numWords - 1);
            int extraSpace = numSpaces % (numWords - 1);
            StringBuilder sb = new StringBuilder();
            //前extraSpace个空格要多加一个空格，即avgSpace+1
            sb.append(join(words, left, left + extraSpace + 1, blank(avgSpace + 1)));
            //中间补充一个avgSpace空格字符串
            sb.append(blank(avgSpace));
            //剩余单词用avgSpace空格字符串隔开
            sb.append(join(words, left + extraSpace + 1, right, blank(avgSpace)));
            ans.add(sb.toString());
        }
    }

    //返回长度为n的空格字符串
    private String blank(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    //拼接words[left,right)单词为字符串，每个单词通过sep分隔
    private StringBuilder join(String[] words, int left, int right, String sep) {
        StringBuilder sb = new StringBuilder(words[left]);
        for (int i = left + 1; i < right; i++) {
            sb.append(sep);
            sb.append(words[i]);
        }
        return sb;
    }
}
