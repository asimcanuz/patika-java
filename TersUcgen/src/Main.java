import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak Sayısı: ");
        int basamakSayisi = scanner.nextInt();

        for (int i = basamakSayisi; i >= 1; i--) {
            // Her satırda i adet yıldız yazdır
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Her satırın sonunda bir alt satıra geç
        }
    }
}
