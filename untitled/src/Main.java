import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Задача 1");
//        task1();
//        System.out.println("Задача 2");
//        task2();
        System.out.println("Задача 4");
        task4();

    }
 //   Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 //   и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 //   вместо этого, необходимо повторно запросить у пользователя ввод данных.
    static void task1(){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        if (iScanner.hasNextFloat()) {
            float namFloat = iScanner.nextFloat();
            System.out.println(namFloat);
        } else {
            System.out.println("Некорректный ввод!");
        }
    }
    // Задание 2. Если необходимо, исправьте данный код
//        try {
//            int d = 0;
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }
    //Думаю здесь имеется ввиду два момента: это обращение к несуществующему элементу массива и деление на ноль.
    // Оба этих исключения относятся к unchecked, поэтому в коде нужно предупредить появляение таких ошибок.
    static void task2(){
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        if (intArray.length < 9) {
            System.out.println("В массиве нет элемента с индексом 8");
        } else {
            int d = 6;
            if (d == 0) {
                System.out.println("Невозможно деление на 0");
            } else {
                double catchedRes1 = intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            }

        }
    }
    // Задание 3. В данном примере так же есть операция деления, значит нужно предвидеть деление на нуль
// и ошибка обращения к несуществующему элементну массива, поэтому нет необходимости использовать конструкцию try catch
// так как это исключения unchecked. Решение аналогично тому, что приведено в первом задании.
// А в методе printSum нет необходимости использовать конструкцию throws FileNotFoundException. Ошибки могут возникнуть,
// если при вызове метода в качестве аргументов подать не целые числа, внутри метода на мой взгляд ошибок возникнуть не может
//код должен выглядеть вот так:
// public static void printSum(Integer a, Integer b) {
//    System.out.println(a + b);
//}

//Задание 4.Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//        Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    static void task4(){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = iScanner.nextLine();
        if (str.length()!= 0){
            System.out.println("Вы ввели строку: "+ str);
        } else {
            System.out.println("Пустые строки вводить нельзя");
        }
    }

}





