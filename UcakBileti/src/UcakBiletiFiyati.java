import java.util.Scanner;

public class UcakBiletiFiyati {

	private static final Scanner scanner = new Scanner(System.in);
	Logger logger = Logger.

	public static void main(String[] args) {
		int mesafe;
		int yas;
		int yolculukTipi;
		
		// 0,10 TL/km
		
		System.out.print("Mesafeyi km türünden giriniz : ");
		mesafe = scanner.nextInt();
		System.out.print("Yaşınızı giriniz : ");
		yas = scanner.nextInt();
		System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş : ");
		yolculukTipi = scanner.nextInt();
		
		if((yolculukTipi!=1 && yolculukTipi!=2 ) || mesafe<0 || yas <0 ) {
			System.out.println("Hatalı Veri Girdiniz!");
			return;
		}
 
		double tutar = (double)mesafe * 0.10;
		
		if(yas<12) {
			tutar = tutar*0.5;
		}
		else if(yas>12 && yas<24) {
			tutar = tutar*0.9;
		}else if(yas>65) {
			tutar = tutar*0.7;
		}
		
		if(yolculukTipi ==2) {
			tutar = (tutar*0.8)*2;
		}
		
		System.out.println("Toplam Tutar ="+tutar+" TL");
		
	}

}
