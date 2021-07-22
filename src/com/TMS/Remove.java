package com.TMS;

public class Remove {
    String string = "Hello World";

    public void remove (int index1, int index2) {
        String PartForCutting = string.substring( index1, index2 );
        System.out.println (string.replace(PartForCutting, ""));
    }
}
