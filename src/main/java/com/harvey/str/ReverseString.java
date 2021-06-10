package com.harvey.str;

/**
 * helloworld 3 == lowworldhel
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("helloworld", 3));
    }

    public static String reverse(String str,int n){
        StringBuilder res=new StringBuilder();
        for(int i = n; i < n + str.length(); i++)
            res.append(str.charAt(i % str.length()));
        System.out.println(res);

        return res.toString();
    }
}
