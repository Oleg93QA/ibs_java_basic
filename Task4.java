package IBSjavaBasic;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("введите 3 натуральных числа");
        Scanner g = new Scanner(System.in);
        int a = g.nextInt();
        int b = g.nextInt();
        int c = g.nextInt();
        int sum = (a + b + c)/3;
        System.out.println("среднее арифметическое = " + ' ' + sum);

        double del = sum / 2;

        if ( Math.floor(del) > 3 ){
            System.out.println("Программа выполнена корректно");
        }else{
            System.out.println("non");
        }

    }
}
