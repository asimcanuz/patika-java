import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Harita boyutu giriniz(minimum 2): ");
        int size = scanner.nextInt();
        if (size < 2) {
            System.out.println("Boyutu 2'den büyük girmelisin. Çıkıyoruz...");
            System.exit(0);
        }
        MineSweeper game = new MineSweeper(size);
        System.out.println("Mayın Konumları:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(game.isMine(i, j) ? "* " : "- ");
            }
            System.out.println();
        }
        System.out.println("===========================");
        System.out.println("Oyun başladı!");
        game.play();
    }

}
