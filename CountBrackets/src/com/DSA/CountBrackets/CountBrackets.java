package com.DSA.CountBrackets;

public class CountBrackets {
    public static void main(String[] args) {
        String text = "(())))";
        int result = BracketMatch(text);
        System.out.println("output: " + result);
    }

    static int BracketMatch(String text) {
        int count = 0;
        int ans = 0;
        int n = text.length();

        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == '(') {
                count++;
            } else if (text.charAt(i) == ')') {
                count--;
            }
            if (count < 0) {
                ans++;
                count++;
            }
        }

        return ans + count;
    }
}
