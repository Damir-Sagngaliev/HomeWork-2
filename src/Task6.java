import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Задание 6");
        Scanner scan = new Scanner(System.in);
        int dayInYear = 0;
        System.out.println("Введите год - ");
        int year = scan.nextInt();
        if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) {
            System.out.println("Високосный");
            dayInYear = 366;
        } else {
            System.out.println("Не високосный");
            dayInYear = 365;
        }
        System.out.println("В году " + year + " дней " + dayInYear);

    }
}
