import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Bir sayı girin: ");
	        int n = scanner.nextInt();
	        recursiveIslem(n);
	    }
	 
	 public static void recursiveIslem(int n) {
	        if (n <= 0) {
	            System.out.println("Son değer: " + n);
	            return;
	        }

	        System.out.println("Son değer: " + n);
	        recursiveIslem(n - 5);
	        System.out.println("Son değer: " + n);
	    }


}
