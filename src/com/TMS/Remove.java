package com.TMS;

public class Remove {
    String string = "Hello World";
    /* Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
           последнего вхождения сивола(B). */
    public void remove (String letter1, String letter2) {
        int index1 = string.indexOf(letter1);
        int index2 = string.lastIndexOf(letter2);
        String PartForCutting = string.substring( index1, index2+1 );
        System.out.println (string.replace(PartForCutting, ""));
    }
}
