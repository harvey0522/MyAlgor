package com.harvey.str;

/**
 * leetcode :344. 反转字符串
 * 使用双指针
 */
public class StrReverseDemo {
    public static void main(String[] args) {
        char[] chars={'4','3','2','1','0'};
        reverse(chars);
        System.out.println(new String(chars));
    }
    public static void reverse(char[] chars){
        int left=0;
        int right=chars.length-1;

        while(left<right){
            char temp=chars[right];
            chars[right]=chars[left];
            chars[left]=temp;
            right--;
            left++;
        }
    }
}
