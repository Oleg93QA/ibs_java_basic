package IBSjavaBasic;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        final int X = 8;
        final int Y = 54;
        final int Z = 1;
        Scanner cs = new Scanner(System.in);

        System.out.println("введите размер массива");
        int razmer = cs.nextInt();
        int[] array = new int[razmer];

        for (int i = 0; i < array.length; i++) {
            array[i] = cs.nextInt();
            //  System.out.println(array[i] );
        }

        for (int i = 0; i < array.length; i++) {
            while (array[i] == X || array[i] == Y || array[i] == Z) {

            }
            System.out.println("Данное значение имеется в константах");
        }

        System.out.println("Константы нет и быть не может");


    }
}
