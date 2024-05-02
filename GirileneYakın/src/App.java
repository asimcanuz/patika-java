import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int[] dizi = { 15, 12, 788, 1, -1, -778, 2, 0 };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Girilen Sayi");
        int girilenSayi = scanner.nextInt();
        int kucukEnYakin = Integer.MIN_VALUE;
        int buyukEnYakin = Integer.MAX_VALUE;

           for (int eleman : dizi) {
            if (eleman < girilenSayi && eleman > kucukEnYakin) {
                kucukEnYakin = eleman;
            }
            if (eleman > girilenSayi && eleman < buyukEnYakin) {
                buyukEnYakin = eleman;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + kucukEnYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + buyukEnYakin);

    }
}
