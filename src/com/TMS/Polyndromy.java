package com.TMS;

public class Polyndromy {
    String string = "Он зашел в кабак и сделал заказ";
    int a = 0;

    public void polyndrom() {
        String[] words = (string.split(" "));
        for (String word : words) {
            if (word.length() > 2) {
                for (int i = 0; i < word.length() / 2; i++) {
                    if (word.charAt(i) == word.charAt(word.length() - i - 1)) {
                        a++;
                    }
                }
                if (a == word.length()/2) {
                    System.out.print(word + " ");
                    a=0;
                }
            }
        }
    }
}