import java.util.Scanner;

public class Divide3And4 {
private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Sayı Giriniz:");
		int sayi = scanner.nextInt();
		
		int count = 1;
		int toplam = 0;
		int divideCount = 0;
		while(sayi>=count) {
			if(count%4==0 && count%3==0) {
				toplam+=count;
				divideCount++;
			}
			count++;
		}
		System.out.println(toplam/divideCount);
		
	
	}

}
