public class KacısLabirenti {

    static int N = 5;

    public static void main(String[] args) {


        int[][] labirent = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 1, 1, 1},
                {1, 1, 1, 0, 1}
        };

        int[][] cozum = new int[N][N];

        System.out.println("--- Alıştırma 5.1: Labirent Çözücü ---");

        // Başlangıç noktası (0, 0)
        if (yoluBul(labirent, 0, 0, cozum)) {
            System.out.println("Çıkış yolu bulundu:");
            cozumuYazdir(cozum);
        } else {
            System.out.println("Çıkışa giden bir yol bulunamadı.");
        }
    }

    static boolean yoluBul(int[][] labirent, int x, int y, int[][] cozum) {

        if (x == N - 1 && y == N - 1 && labirent[x][y] == 1) {
            cozum[x][y] = 1;
            return true;
        }
        if (isGuvenli(labirent, x, y, cozum)) {

            cozum[x][y] = 1;

            // AŞAĞI hareket etmeyi dene (x + 1)
            if (yoluBul(labirent, x + 1, y, cozum))
                return true;

            // SAĞA hareket etmeyi dene (y + 1)
            if (yoluBul(labirent, x, y + 1, cozum))
                return true;

            // YUKARI hareket etmeyi dene (x - 1)
            if (yoluBul(labirent, x - 1, y, cozum))
                return true;

            // SOLA hareket etmeyi dene (y - 1)
            if (yoluBul(labirent, x, y - 1, cozum))
                return true;

            cozum[x][y] = 0;
            return false;
        }

        return false;
    }

    static boolean isGuvenli(int[][] labirent, int x, int y, int[][] cozum) {

        return (x >= 0 && x < N && y >= 0 && y < N &&
                labirent[x][y] == 1 && cozum[x][y] == 0);
    }

    static void cozumuYazdir(int[][] cozum) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(cozum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
