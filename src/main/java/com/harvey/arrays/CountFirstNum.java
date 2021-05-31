package com.harvey.arrays;

/**
 * 计算1出现的次数
 */
public class CountFirstNum {
    public static void main(String[] args) {
        int[] arrs={1,1,0,1,1,1,1,0,1};
        System.out.println(test(arrs));
    }

    public static int test(int[] arrs){
        int count=0,maxCount=0;
        for(int num:arrs){
            if(num==1){
                count++;
            }else{
                maxCount=Math.max(count,maxCount);
                count=0;
            }
        }
        return maxCount;
    }
}
