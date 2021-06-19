package com.harvey.arrays;

import java.util.Arrays;

/**
 * 4,2,4,4,4,3(消消乐） 2 3 4 4 4 4
 *
 * 0,2,0,4,3,7 || 2 3 0 1 0 7 4
 *
 * 2,0,0,4,3,7
 * 2 4 0 0 3 7
 * 2 4 3 0 0 7
 * 2 4 3 7 0 0
 *
 * 未查看答案时的思路：
 * 1.交换
 * 2.双指针
 *
 * 查看后的思路是：
 *
 * 产生的原因是：
 */
public class ZeroEnd {
    public static void main(String[] args) {
        System.out.println(24>>1);
        int[] arrs={3,2,0,0,2,7,0,0};// i=2 j=2 i=3 j=2
        System.out.println(sumOfSeqForGreed(arrs));
        System.out.println(Arrays.toString(arrs));
    }

    public static int sumOfSeqForGreed(int[] arrs){
        if(arrs==null || arrs.length==0)
            return -1;

        int j=0;
        for(int i=0;i<arrs.length;i++){
            if(arrs[i]!=0){
                int tmp = arrs[i];
                arrs[i] = arrs[j];
                arrs[j++] = tmp;
            }

        }
        return 1;
    }

}
