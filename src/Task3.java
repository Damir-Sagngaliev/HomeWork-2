import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Задание 3");
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберете живетное \n 1. Кошка \n 2. Собака \n 3. Корова \n 4. Петушок");
        int choise = scan.nextInt();
        switch (choise) {
            case 1:
                System.out.println("Мяу");
                break;
            case 2:
                System.out.println("Гав");
                break;
            case 3:
                System.out.println("Му");
                break;
            case 4:
                System.out.println("Кукареку");
                break;
            default:
                System.out.println("Нет такого животного");
                break;
        }

    }
}
