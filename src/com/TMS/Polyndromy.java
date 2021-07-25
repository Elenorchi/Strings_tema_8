package com.TMS;

import java.util.ArrayList;

public class Polyndromy {
    String string = "Он зашел в кабак и сделал заказ";
    private int a = 0;
String b;
    public void polyndrom() {
        String[] words = (string.split(" "));
        ArrayList<String> ar = new ArrayList<String>();
        for (String word : words) {
            if (word.length() > 2) {
                for (int i = 0; i < word.length() / 2; i++) {
                    if (word.charAt(i) == word.charAt(word.length() - i - 1)) {
                        a++;
                    }
                }
                if (a == word.length()/2) {
                    ar.add(word);
                    a=0;
                }
            }
        }
        String str = String.join(" ", ar);
        System.out.println (str);
    }
}