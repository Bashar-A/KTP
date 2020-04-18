package com.company;

public class Task1 {
    public static int remainder(int a, int b){
        return a % b;
    }
    public static double triArea(double a, double b){
        return a * b / 2;
    }
    public static int animals(int chickens, int cows, int pigs){
        return chickens * 2 + cows * 4 + pigs * 4;
    }
    public static boolean profitableGamble(double prob, double prize, double pay){
        return prob * prize > pay;
    }
    public static String operation(int N, int a, int b){
        if(a + b == N)return "added";
        else if(a - b == N)return "subtracted";
        else if(a * b == N)return "multiplied";
        else if(a / b == N)return "divided";
        return "none";
    }
    public static int ctoa(char c){
        return c;
    }
    public static int addUpTo(int n){
        return (n + 1) * n / 2;
    }
    public static int nextEdge(int a, int b){
        return a + b - 1;
    }
    public static int sumOfCubes(int[] a){
        int sum = 0;
        for (int i =0; i < a.length; i++){
            sum += a[i]* a[i]*a[i];
        }
        return sum;
    }
    public static boolean abcmath(int a, int b, int c){
        for(int i = 0; i < b; i++){
            a +=a;
        }
        return a % c == 0;
    }
}
