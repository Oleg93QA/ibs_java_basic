package IBSjavaBasic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Final3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк n: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String maxDistinctCharsString = "";

        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку #" + (i + 1) + ": ");
            String currentString = scanner.nextLine();

            if (countDistinctChars(currentString) > countDistinctChars(maxDistinctCharsString)) {
                maxDistinctCharsString = currentString;
            }
        }

        System.out.println("Строка с максимальным количеством различных символов: " + maxDistinctCharsString);
    }

    private static int countDistinctChars(String str) {
        Map<Character, Boolean> visited = new HashMap<>();

        for (char c : str.toCharArray()) {
            visited.put(c, true);
        }

        return visited.size();
    }
}