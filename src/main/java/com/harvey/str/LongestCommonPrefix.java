package com.harvey.str;

/**
 * f l e w t
 * f l e w
 * p l e w o
 *
 * 1.如何遍历第一列
 *
 *  不足：
 *      不会按列遍历。看了题解后才会。首先遍历数组中第一个元素。不管第一个ie元素的长度是多少都可以，最好是字符串最短的。
 *
 * 2.注意点
 *   如果中间的字符全太小，需要判断长度是否等于第一个字符串当前的长度，防止越界
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs={"flew","fle","flewo"};
        System.out.println(get(strs));
    }
    public static String get(String[] strs){
        if (strs == null || strs.length == 0) {
            return "";
        }
        int length = strs[0].length();
        int count =strs.length;
        for(int i=0;i<length;i++){
            char c= strs[0].charAt(i);
            for(int j=0;j<count;j++){
                if(i==strs[j].length() || c!=strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];

    }
}
