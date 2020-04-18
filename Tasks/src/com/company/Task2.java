package com.company;

public class Task2 {
    public static String repeat(String string, int n){
        String ans = "";
        for(int i = 0; i < string.length(); i++){
            for(int j = 0; j < n; j++){
                ans += string.charAt(i);
            }
        }
        return ans;
    }
    public static int differenceMaxMin(int[] a){
        int max = a[0];
        int min = a[0];
        for(int i = 0; i < a.length; i++){
            if(max < a[i])max = a[i];
            if(min > a[i])min = a[i];
        }
        return max - min;
    }
    public static boolean isAvgWhole(int[] a){
        double avg = 0;
        for(int i =0; i < a.length; i++){
            avg += a[i];
        }
        avg = avg/a.length;
        return (int)avg - avg == 0;
    }
    public static int[] cumulativeSum(int[] a){
        for(int i = 1; i < a.length; i++){
            a[i] += a[i-1] ;
        }
        return a;
    }
    public static int getDecimalPlaces(String string){
        String[] number = string.split(".");
        return number[1].length();
    }
    public static int Fibonacci(int n){
        int[] a = new int[n + 1];
        a[0] = 1;
        a[1] = 1;
        for(int i = 2; i <= n; i++){
            a[i] = a[i-1]+a[i-2];
        }
        return a[n];
    }
    public static boolean isValid(String index){
        try {
            return (Integer.parseInt(index) > 9999 && Integer.parseInt(index) < 100000);
        }
        catch (NumberFormatException e){
            return false;
        }
    }
    public static boolean isStrangePair(String string1, String string2){
        return (string1.charAt(0) == string2.charAt(string2.length() - 1))
                && (string1.charAt(string1.length() - 1) == string2.charAt(0));
    }
    public static boolean isPrefix(String word, String prefix){
        return word.startsWith(prefix.substring(0,prefix.length()-2));
    }
    public static boolean isSuffix(String word, String suffix){
        return word.endsWith(suffix.substring(1));
    }
    public static int boxSeq(int step){
        return (step / 2) * 2 + 3 * ((step % 2 == 1)? 1 : 0);
    }


}
