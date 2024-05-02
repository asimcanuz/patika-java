import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*System.out.print("Dizi uzunluğu giriniz:");
		int uzunluk = scanner.nextInt();
		
		int[] numbers = new int[uzunluk];
		for (int i= 0; i<numbers.length;i++) {
			System.out.printf("%d.eleman",i+1);
			numbers[i] = scanner.nextInt();
			
		}*/
		
        int[] numbers = {2, 3, 4, 5, 6, 7, 8,8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 20, 21, 22,22, 23, 24, 25};

		
		  Map<Integer, Integer> numberCounts = new HashMap<>();

	        for (int number : numbers) {
	            if (numberCounts.containsKey(number)) {
	                numberCounts.put(number, numberCounts.get(number) + 1);
	            } else {
	                numberCounts.put(number, 1);
	            }
	        }

	        System.out.println("Tekrar eden çift sayılar:");
	        for (Map.Entry<Integer, Integer> entry : numberCounts.entrySet()) {
	            if (entry.getValue() > 1 && entry.getKey() % 2 == 0) {
	                System.out.println(entry.getKey());
	            }
	        }
	}

}
