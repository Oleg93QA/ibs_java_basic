package IBSjavaBasic;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[5];
     for(int i = 0; i < array.length; i++){
         array[i] = (int)(Math.random() * 100);
        // System.out.println(array[i] + ' ');
     }
     int a = array[0];
     array[0] = array[4];
     array[4] = a;
        for(int i = 0; i < array.length; i++){
         //   System.out.println("новый массив"  + ' '+ array[i] + ' ');

        }
        System.out.println(array[0] + array[2]);
    }
}
