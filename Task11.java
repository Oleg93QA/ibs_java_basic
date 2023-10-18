package IBSjavaBasic;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
       // 1. Ввести первое число с клавиатуры и записать его в строковую переменную.
      //  2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
     //   3. Сравнить 2 числа и вывести большее на экран
     //   4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
        Scanner g = new Scanner(System.in);
String str = g.next();
        //System.out.println(str);
        int a = g.nextInt();
        Integer b = new Integer(str);
        int max = Math.max(a, b);
 System.out.println("максимальноечисло = " + ' ' + max);

    Double dob = new Double(str);
        Double dob1 = new Double(a);
     //   System.out.println(dob1);
        System.out.println("минимальное чтсло = " + ' ' + Math.min(dob,dob1));
    }
}
