import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        // EBOB hesaplama
        int ebob = 1;
        int sayac = 1;
        while (sayac <= sayi1 && sayac <= sayi2) {
            if (sayi1 % sayac == 0 && sayi2 % sayac == 0) {
                ebob = sayac;
            }
            sayac++;
        }

        // EKOK hesaplama
        int ekok = (sayi1 * sayi2) / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
