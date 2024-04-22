import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kaç tane sayı gireceksiniz? ");
        int n = scanner.nextInt();
        
        int sayi;
        int enBuyuk = Integer.MIN_VALUE; // En büyük sayıyı saklamak için başlangıç değeri
        int enKucuk = Integer.MAX_VALUE; // En küçük sayıyı saklamak için başlangıç değeri
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı girin: ");
            sayi = scanner.nextInt();
            
            // En büyük sayıyı güncelle
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }
            
            // En küçük sayıyı güncelle
            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }
        
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}
