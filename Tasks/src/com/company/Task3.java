package com.company;

public class Task3 {
    public static int solutions(double a, double b, double c){
        if(b * b - 4 * a * c > 0)return 2;
        else if(b * b - 4 * a * c == 0) return 1;
        return 0;
    }
    public static int findZip(String string){
        string = string.replaceFirst("zip", "");
        if(string.contains("zip"))return string.indexOf("zip") + 3;
        return -1;
    }
    public static boolean checkPerfect(int n){
        int mn_sum = 0;
        for(int i = 1; i < (n/2) + 1; i++){
            if(n % i == 0)mn_sum += i;
        }
        return mn_sum == n;
    }
    public static String flipEndChars(String string){
        if(string.length() == 2)return "Incompatible";
        if(string.charAt(0) == string.charAt(string.length() - 1))return "Two's a pair";
        return string.charAt(string.length() - 1) + string.substring(1 , string.length() - 1) + string.charAt(0);
    }
    public static boolean isValidHexCode(String string){
        if(string.charAt(0) != '#' || string.length() != 7)return false;
        for (int i = 1; i <= 6; i++){
            char c = string.charAt(i);
            if(!((c >= 48 && c <= 57) ||  (c >= 65 && c <= 70) ||  (c >= 97 && c <= 102)))return false;
        }
        return true;
    }
    public static boolean same(int[] a, int[] b){
        int unique1 = 0;
        int unique2 = 0;
        for (int i = 0; i < a.length; i++){
            int temp = -1;
            for (int j = 0; j < a.length; i++){
                if(a[i] == a[j])temp++;
            }
            unique1 += temp;
        }
        for (int i = 0; i < b.length; i++){
            int temp = -1;
            for (int j = 0; j < b.length; i++){
                if(b[i] == b[j])temp++;
            }
            unique2 += temp;
        }
        return a.length - unique1 == b.length - unique2;
    }
    public static boolean isKaprekar(int n){
        int square = n * n;
        int l;
        if(String.valueOf(square).length() % 2 == 0) l = String.valueOf(square).length() / 2;
        else l = (String.valueOf(square).length() / 2) + 1;
        return ((square - (square % Math.pow(10,l)))/Math.pow(10,l)) + (square % Math.pow(10,l)) == n;
    }
    public static String longestZero(String string){
        String ans = "";
        int max = 0;
        int temp = 0;
        for(int i =0; i < string.length(); i++){
            if(string.charAt(i) == '1')temp = 0;
            else {
                temp++;
                if(max < temp)max = temp;
            }
        }
        for (int i =0; i< max; i++){
            ans +='0';
        }
        return ans;
    }
    public static int nextPrime(int n){
        while (true){
            for (int i = 2; i < n/2; i++){
                if(n % i == 0)break;
                else if(i == n/2 - 1) return n;
            }
            n++;
        }
    }
    public static boolean rightTriangle(int a, int b, int c){
        if( a*a == b*b + c*c || b*b == a*a + c*c || c*c == b*b + a*a)return true;
        return false;
    }


}
