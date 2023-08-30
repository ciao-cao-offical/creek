package com.ciao.practice;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/30 16:17
 * @description ForkJoin测试
 */
@Log4j2
public class ForkJoinTest {
    Random random = new Random();

    @Test
    public void 计算数组元素和() {
        int[] nums = new int[2000];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = getRandomInt();
            sum += nums[i];
        }
        log.info("sum = {}", sum);
        log.info("======================");

        FJTask task = new FJTask(nums, 0, nums.length);
        long start = System.currentTimeMillis();
        Integer taskSum = ForkJoinPool.commonPool().invoke(task);
        log.info("fork join spend：{} ms", System.currentTimeMillis() - start);

        log.info("======================");
        log.info("task sum = {}", taskSum);
        log.info("sum == task sum ? {}", sum == taskSum);

        int forSum = 0;
        long forStart = System.currentTimeMillis();
        for (int num : nums) {
            forSum += num;
        }
        log.info("for spend：{} ms", System.currentTimeMillis() - forStart);
    }

    class FJTask extends RecursiveTask<Integer> {

        private int[] nums;
        private int start;
        private int end;

        private int threadNum = 50;

        public FJTask(int[] nums, int start, int end) {
            this.nums = nums;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            int sum = 0;

            if (end - start <= threadNum) {
                for (int i = start; i < end; i++) {
                    sum += nums[i];
                }

                log.info("task sum = {}", sum);
                return sum;
            }

            int mid = start + (end - start) / 2;
            log.info("task [{}, {}) split => 1.[{}, {});2.[{}, {})", start, end, start, mid, mid, end);
            FJTask task_1 = new FJTask(nums, start, mid);
            FJTask task_2 = new FJTask(nums, mid, end);
            invokeAll(task_1, task_2);
            Integer task_1_sum = task_1.join();
            Integer task_2_sum = task_2.join();
            sum = task_1_sum + task_2_sum;
            log.info("after task split => task_1_sum: {}/task_2_sum: {}/task sum: {}", task_1_sum, task_2_sum, sum);
            return sum;
        }
    }

    private int getRandomInt() {
        return random.nextInt(1000);
    }
}
