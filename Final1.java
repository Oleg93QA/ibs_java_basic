package IBSjavaBasic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Final1 {
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        double dolar = g.nextDouble();
        double kol = g.nextDouble();
        g.close();
        double result = dolar* kol;
        DecimalFormat w = new DecimalFormat("#.###");
    String result2 = w.format(result);
        System.out.println(result2);
    }
}
