import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Задание 4");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите начение X и Y -");
        int x = scan.nextInt();
        int y = scan.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("I");
        } else if (x < 0 && y > 0) {
            System.out.println("II");
        } else if (x < 0 && y < 0) {
            System.out.println("III");
        } else if (x > 0 && y < 0) {
            System.out.println("IV");
        } else {
            System.out.println("Точка вне зоны плоскости");


        }

    }
}
