import java.util.Random;
import java.util.Arrays;

public class BarGrafiği {
    public static void main(String[] args) {

        int[] ciro = new int[12];
        Random random = new Random();

        // 1K (1000) ile 10K (10000) arasında rastgele değerler atama
        for (int i = 0; i < ciro.length; i++) {

            ciro[i] = random.nextInt(9001) + 1000;
        }

        System.out.println("Aylık Ciro Verileri (Simülasyon): " + Arrays.toString(ciro));
        System.out.println("--------------------------------------------------");

        // --- Yatay Bar Grafiği ---
        System.out.println(" Yatay bar grafiği\n");

        for (int i = 0; i < ciro.length; i++) {
            int ay = i + 1;
            int yildizSayisi = ciro[i] / 1000;

            System.out.printf("%2d.: ", ay);

            for (int j = 0; j < yildizSayisi; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n--------------------------------------------------\n");

        // --- Dikey Bar Grafiği ---
        System.out.println(" Dikey bar grafiği\n");

        int maxYildiz = 0;
        for (int deger : ciro) {
            int yildiz = deger / 1000;
            if (yildiz > maxYildiz) {
                maxYildiz = yildiz;
            }
        }

        for (int satir = maxYildiz; satir >= 1; satir--) {
            // Her satırda 12 ayı kontrol et
            for (int i = 0; i < 12; i++) {
                int buAyinYildizi = ciro[i] / 1000;

                if (buAyinYildizi >= satir) {
                    System.out.print(" * ");
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= 12; i++) {
            System.out.printf(" %-3d", i);
        }
        System.out.println();
    }
}
