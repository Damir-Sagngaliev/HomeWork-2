import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Задание 8");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите начение X и Y -");
        int x = scan.nextInt();
        int y = scan.nextInt();
        if (x % 2 == 0 && y % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
