import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Dizi uzunluğu giriniz: ");
		int uzunluk = scanner.nextInt();
		
		System.out.println("Dizinin elemanlarının giriniz: ");
		int[] numbers = new int[uzunluk];
		for (int i= 0; i<numbers.length;i++) {
			System.out.printf("%d.Elemanı ",i+1);
			numbers[i] = scanner.nextInt();
			
		}
		
		Arrays.sort(numbers);
		
				
		System.out.println("Sıralama");
		Arrays.stream(numbers).forEach(System.out::println);
       
	}

}
