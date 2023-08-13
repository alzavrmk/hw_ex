import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите дробное число: ");
        if (iScanner.hasNextFloat()){
            float namFloat = iScanner.nextFloat();
            System.out.println(namFloat);
        } else {
            System.out.println("Введено некорректное число!");
        }
        //iScanner.close();
    }
}