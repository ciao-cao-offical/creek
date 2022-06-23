package com.ciao.practice;

import org.junit.Test;

import java.text.NumberFormat;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/6/15
 * @description 打印测试
 */
public class SystemOutPrintTest {

    @Test
    public void 统计数据打印测试_开门红() {
        //监控key：dms_presort_external_realTimeApi

        //峰值时刻TP99
        String nowTP99 = "96";
        //峰值处理量
        String now10 = "595162";
        Double now10D = new Double(now10);
        //峰值可用率
        String nowAR = "100";

        //开门红同时段峰值
        String open10 = "203305";
        Double open10D = new Double(open10);

        //同比增长比率计算
        NumberFormat format = NumberFormat.getPercentInstance();
        format.setMaximumFractionDigits(2);
        String result = format.format((now10D - open10D) / open10D);
        System.out.printf("自营预分拣业务 峰值处理量 %s/分， tp99 %s ms， 可用率为%s%%， 开门红同时段流量峰值%s/分， 同比增长%s；%n",
                now10, nowTP99, nowAR, open10, result);
    }

    @Test
    public void 统计数据打印测试_618() {
        //监控key：dms_presort_external_realTimeApi

        //峰值时刻TP99
        String nowTP99 = "96";
        //峰值处理量
        String now10 = "78855";
        Double now10D = new Double(now10);
        //峰值可用率
        String nowAR = "100";

        //开门红同时段峰值
        String last618 = "68832";
        Double last618D = new Double(last618);

        //同比增长比率计算
        NumberFormat format = NumberFormat.getPercentInstance();
        format.setMaximumFractionDigits(2);
        String result = format.format((now10D - last618D) / last618D);
        System.out.printf("自营预分拣业务 峰值处理量 %s/分， tp99 %s ms， 可用率为%s%%， 去年618同时段流量峰值%s/分， 同比增长%s；%n",
                now10, nowTP99, nowAR, last618, result);
    }
}
