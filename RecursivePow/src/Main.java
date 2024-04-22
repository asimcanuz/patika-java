import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	      
        System.out.print("Taban değeri giriniz: ");
        int taban = scanner.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int us = scanner.nextInt();
        
        int sonuc = usluSayi(taban, us);
        System.out.println("Sonuç: " + sonuc);
	}
	
	public static int usluSayi(int taban, int us) {
		if(us==0) return 1;
		else return taban * usluSayi(taban,us-1);
	}
}
