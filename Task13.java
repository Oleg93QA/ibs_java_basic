package IBSjavaBasic;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
     //   Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами.
       //         Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:
      //  1. Выведите слова, состоящие только из латиницы.
      //  2. Выведите количество этих слов.

                Scanner scanner = new Scanner(System.in);

                System.out.println("Введите строку из слов, разделенных пробелами:");
                String input = scanner.nextLine();

                String[] words = input.split(" ");

                int latinCount = 0;
                System.out.println("Слова, состоящие только из латиницы:");
                for (String word : words) {
                    if (isLatin(word)) {
                        System.out.println(word);
                        latinCount++;
                    }
                }

                System.out.println("Количество слов, состоящих только из латиницы: " + latinCount);
            }

            public static boolean isLatin(String word) {
                for (char c : word.toCharArray()) {
                    if (!Character.isLetter(c) || !Character.UnicodeBlock.of(c).equals(Character.UnicodeBlock.BASIC_LATIN)) {
                        return false;
                    }
                }
                return true;
            }
        }



