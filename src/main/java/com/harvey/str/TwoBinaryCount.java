package com.harvey.str;

/**
 * 字符串二进制求和
 * 101+011 =1000 约等于 101^011 111
 * 影藏知识需要表达出来 ascll 码 0=48 9=57
 *
 */
public class TwoBinaryCount {
    public static void main(String[] args) {
        System.out.println(Character.valueOf('3'));
        System.out.println('9'-'3');
        //System.out.println(addBinary("111", "010011"));
        System.out.println(addOct("123", "1467"));
    }

    public static String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int ca = 0;
        for(int i = a.length() - 1, j = b.length() - 1;i >= 0 || j >= 0; i--, j--) {
            int sum = ca;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            ans.append(sum % 2);
            ca = sum / 2;
        }
        ans.append(ca == 1 ? ca : "");
        return ans.reverse().toString();
    }

    public static String addOct(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int ca = 0;
        for(int i = a.length() - 1, j = b.length() - 1;i >= 0 || j >= 0; i--, j--) {
            int sum = ca;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            ans.append(sum % 10);
            ca = sum / 10;
        }
        ans.append(ca == 1 ? ca : "");
        return ans.reverse().toString();
    }


    public static String count(String a,String b){
        StringBuilder sb=new StringBuilder();
        int sentinel=0;
        for(int i=a.length()-1,j=b.length()-1;i>=0 || j>=0;i--,j--){
            //遗漏点 要把前一位的进制保存在变量中
            int sum=sentinel;
            sum+=i>=0?a.charAt(i):'0';
            sum+=j>=0?a.charAt(j):'0';
            sb.append(sum%10);
            sentinel=sum/10;
        }
        sb.append(sentinel==1?sentinel:"");
        return sb.reverse().toString();
    }
}
