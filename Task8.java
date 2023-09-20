package IBSjavaBasic;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        //ввод числа с клавиатуры
        // перебрать числа
        // сумировать нечетные числа
        //вывести сумму
        Scanner g = new Scanner(System.in);
        int n = g.nextInt();
        int sum =0;

        for(int i = 0; i <= n; i++){
            if(i % 2 == 0) {
                sum += i;
            }

        }
        System.out.println(sum);
    }
}
