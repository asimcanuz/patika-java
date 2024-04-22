import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elmasın yüksekliğini girin (tek sayı olmalı): ");
        int yukseklik = scanner.nextInt();
        
        // Üst yarım
        for (int i = 1; i <= yukseklik; i++) {
            // Boşlukları yazdır
            for (int j = 1; j <= yukseklik - i; j++) {
                System.out.print(" ");
            }
            // Yıldızları yazdır
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Alt yarım
        for (int i = yukseklik - 1; i >= 1; i--) {
            // Boşlukları yazdır
            for (int j = 1; j <= yukseklik - i; j++) {
                System.out.print(" ");
            }
            // Yıldızları yazdır
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
