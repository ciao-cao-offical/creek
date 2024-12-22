package cn.ccy.leetcode.archive_2023.archive_202311;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/11/23 0023 01:00:29
 * @description https://leetcode.cn/problems/html-entity-parser/?envType=daily-question&envId=2023-11-23
 * ☆☆☆ 2023cvd，加班...
 */
public class EntityParser {
    public static void main(String[] args) {

    }

    class EntityChar {
        String entity;
        char character;

        public EntityChar(String entity, char character) {
            this.entity = entity;
            this.character = character;
        }
    }

    List<EntityChar> entityList = new ArrayList<EntityChar>();

    public String entityParser(String text) {
        entityList.add(new EntityChar("&quot;", '"'));
        entityList.add(new EntityChar("&apos;", '\''));
        entityList.add(new EntityChar("&amp;", '&'));
        entityList.add(new EntityChar("&gt;", '>'));
        entityList.add(new EntityChar("&lt;", '<'));
        entityList.add(new EntityChar("&frasl;", '/'));
        StringBuffer res = new StringBuffer();
        int length = text.length();
        int pos = 0;
        while (pos < length) {
            boolean isEntity = false;
            if (text.charAt(pos) == '&') {
                for (EntityChar entityChar : entityList) {
                    String e = entityChar.entity;
                    char c = entityChar.character;
                    if (pos + e.length() <= text.length() && text.substring(pos, pos + e.length()).equals(e)) {
                        res.append(c);
                        pos += e.length();
                        isEntity = true;
                        break;
                    }
                }
            }
            if (!isEntity) {
                res.append(text.charAt(pos++));
                continue;
            }
        }
        return res.toString();
    }
}
