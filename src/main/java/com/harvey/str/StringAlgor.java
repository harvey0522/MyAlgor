package com.harvey.str;

/**
 * KMP算法
 */
public class StringAlgor {
    public static void main(String[] args) {
        String str="defabc";
        int n=2;
        String res="";
        for(int i = n; i < n + str.length(); i++)
            res += str.charAt(i % str.length());
        System.out.println(res);
    }

}
