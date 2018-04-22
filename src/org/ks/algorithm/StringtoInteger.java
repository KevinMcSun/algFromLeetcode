package org.ks.algorithm;

/**
 * Created by Kevin on 10/4/2016.
 */
public class StringtoInteger {
    public static int myAtoi(String str) {
        if (str == null)
            return 0;
        str = str.trim();
        if (str.equals("") || str.equals("+") || str.equals("-"))
            return 0;
        if (str.length() == 1){
            if (str.charAt(0) >= '0' && str.charAt(0) <= '9')
                return str.charAt(0) - '0';
            else
                return 0;
        }

        if (str.length() > 1 && (str.charAt(0) == '+' || str.charAt(0) == '-')){
            if (str.charAt(1) < '0' || str.charAt(1) > '9')
                return 0;
        }else if (str.length() > 1 && (str.charAt(0) < '0' || str.charAt(0) > '9')){
            return 0;
        }

        if (str.length() > 1 && (str.charAt(1) == '+' || str.charAt(1) == '-'))
            return 0;

        str = maxLengthInteger(str);
        if (str.charAt(0) == '-'){
            if (str.length() > 11){
                return -2147483648;
            }
            if (str.length() == 11 && str.compareTo("-2147483648") > 0){
                return -2147483648;
            }
            return Integer.parseInt(str);
        }else if (str.charAt(0) == '+'){
            if (str.length() > 11){
                return 2147483647;
            }
            if (str.length() == 11 && str.compareTo("+2147483647") > 0){
                return 2147483647;
            }
            return Integer.parseInt(str.substring(1));
        }else {
            if (str.length() > 10)
                return 2147483647;
            if (str.length() == 10 && str.compareTo("2147483647") > 0)
                return 2147483647;
            return Integer.parseInt(str);
        }
    }

    public static String maxLengthInteger(String str){
        int k = 0;
        if (str.charAt(0) == '-' || str.charAt(0) == '+'){
            k = 1;
            while(true) {
                if (k > str.length() - 1 || (str.charAt(k) < '0' || str.charAt(k) > '9')) {
                    k--;
                    break;
                }
                else
                    k++;
            }
        }else{
            while(true) {
                if (k > str.length() - 1 || (str.charAt(k) < '0' || str.charAt(k) > '9')) {
                    k--;
                    break;
                }
                else
                    k++;
            }
        }
        return str.substring(0, k + 1);
    }

    public static void main(String[] args) {
        System.out.println(myAtoi(" 010"));
    }
}
