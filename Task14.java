package IBSjavaBasic;


import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
     //   Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:
      //  1. Выведите максимальный и минимальный элемент массива.
       // 2. Из максимального и минимального значения выведите наибольшее по модулю.

        int[] array = new int[15];

        for(int i = 0; i < array.length; i++){
            array[i] = ((int)(Math.random() * 20) - 40 );
            System.out.println(array[i]);
        }
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        System.out.println("maksimalno = " + ' ' + max);
        System.out.println("minimalno = " + ' ' + min);
        int min2 = Math.abs(min);
        int max2 = Math.abs(max);
        System.out.println(Math.max(max, min ));



    }
}
