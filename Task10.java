package IBSjavaBasic;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        //ввести размер матрицы с клавиатуры +
        // заполнить матрицу с клавиатуры
        // каждый элемент первой строки умножить на 3
        // вывести первую строку матрицы
        System.out.println("vvrdite razmer matricy");
        Scanner g = new Scanner(System.in);
        int a = g.nextInt();
        int [][] arr = new int[a][a];
        int [] arr2 = new int[a];

        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = g.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr2[i] = arr[i][j] * 3;
                System.out.print(" " + arr2[i] + " ");

            }
        }

    }
}
