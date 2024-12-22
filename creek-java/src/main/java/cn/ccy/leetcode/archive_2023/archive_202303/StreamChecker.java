package cn.ccy.leetcode.archive_2023.archive_202303;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/24 0024 22:19:45
 * @description https://leetcode.cn/problems/stream-of-characters/
 * ★★★★★ cvd，AC自动机-https://oi-wiki.org/string/ac-automaton/
 */
public class StreamChecker {
    public static void main(String[] args) {

    }

    TrieNode root;
    TrieNode temp;

    public StreamChecker(String[] words) {
        root = new TrieNode();
        for (String word : words) {
            TrieNode cur = root;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (cur.getChild(index) == null) {
                    cur.setChild(index, new TrieNode());
                }
                cur = cur.getChild(index);
            }
            cur.setIsEnd(true);
        }
        root.setFail(root);
        Queue<TrieNode> q = new LinkedList<>();
        for (int i = 0; i < 26; i++) {
            if (root.getChild(i) != null) {
                root.getChild(i).setFail(root);
                q.add(root.getChild(i));
            } else {
                root.setChild(i, root);
            }
        }
        while (!q.isEmpty()) {
            TrieNode node = q.poll();
            node.setIsEnd(node.getIsEnd() || node.getFail().getIsEnd());
            for (int i = 0; i < 26; i++) {
                if (node.getChild(i) != null) {
                    node.getChild(i).setFail(node.getFail().getChild(i));
                    q.offer(node.getChild(i));
                } else {
                    node.setChild(i, node.getFail().getChild(i));
                }
            }
        }

        temp = root;
    }

    public boolean query(char letter) {
        temp = temp.getChild(letter - 'a');
        return temp.getIsEnd();
    }

    class TrieNode {
        TrieNode[] children;
        boolean isEnd;
        TrieNode fail;

        public TrieNode() {
            children = new TrieNode[26];
        }

        public TrieNode getChild(int index) {
            return children[index];
        }

        public void setChild(int index, TrieNode node) {
            children[index] = node;
        }

        public boolean getIsEnd() {
            return isEnd;
        }

        public void setIsEnd(boolean b) {
            isEnd = b;
        }

        public TrieNode getFail() {
            return fail;
        }

        public void setFail(TrieNode node) {
            fail = node;
        }
    }
}
