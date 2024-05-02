import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		
		int[] numbers = {10, 20, 20, 10, 10, 20, 5, 20};

		Map<Integer, Integer> numberCounts = new HashMap<>();
	    for (int number : numbers) {
	    	if (numberCounts.containsKey(number)) {
	    		numberCounts.put(number, numberCounts.get(number) + 1);
	        } else {
	        	numberCounts.put(number, 1);
	        }
	     }
	    
	    for (Map.Entry<Integer, Integer> entry : numberCounts.entrySet()) {
            if (entry.getValue() > 1 && entry.getKey() % 2 == 0) {
                System.out.printf("%d sayısı %d kere tekrar edildi\n",entry.getKey(),entry.getValue());
            }
        }
	    
	    
	    
	    
	}

}
