package com.company;

public class Task6 {

    public static int bell(int n){
        int ans = 0;
        for (int i = 0; i <= n; i++){
            ans += stirling(n,i);
        }
        return ans;
    }
    private static int stirling(int n, int k){
        if(n == 0 && k == 0) return 1;
        if(k == 0) return 0;
        if(k > n) return 0;
        return stirling(n - 1, k - 1) + k * stirling(n - 1, k);
    }

    public static String translateWord(String word){
        String vowelString = "aeiouyAEIOUY";
        String translatedWord = word.substring(1) + word.charAt(0);
        if(vowelString.contains(translatedWord.charAt(word.length() - 1) + ""))translatedWord += "yay";
        else translatedWord += "ay";
        return translatedWord;
    }
    public static String translateSentence(String sentence){
        String translatedSentence = "";
        String[] words = sentence.split(" ");
        for(String word: words){
            if(word.charAt(word.length() - 1) == '.'
                    ||word.charAt(word.length() - 1) == '!'
                    ||word.charAt(word.length() - 1) == '?'
                    ||word.charAt(word.length() - 1) == ','){
                translatedSentence += translateWord(word.substring(0,word.length() - 2)) + word.charAt(word.length() - 1) + " ";
            }
            else translatedSentence += translateWord(word) + " ";
        }
        return translatedSentence.trim();
    }

    public static boolean validColor(String string) {
        String type = string.substring(0, string.indexOf("("));
        String[] numbers = string.substring(string.indexOf("(") + 1, string.indexOf(")")).split(",");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].equals("")) return false;
        }
        boolean first = Integer.parseInt(numbers[0]) < 256 && Integer.parseInt(numbers[0]) >= 0;
        boolean second = Integer.parseInt(numbers[1]) < 256 && Integer.parseInt(numbers[1]) >= 0;
        boolean third = Integer.parseInt(numbers[2]) < 256 && Integer.parseInt(numbers[2]) >= 0;
        switch (type) {
            case "rgb":
                if (numbers.length != 3) return false;
                return first && second && third;
            case "rgba":
                if (numbers.length != 4) return false;
                boolean forth = Double.parseDouble(numbers[3]) >= 0 && Double.parseDouble(numbers[3]) < 256;
                return first && second && third && forth;
        }
        return false;
    }

    public static String stripUrlParams(String url){

        return "";
    }



}
