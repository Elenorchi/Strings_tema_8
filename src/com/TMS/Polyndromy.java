package com.TMS;

public class Polyndromy {
    String string = "Он зашел в кабак и сделал заказ";

    public void polyndrom() {
        String[] words = (string.split(" "));
        for (String word : words) {
            if (word.length() > 2) {
                for (int i = 0; i < word.length() / 2; i++) {
                    if (word.charAt(i) == word.charAt(word.length() - i -1)) {
                        System.out.print(word + " ");
                        break;
                    }
                }
            }
        }
    }
}