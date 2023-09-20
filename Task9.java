package IBSjavaBasic;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        //создать массив  типа дабл +
        //заполнить массив с клавиатуры, размер массива тоже с клавы+
        // посчитать ср арифметическое+
        // вывести элементы массив на экран и умножить на ср арифметическое

        Scanner cs = new Scanner(System.in);
        System.out.println("введите размер массива");
        int razmer = cs.nextInt();
        double [] mas = new double[razmer];
        double sred = 0;
        System.out.println("заполните массив");

        for(int i = 0; i < mas.length; i++){
            mas[i] = cs.nextDouble();
            sred += mas[i];
        }
        sred = sred / razmer;
                          System.out.println(sred);
                              for (int i = 0; i < mas.length; i++){
                                  double []newMas = new double[razmer];
                                   newMas[i] = mas[i] * sred;
                                  System.out.println("new array =" + ' ' + newMas[i]);
             }

    }
}
