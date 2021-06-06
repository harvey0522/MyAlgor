package com.harvey.sort;

import java.util.Arrays;

/**
 *
 * 3 0 9 1 5 8 2 4 pivot=3
 * 2 0 9 1 5 8 2 4 nums[right]=2 right=6 letf=0
 * 2 0 9 1 5 8 9 4 right=6 letf=2
 * 2 0 1 1 5 8 9 4 right=3 letf=2
 * 2 0 1 3 5 8 9 4 right=3 letf=3 >>nums[right]=pivot
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] nums={23,11,9,1,5,8,2,4,6,100};
        sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void sort(int nums[],int left,int right){
        if(left<right){
            int pivot=nums[left];
            int i=left;
            int j=right;
            while(i<j){
                while (i<j && nums[j]>pivot )
                    j--;
                if(i<j){
                    nums[i++]=nums[j];
                }
                while (i<j && nums[i]<pivot )
                    i++;
                if(i<j){
                    nums[j--]=nums[i];
                }
            }

            nums[i]=pivot;
            sort(nums,left,i);
            sort(nums,i+1,right);
        }

    }
}
