package IBSjavaBasic;

import java.util.Scanner;

public class Final4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;
        boolean hintUsed = false;

        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");

        while (attempts > 0) {
            System.out.print("Ваш ответ: ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("Заархивированный вирус")) {
                System.out.println("Правильно!");
                break;
            } else if (answer.equalsIgnoreCase("Подсказка") && !hintUsed) {
                System.out.println("Подсказка: Это что-то, что может повредить ваш компьютер.");
                hintUsed = true;
            } else if (hintUsed) {
                System.out.println("Подсказка уже недоступна.");
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Подумай еще! У вас осталось " + attempts + " попыток.");
                } else {
                    System.out.println("Обидно, приходи в другой раз");
                }
            }
        }

        scanner.close();
    }
}
    }
}
