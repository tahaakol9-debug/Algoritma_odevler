import java.util.Scanner;

public class UcgenSayilar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Üçgen Sayılar ---");
        int N = 5;
        System.out.print("N=" + N + " üçgen sayılar= ");
        for (int i = 1; i <= N; i++) {
            System.out.print(ucgenSayiBul(i) + " ");
        }
        System.out.println("\n");

        System.out.println("--- Üçgen Çizme Programı ---");
        System.out.print("Bir tam sayı girin: ");
        int n = scanner.nextInt(); // Kullanıcıdan satır sayısını al

        int sayac = 1;
        // Satır döngüsü (1'den n'e kadar)
        for (int i = 1; i <= n; i++) {
            // Sütun döngüsü (Her satırda satır numarası kadar sayı yazar)
            for (int j = 1; j <= i; j++) {
                System.out.print(sayac + " ");
                sayac++;
            }
            System.out.println(); // Alt satıra geç
        }

        scanner.close();
    }

    public static int ucgenSayiBul(int n) {
        if (n == 1) {
            return 1;
        }
        return n + ucgenSayiBul(n - 1);
    }
}
