package cn.ccy.leetcode.archive_202302;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/2/1
 * @description https://leetcode.cn/problems/decode-the-message/
 */
public class DecodeMessage {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        System.out.println(new DecodeMessage().decodeMessage(key, message));
    }

    public String decodeMessage(String key, String message) {
        char[] table = new char[26];
        int cur = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = cur; j < key.length(); j++) {
                char c = key.charAt(j);
                if (c != ' ' && !contains(table, c)) {
                    table[i] = c;
                    ++j;
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (c == ' ') {
                sb.append(' ');
            } else {
                sb.append((char) ('a' + getIndex(table, c)));
            }
        }

        return sb.toString();
    }


    private boolean contains(char[] table, char c) {
        for (char c1 : table) {
            if (c1 == c) {
                return true;
            }
        }

        return false;
    }

    private int getIndex(char[] table, char c) {
        for (int i = 0; i < table.length; i++) {
            if (table[i] == c) {
                return i;
            }
        }

        return -1;
    }
}
