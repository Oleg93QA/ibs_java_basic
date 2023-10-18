package IBSjavaBasic;

public class Task12 {
    public static void main(String[] args) {
      //  Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:
       // 1. Проверить, содержит ли строка подстроку “Java” (используйте contains()). +
        // 2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).+
     //   3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).+
     //   4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.+
    //    5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).

        String str = "I like Java!!!";
        System.out.println(str.contains("Java"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.toUpperCase());

           // for (int i = 0; i < str.length(); i++){
             //   if(str == " a ") {
               //     str == "o ";
    ///
       //         }
         //       System.out.println(str);
           // }

        String newStr = str.replace('a', 'o');
        System.out.println(newStr.substring(7, 11));



    }
}
