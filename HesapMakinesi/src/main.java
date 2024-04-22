import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Hesap Makinesi İşlemleri:");
            System.out.println("1- Toplama");
            System.out.println("2- Çıkarma");
            System.out.println("3- Çarpma");
            System.out.println("4- Bölme");
            System.out.println("5- Üslü Sayı Hesaplama");
            System.out.println("6- Faktoriyel Hesaplama");
            System.out.println("7- Mod Alma");
            System.out.println("8- Dikdörtgen Alan ve Çevre Hesabı");
            System.out.println("0- Çıkış");
            System.out.print("Yapmak istediğiniz işlemi seçin: ");
            int secim = scanner.nextInt();
            
            if (secim == 0) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            
            double sonuc = 0;
            switch (secim) {
                case 1:
                    sonuc = toplama();
                    break;
                case 2:
                    sonuc = cikarma();
                    break;
                case 3:
                    sonuc = carpma();
                    break;
                case 4:
                    sonuc = bolme();
                    break;
                case 5:
                    sonuc = usluSayi();
                    break;
                case 6:
                    sonuc = faktoriyel();
                    break;
                case 7:
                    sonuc = modAlma();
                    break;
                case 8:
                    dikdortgenHesapla();
                    continue;
                default:
                    System.out.println("Geçersiz seçim.");
                    continue;
            }
            
            System.out.println("Sonuç: " + sonuc);
        }
    }
    
    public static double toplama() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Toplama için ilk sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("Toplama için ikinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();
        return sayi1 + sayi2;
    }
    
    public static double cikarma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Çıkarma için ilk sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("Çıkarma için ikinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();
        return sayi1 - sayi2;
    }
    
    public static double carpma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Çarpma için ilk sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("Çarpma için ikinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();
        return sayi1 * sayi2;
    }
    
    public static double bolme() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bölme için ilk sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("Bölme için ikinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();
        if (sayi2 == 0) {
            System.out.println("Bir sayı sıfıra bölünemez!");
            return Double.NaN; // NaN (Not a Number) döndürür
        }
        return sayi1 / sayi2;
    }
    
    public static double usluSayi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban sayıyı girin: ");
        double taban = scanner.nextDouble();
        System.out.print("Üs sayıyı girin: ");
        double us = scanner.nextDouble();
        return Math.pow(taban, us);
    }
    
    public static double faktoriyel() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktoriyelini almak istediğiniz sayıyı girin: ");
        int sayi = scanner.nextInt();
        int faktoriyel = 1;
        for (int i = 2; i <= sayi; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }
    
    public static double modAlma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mod almak için ilk sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("Mod almak için ikinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();
        return sayi1 % sayi2;
    }
    
    public static void dikdortgenHesapla() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dikdörtgenin uzun kenarını girin: ");
        double uzunKenar = scanner.nextDouble();
        System.out.print("Dikdörtgenin kısa kenarını girin: ");
        double kisaKenar = scanner.nextDouble();
        double alan = uzunKenar * kisaKenar;
        double cevre = 2 * (uzunKenar + kisaKenar);
        System.out.println("Dikdörtgenin Alanı: " + alan);
        System.out.println("Dikdörtgenin Çevresi: " + cevre);
    }
}