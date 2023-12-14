package IBSjavaBasic;

import java.util.Scanner;

public class Final2 {
    public static void main(String[] args) {
        // программа принимает на вход строку длинной 5
       // 1. знак -+ четвертый =
                //2. Первым, третьим и пятым символом являются две цифры (от 0 до 9)
        // и буква ‘x’ (обозначает неизвестное) в любом порядке

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите уравнение (например, 2x+3=8): ");
        String equation = scanner.nextLine();

        int coefficient1 = Character.getNumericValue(equation.charAt(0));
        int coefficient2 = Character.getNumericValue(equation.charAt(2));
        int result = Character.getNumericValue(equation.charAt(4));

        int x = 0;

        if (equation.charAt(1) == '+') {
            x = result - coefficient1 - coefficient2;
        } else if (equation.charAt(1) == '-') {
            x = coefficient1 - coefficient2 - result;
        }

        System.out.println("Решение уравнения: x = " + x);
    }
}
