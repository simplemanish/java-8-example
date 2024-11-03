package com.example;

import java.util.Arrays;

public class StringMethodsExampleJava8 {
    public static void main(String[] args) {
        String str = "   Hello World   ";
        
        // Equivalent for isBlank()
        System.out.println(isBlank(str)); // false

        // Equivalent for strip() (same as trim() in Java 8 for ASCII whitespace)
        System.out.println(str.trim()); // "Hello World"

        // Equivalent for stripLeading() and stripTrailing()
        System.out.println(stripLeading(str)); // "Hello World   "
        System.out.println(stripTrailing(str)); // "   Hello World"

        // Equivalent for repeat(int)
        System.out.println(repeat("Hi ", 3)); // "Hi Hi Hi "
        
        // Equivalent for lines()
        String multiline = "Java\nKotlin\nPython";
        Arrays.stream(multiline.split("\n")).forEach(System.out::println);
        // Output:
        // Java
        // Kotlin
        // Python
    }

    // isBlank() equivalent in Java 8
    public static boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }

    // stripLeading() equivalent in Java 8
    public static String stripLeading(String str) {
        return str.replaceAll("^\\s+", "");
    }

    // stripTrailing() equivalent in Java 8
    public static String stripTrailing(String str) {
        return str.replaceAll("\\s+$", "");
    }

    // repeat() equivalent in Java 8
    public static String repeat(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
