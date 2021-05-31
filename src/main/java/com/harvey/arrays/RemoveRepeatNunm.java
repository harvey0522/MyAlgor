package com.harvey.arrays;

public class RemoveRepeatNunm {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3,3,3,5,7};
        //int[] nums={1,2,5,7,9,9};
        System.out.println(get(nums));
    }

    /**
     * 1,2,1,2,3,3,3,5,7
     *分析i=0 j=1
     * @param nums
     * @return
     */
    public static int get(int[] nums){
        int slow=0;
        int fast=1;
       while(fast<nums.length){
            if(nums[slow]!=nums[fast] && fast-slow>1){
                nums[slow+1] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow+1;
    }
}
