package IBSjavaBasic;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("введите 2  числа");
        Scanner g = new Scanner(System.in);
        int one = g.nextInt();
        int two = g.nextInt();
        System.out.println("Введите один из символов + - / *");

        char str;
        str = g.next().charAt(0);

         System.out.println(str);

        if( str == '+'){
            int sum = one + two;
            System.out.println(sum);
        } else if (str == '-' ) {
            int raz = one - two;
            System.out.println("raznost =" + ' ' + raz);
        } else if (str == '*' ) {
            int umn = one * two;
            System.out.println("proizvedenie =" + ' ' + umn);
        } else if ( str == '/' ) {
            int del = one / two;
            System.out.println("delenie =" + ' ' + del);
        }else {
            System.out.println("что-то пошло не так");
        }

    }
}
