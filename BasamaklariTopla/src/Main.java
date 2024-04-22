import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        
        int toplam = 0;
        int kalan;
        
        // Sayının sıfır olana kadar basamaklarını topla
        while(sayi > 0) {
            kalan = sayi % 10; // Sayının son basamağını al
            toplam += kalan; // Toplama ekle
            sayi /= 10; // Sayının son basamağını at
        }
        
        System.out.println("Basamaklar toplamı: " + toplam);
	}

}
