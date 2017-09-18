import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива чисел: ");
        int age = in.nextInt();
        System.out.println("Введите элемент масива : ");
        int[] c;
        c = new int[age];
        for (int i = 0; i < c.length; i++) {
            c[i] = in.nextInt();
                    }
            for (int i = c.length - 1; i >= 0; i--) {
                System.out.println(c[i]);

        }
    }
}
