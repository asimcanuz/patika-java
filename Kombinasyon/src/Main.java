import java.util.Scanner;
public class Main {

    public static int faktoriyel(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * faktoriyel(n - 1);
    }

    public static int kombinasyon(int n, int r) {
        return faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n değerini girin: ");
        int n = scanner.nextInt();
        System.out.print("r değerini girin: ");
        int r = scanner.nextInt();

        if (n < r) {
            System.out.println("Hatalı giriş: n, r'den küçük olamaz.");
        } else {
            int sonuc = kombinasyon(n, r);
            System.out.println("C(" + n + "," + r + ") = " + sonuc);
        }
    }

}
