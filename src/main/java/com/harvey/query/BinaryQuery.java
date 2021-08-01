package com.harvey.query;

/**
 * 二分查找
 * 1.需要双指针 right 和left。刚开始思考没有考虑使用双指针，而希望用一个指针。
 * 2.遇到问题时没有仔细分析，而是直接看答案
 */
public class BinaryQuery {
    public static void main(String[] args) {
        //val=8
        int[] array={3,5,8,11,20,35,42,59};
        System.out.println(recursion(array, 0,array.length-1,59));
    }

    public static int query(int arrs[],int value){

        int left=0;
        int right=arrs.length-1;
        while(left<right) {
            int mid = (right+left) >> 1;
            //System.out.println(mid);
            if (arrs[mid] == value) {
                return mid;
            } else if (arrs[mid] < value) {
                left=mid+1;
            } else if (arrs[mid] > value) {
                right=mid;
            }
        }
        return -1;
    }

    public static int recursion(int arrs[],int left,int right,int findVal){
        if(left>right){
            return -1;
        }
        int mid=(left+right)>>1;
        if(findVal>arrs[mid]){
            return recursion(arrs,mid+1,right,findVal);
        }else if(findVal<arrs[mid]){
            return recursion(arrs,left,mid-1,findVal);
        }else {
            return mid;
        }
    }
}
