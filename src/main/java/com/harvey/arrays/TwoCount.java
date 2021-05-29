package com.harvey.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 求两数之和 对应的元素下标
 * [3,2,6,1,3,7] 9
 */
public class TwoCount {
    public static void main(String[] args) {
        int[] arrs={3,2,4,2,3,7};
        int target=9;
        System.out.println(Arrays.toString(getIndexByCount(arrs, target)));
    }

    public static int[] getIndexByCount(int[] arrs,int target){
        if(arrs==null || arrs.length==0)
            return null;

        Map<Integer,Integer> map=new HashMap(arrs.length-1);
        for(int i=0;i<arrs.length;i++){
            if(map.containsKey(target-arrs[i])){
                return new int[]{map.get(target-arrs[i]),i};
            }
            map.put(arrs[i],i);
        }
        return new int[]{};
    }
}
