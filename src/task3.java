public class task3 {
    public static void main(String[] args) {

        int[] a = new int[6];
        int[] b = new int[4];
        int[] max;
        int[] min;

        int a = 678598;
        int b = 3454;


        max = (a.length > b.length ? a : b);
        min = (a.length < b.length ? a : b);

        for (int i = 0; i < min.length; i++) {
            max[i] += min[i];

            System.out.println(" Сумма элементов массива " + max[i]);
        }
    }
}
