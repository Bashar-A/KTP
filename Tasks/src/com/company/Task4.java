package com.company;

import java.util.ArrayList;

public class Task4 {
    public static ArrayList<String> bessi(int n, int k, String text){
        ArrayList<String> ans = new ArrayList<String>();
        String[] temp = text.split(" ");
        int j = 0;
        for(int i = 0; i < temp.length; i++){
            if(ans.get(j).length() + temp[i].length() > k)j++;
            ans.set(j,ans.get(j)+" " + temp[i]);
        }
        return ans;
    }

    public static String[] clasterSkobok(String string){
        String ans = "";
        int otkr = 0;
        int zakr = 0;
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == '(')otkr++;
            if(string.charAt(i) == ')')zakr++;
            ans += string.charAt(i);
            if(otkr == zakr)ans += " ";
        }
        return ans.split(" ");
    }

    public static String toCamelCase(String string){
        while (string.contains("_")){
            char temp = string.charAt(string.indexOf("_") + 1);
            string.replaceFirst("_"+temp, String.valueOf(Character.toUpperCase(temp)));
        }
        return string;
    }

    public static String toSnakeCase(String string){
        for (int i = 0; i < string.length() ; i++){
            if(Character.isUpperCase(string.charAt(i))){
                string.replaceFirst(String.valueOf(string.charAt(i)),
                        "_" + Character.toLowerCase(string.charAt(i)));
            }
        }
        return string;
    }

    public static String overTime(double[] a){
        double money = 0;
        double overtime = 0;
        if(a[1] > 17) overtime = a[1] - 17;
        money = (a[1]-a[0]-overtime)*a[2] + (overtime * a[2]*a[3]);
        return "$" + String.format("%.2f",money);
    }

    public static String BMI(String mas, String length){
        double m, l;
        String[] temp = mas.split(" ");
        m = Double.parseDouble(temp[0]);
        if (temp[1].equals("pounds"))m = m / 2.205;
        temp = length.split(" ");
        l = Double.parseDouble(temp[0]);
        if (temp[1].equals("inches"))l = l / 39.37;
        double bmi = m / (l * l);
        if(bmi < 18.5)return String.format("%.1f",bmi) + " Underweight";
        else if (bmi >= 18.5 && bmi < 25)return String.format("%.1f",bmi) + " Normal weight";
        else return String.format("%.1f",bmi) + " Overweight";
    }

    public static int bugger(int n){
        int temp = 1, times = 0;
        while (n > 9) {
            temp = temp * (n % 10);
            n = n / 10;
            if (n < 10) {
                temp = temp * (n % 10);
                n = temp;
                temp = 1;
                times++;
            }
        }
        return times;
    }

    public static String toStarShorthand(String string){
        String ans = "";
        char temp = string.charAt(0);
        int n = 1;
        for(int i = 1; i < string.length(); i++){
            if(temp != string.charAt(i) || i == string.length() - 1){
                ans += temp;
                if(n > 1) ans += "*"+ n;
                n = 1;
                temp = string.charAt(i);
            }
            else {
                n++;
            }
        }
        return ans;
    }

    public static boolean doesRhyme(String string1, String string2){
        char t1 = string1.charAt(string1.length() - 1)
                , t2 = string2.charAt(string2.length() - 1);
        if (!Character.isAlphabetic(string1.charAt(string1.length() - 1)))t1 = string1.charAt(string1.length() - 2);
        if (!Character.isAlphabetic(string2.charAt(string2.length() - 1)))t2 = string2.charAt(string2.length() - 2);
        return t1 == t2;
    }

    public static boolean trouble(long a, long b){
        boolean[] n1 = new boolean[10];
        boolean[] n2 = new boolean[10];
        for(int i = 0; i < 10; i++){
            n1[i] = false;
            n2[i] = false;
            int t = 0;
            long temp = a;
            while (temp > 0){
                if(temp % 10 == i)t++;
                else t = 0;
                if(t >= 3)n1[i] = true;
                temp = temp / 10;
            }

            temp = b;
            while (temp > 0){
                if(temp % 10 == i)t++;
                else t = 0;
                if(t >= 2)n2[i] = true;
                temp = temp / 10;
            }
            if(n1[i] == n2[i] && n1[i])return true;
        }
        return false;
    }

    public static int countUniqueBooks(String string, char a){
        int beginIndex = 0;
        int max = 0;
        for(int k = 1; k < string.length(); k++){
            if(string.charAt(k) == a){
                String temp = string.substring(beginIndex,k - 1);
                int unique = 0;
                while (!temp.equals("")){
                    unique++;
                    temp = temp.replaceAll(String.valueOf(temp.charAt(0)),"");
                }
                if(unique > max)max = unique;
                beginIndex = k;
            }
        }
        return max;
    }

}
