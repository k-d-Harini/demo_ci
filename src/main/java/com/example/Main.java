package com.example;
public class Main {
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String text = "  Java   makes   string processing easy\n";
        System.out.println("Word count: " + countWords(text)); // Output: 5
    }
}
