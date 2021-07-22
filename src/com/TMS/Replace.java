package com.TMS;

public class Replace {
    String string = "Hello World";
    public void replace () {
        System.out.println (string.replace (string.charAt(3), string.charAt(0)));
    }
}
