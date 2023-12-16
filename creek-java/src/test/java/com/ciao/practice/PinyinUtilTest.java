package com.ciao.practice;

import cn.hutool.extra.pinyin.PinyinEngine;
import cn.hutool.extra.pinyin.PinyinUtil;
import cn.hutool.extra.pinyin.engine.tinypinyin.TinyPinyinEngine;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/12/16 0016 23:05:06
 * @description PinyinUtil测试类
 */
@Log4j2
public class PinyinUtilTest {
    @Test
    public void 测试拼音_1() {
        String pinyin = PinyinUtil.getPinyin("曹成印");
        log.info(pinyin);
    }

    @Test
    public void 测试拼音_2() {
        PinyinEngine engine = new TinyPinyinEngine();
        String pinyin = engine.getPinyin("曹成印", " ");
        System.out.println(pinyin);
    }
}
