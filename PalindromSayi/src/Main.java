import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        
        if (isPalindrom(sayi)) {
            System.out.println(sayi + " bir palindrom sayıdır.");
        } else {
            System.out.println(sayi + " bir palindrom sayı değildir.");
        }
    }
    
    public static boolean isPalindrom(int sayi) {
        int tersSayi = 0;
        int temp = sayi;
        
        while (temp != 0) {
            int sonBasamak = temp % 10;
            tersSayi = tersSayi * 10 + sonBasamak;
            temp /= 10;
        }
        
        return tersSayi == sayi;
    }
}