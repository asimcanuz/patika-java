import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
	 private char[][] map;
	    private char[][] mines;
	    private int size;
	    private int numMines;
	    private int numUncovered;
	    private boolean gameOver;

	    public MineSweeper(int size) {
	        this.size = size;
	        this.map = new char[size][size];
	        this.mines = new char[size][size];
	        this.numMines = size * size / 4; // Mayın sayısı, eleman sayısının çeyreği
	        this.numUncovered = 0;
	        this.gameOver = false;
	        initializeMap();
	        placeMines();
	    }
	    public void initializeMap() {
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                map[i][j] = '-';
	            }
	        }
	    }

	    public void placeMines() {
	        Random random = new Random();
	        int count = 0;
	        while (count < numMines) {
	            int row = random.nextInt(size);
	            int col = random.nextInt(size);
	            if (mines[row][col] != '*') {
	                mines[row][col] = '*';
	                count++;
	            }
	        }
	    }

	    public boolean isValidCoordinate(int row, int col) {
	        return row >= 0 && row < size && col >= 0 && col < size;
	    }

	    public boolean isMine(int row, int col) {
	        return mines[row][col] == '*';
	    }

	    public int countAdjacentMines(int row, int col) {
	        int count = 0;
	        for (int i = row - 1; i <= row + 1; i++) {
	            for (int j = col - 1; j <= col + 1; j++) {
	                if (isValidCoordinate(i, j) && isMine(i, j)) {
	                    count++;
	                }
	            }
	        }
	        return count;
	    }

	    public void uncover(int row, int col) {
	        if (isValidCoordinate(row, col) && map[row][col] == '-') {
	            int numAdjacentMines = countAdjacentMines(row, col);
	            map[row][col] = (char) (numAdjacentMines + '0');
	            numUncovered++;
	            if (numAdjacentMines == 0) {
	                uncover(row - 1, col - 1);
	                uncover(row - 1, col);
	                uncover(row - 1, col + 1);
	                uncover(row, col - 1);
	                uncover(row, col + 1);
	                uncover(row + 1, col - 1);
	                uncover(row + 1, col);
	                uncover(row + 1, col + 1);
	            }
	        }
	    }

	    public void play() {
	        Scanner scanner = new Scanner(System.in);
	        while (!gameOver) {
	            printMap();
	            System.out.println("Satır ve sütun giriniz (0-indexed): ");
	            int row = scanner.nextInt();
	            int col = scanner.nextInt();

	            if (!isValidCoordinate(row, col)) {
	                System.out.println("Geçersiz koordinal. Lütfen koordinatları tekrar giriniz.");
	                continue;
	            }

	            if (map[row][col] != '-') {
	                System.out.println("Bu koordinat zaten girildi. Başka bir konum giriniz.");
	                continue;
	            }

	            if (isMine(row, col)) {
	                gameOver = true;
	                System.out.println("Oyun bitti! Kaybettiniz");
	                map[row][col] = '*'; // Mayını göster
	            } else {
	                uncover(row, col);
	                if (numUncovered == size * size - numMines) {
	                    gameOver = true;
	                    System.out.println("Bravooooo\n Kazandınız!");
	                }
	            }
	        }
	        scanner.close();
	        printMap(); // Oyun sonunda haritayı göster
	    }

	    public void printMap() {
	        System.out.println("Mayınların Konumu");
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                System.out.print(map[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}