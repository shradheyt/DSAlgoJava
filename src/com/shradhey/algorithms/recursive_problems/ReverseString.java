package com.shradhey;

/**
 * Created by Shradhey Tripathi on 1/19/2019
 */
public class ReverseString {
    private static String reverse(String str) {
        return helperReverse(str,0);
    }
    private static String helperReverse(String str,int index) {
        if(index == str.length()) return "";
        String reversed = helperReverse(str,index+1);

        return reversed + String.valueOf(str.charAt(index));
    }
    public static void main(String[] args) {
        System.out.println(reverse("abcde"));
    }
}
