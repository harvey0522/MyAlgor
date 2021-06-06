package com.harvey.sort;

import javax.naming.PartialResultException;
import java.util.Arrays;

/**
 * 3 0 2 1 5 8 9 4
 * 3 0 2 1 || 5 8 9 4
 * 3 0 || 2 1 || 5 8 || 9 4
 *
 * 稳定 保证原数组出现的位置顺序
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] nums={3,0,2,1,5,8,9,4,6};
        int[] temp=new int[nums.length];
        merge(nums,0,nums.length-1,temp);
        System.out.println(Arrays.toString(nums));
    }

    public static void merge(int[] nums,int left,int right,int temp[]){
        if(left>right || left == right) return;
        //System.out.println(nums[left]+"..."+nums[right]);
        int mid=(left+right)/2;
        merge(nums,left,mid,temp);
        merge(nums,mid+1,right,temp);
        sort(nums,left,mid,right,temp);
    }
    public static void sort(int[] nums,int left,int mid,int right,int[] temp){
        int i=left;
        int j=mid+1;
        int t=0;
        while(i<=mid && j<=right){
            if(nums[i]<nums[j]){
                temp[t++]=nums[i++];
            }else {
                temp[t++]=nums[j++];
            }
        }

        while (i<=mid){
            System.out.println("i:"+i+";num:"+nums[i]);
            temp[t++]=nums[i++];

        }
        while (j<=right){
            System.out.println("j:"+j+";num:"+nums[j]);
            temp[t++]=nums[j++];
        }
        t=0;
        while (left<=right){
            nums[left++]=temp[t++];
        }
        System.out.println("temp......."+Arrays.toString(temp));
    }
}
