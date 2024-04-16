import java.util.Scanner;

public class ArtikYilHesapla {

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Yıl Giriniz:");
		int yil = scanner.nextInt();
		if(yil%4==0 || (yil/100 == 0 && yil%400==0)) System.out.println(yil+" bir artık yıldır!");
		else System.out.println(yil+ " bir artık yıl değildir");
	}

}
