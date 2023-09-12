package IBSjavaBasic;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("что вы хотите перевести? 1 - массу или 2 - расстояние");
        Scanner g = new Scanner(System.in);
        int a = g.nextInt();

        if(a == 1){
            System.out.println("введите массу в граммах");
            int mas = g.nextInt();
            double kg = mas  % 1000;
            int tonna = mas * 1000000;
            System.out.println("Тонна = " + ' ' + tonna + " килограммы = " + kg);
        }
        if ( a == 2){
            System.out.println("введите массу в расстояние в киломметрах ");
            int ras = g.nextInt();
            int km = ras * 1000;
            double mili = ras * 0.62;
            double iard = ras  * 1093.61;
            System.out.println("киллометры = " + ' ' + km + ' ' + "мили = " + ' ' + mili + " ярды = " + ' ' + iard );
        }


    }
}
