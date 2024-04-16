import java.util.Scanner;

public class TekleriTopla {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int toplam = 0;

		while(true) {
			System.out.print("Tek girine kadar sayı gir:  " );
			int sayi = scanner.nextInt();
			
			if(sayi%2==0) {
				toplam+=sayi;
			}else {
				break;
			}
		}
		System.out.println("Toplam: "+ toplam);
	}

}
