import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Test sayısını al
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt(); // İlk terimi al
            int b = scanner.nextInt(); // İkinci terimi al
            int n = scanner.nextInt(); // Eleman sayısını al

            int sonuc = a;
            for (int j = 0; j < n; j++) {
                sonuc += Math.pow(2, j) * b; // Sonuç hesapla
                System.out.print(sonuc + " ");
            }
            System.out.println();
        }
    }
}
