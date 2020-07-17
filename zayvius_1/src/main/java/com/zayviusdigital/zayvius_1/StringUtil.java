package com.zayviusdigital.zayvius_1;

public class StringUtil {

    public String reverse(String input) {
        StringBuilder output = new StringBuilder(input);
        return output.reverse().toString();
    }

}