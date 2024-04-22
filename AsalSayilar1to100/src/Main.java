public class Main {
    public static void main(String[] args) {
        System.out.println("1 ile 100 arasındaki asal sayılar:");
        
        for (int i = 2; i <= 100; i++) {
            boolean asalMi = true; // Başlangıçta asal olduğunu varsayalım
            
            // 2'den başlayarak i'nin yarısına kadar olan sayılarla bölünüp bölünmediğini kontrol ediyoruz
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    asalMi = false; // Bölünüyorsa asal değil
                    break; // Döngüyü sonlandırıyoruz, zaten asal değil artık
                }
            }
            
            // Eğer asalsa ekrana yazdır
            if (asalMi) {
                System.out.print(i + " ");
            }
        }
    }
}