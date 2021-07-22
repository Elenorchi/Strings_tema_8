package com.TMS;

public class Main {
    /* Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
       последнего вхождения сивола(B). */
    public static void main(String[] args) {
        Remove rem = new Remove();
        rem.remove(2, 6);

/* Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в
позиции 0 */
        Replace rep = new Replace();
        rep.replace();

  /* В исходном файле находятся слова, каждое слово на новой стороке. После
запуска программы должен создать файл, который будет содержать в себе
только полиндромы */
        Polyndromy pol = new Polyndromy();
        pol.polyndrom();
    }
}
