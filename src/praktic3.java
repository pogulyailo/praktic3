import java.util.Scanner;

public class praktic3 {
    public static void main(String[] args) {

        int a = 123;
        int b = 4246;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a: ");
        a = in.nextInt();
        System.out.println("Введите число b ");
        b = in.nextInt();
        System.out.print(" Число ");

        while (a != 0) {
            System.out.print(a % 10);
            a = a / 10;
        }
        System.out.print(" Число ");
        while (b != 0) {
            System.out.print(b % 10);
            b = b / 10;
        }
    }
}
