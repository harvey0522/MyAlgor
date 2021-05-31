package com.harvey.str;

import java.util.*;

/**
 * 20. 有效的括号
 * 分析使用map 和 stack 数据结构 O(N)
 * peek只是查询第一个元素 栈
 * pop删除第一个元素
 *
 *
 */
public class MatchStrByStack {
    public static void main(String[] args) {
        //char[] chars={'{','(','[',']',')','}'};
        char[] chars={']'};
        System.out.println( match(chars));
    }
    public static boolean match(char[] chars){
        Map<Character,Character> map =new HashMap();
        map.put(']','[');
        map.put('}','{');
        map.put(')','(');
        Deque<Character> stack=new java.util.LinkedList<Character>();
        for(char target :chars){
            if(map.containsKey(target)){
                //匹配并弹出
                if(map.get(target)!=stack.peek()){
                    return false;
                }
                stack.pop();
            }else {
                stack.push(target);
            }
        }
        return stack.isEmpty();
    }
}
