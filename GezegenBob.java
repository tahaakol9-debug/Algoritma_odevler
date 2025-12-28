public class GezegenBob {
    public static void main(String[] args) {
        System.out.println("--- Gezegen Bob Geçerli İsimler ---");
        System.out.println("Geçerli İsimler:");

        int sayac = 0;

        for (char h1 = 'a'; h1 <= 'z'; h1++) {

            // İkinci harf (a-z arası)
            for (char h2 = 'a'; h2 <= 'z'; h2++) {

                char h3 = h1; // KURAL 1: İlk ve üçüncü harf aynı olmalı.

                // Harflerin türünü belirle
                boolean h1Unlu = isUnlu(h1);
                boolean h2Unlu = isUnlu(h2);

                // KURAL: İsim "ünsüz-ünlü-ünsüz" (CVC) ya da "ünlü-ünsüz-ünlü" (VCV) olmalı.
                // Bu durumda h1 ünlü ise h2 ünsüz olmalı, veya tam tersi.
                // Yani iki harfin türü birbirinden farklı olmalı.
                if (h1Unlu != h2Unlu) {

                    int toplam = (int)h1 + (int)h2 + (int)h3;

                    // KURAL 2: Toplam asal sayı olmalı
                    if (isAsal(toplam)) {
                        sayac++;

                        System.out.println(sayac + ". " + h1 + h2 + h3);
                    }
                }
            }
        }

        System.out.println("\nToplam bulunan isim sayısı: " + sayac);
    }

    // Ünlü harfler: a, e, i, o, u
    public static boolean isUnlu(char harf) {
        return harf == 'a' || harf == 'e' || harf == 'i' || harf == 'o' || harf == 'u';
    }

    //  Sayı asal mı?
    public static boolean isAsal(int sayi) {
        if (sayi < 2) return false;
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) return false;
        }
        return true;
    }
}
