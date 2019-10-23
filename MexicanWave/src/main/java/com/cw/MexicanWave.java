package com.cw;

import java.util.ArrayList;
import java.util.List;

public class MexicanWave {
    public static void main(String[] args) {
        wave("hello").forEach(a-> System.out.println(a));
    }

    private static List<String> wave(String text) {
        text = text.toLowerCase();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            String result = text.substring(0, i) + String.valueOf(text.charAt(i)).toUpperCase() + text.substring(i + 1);
            list.add(result);
        }

        return list;
    }
}
