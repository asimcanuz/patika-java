import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sayı Giriniz: ");
        int sayi = scanner.nextInt();
        
        if (asalMi(sayi, sayi / 2)) {
            System.out.println(sayi + " sayısı ASALDIR!");
        } else {
            System.out.println(sayi + " sayısı ASAL değildir!");
        }
    }
    
    public static boolean asalMi(int sayi, int i) {
        if (i == 1) {
            return true;
        } else {
            if (sayi % i == 0) {
                return false;
            } else {
                return asalMi(sayi, i - 1);
            }
        }
    }
}
