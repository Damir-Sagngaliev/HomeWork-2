import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        int n = sc.nextInt();
        int ych = 0;
        for (int i = 0; i < n; i++) {
            a = sc.nextDouble();
            if (a > 30.0) {
                ych++;
            }
        }
        System.out.printf("%.0f %d\n", Math.ceil(200.0 * ych / 900) , ych);

    }
}
