package com.harvey.arrays;

/**
 * 能力与年龄 经验 不符。如何弥补？每天制定学习计划并完成。
 * 题目：判断数组中是否有重复元素
 *
 * 分析:
 * 1.暴力算法 两次for循环 O(n2)
 * 2.排序+双指针O（nlogn+n）=nlogn
 * 3.双指针（类似链表循环）
 */
public class HasRepeatNum {
    public static void main(String[] args) {
        int[] nums={2,3,2,3,1,2};
        System.out.println(hasRepeat(nums));
    }

    public static int hasRepeat(int[] nums){
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;

    }
}
