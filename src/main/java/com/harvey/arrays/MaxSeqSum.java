package com.harvey.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 求数组中最大子序列之和
 * [-2,-1,-3,-3,-2,-6,-1,7]
 */
public class MaxSeqSum {
    public static void main(String[] args) {
        int[] arrs={-2,1,-3,5,-5,7};
        //System.out.println(sumOfSeqForGreed(arrs));
        System.out.println(sumOfDpSeq(arrs));
    }

    /**
     * 贪心算法
     * <p>1分析</p>
     *  两个变量，一个历史最大值，当前最大值，取出两者大的值并赋值给历史最大值。如果当前sum小于0，就取当前元素值。否则会更小
     *
     */
    public static int sumOfSeqForGreed(int[] arrs){
        if(arrs==null || arrs.length==0)
            return -1;
        int res=arrs[0];
        int sum=0;
        for(int i=1;i<arrs.length;i++){
            if(sum>0){
                sum=arrs[i]+sum;
            }else{
                sum=arrs[i];
            }
            res=Math.max(res,sum);
        }
        return res;
    }

    /**
     * 动态规划
     * @param arrs
     * @return sss
     */
    public static int sumOfDpSeq(int[] arrs){
        if(arrs==null || arrs.length==0)
            return -1;
        int len = arrs.length;
        int[] dp = new int[len];
        dp[0] = arrs[0];
        int res = Integer.MIN_VALUE;
        for(int i = 1; i < len; i++){
            dp[i] = Math.max(dp[i-1] + arrs[i], arrs[i]);
            if(dp[i] > res){
                res = dp[i];
            }
        }
        return Math.max(dp[0], res);
    }
}
