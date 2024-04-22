import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu girin: ");
        int n = scanner.nextInt();

        double[] numbers = new double[n];

        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". elemanı girin: ");
            numbers[i] = scanner.nextDouble();
        }

        double harmonikOrtalama = harmonikOrtalama(numbers);
        System.out.println("Harmonik Ortalama: " + harmonikOrtalama);
    }

    public static double harmonikOrtalama(double[] numbers) {
        double harmonikSerisiToplami = 0;

        for (double number : numbers) {
            harmonikSerisiToplami += (1 / number);
        }

        return numbers.length / harmonikSerisiToplami;
    }
}
