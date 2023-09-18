import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r; // elemanlar
        int countn = 1, countr = 1, countf = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("İlk kümeniz kaç elemanlı ? =");
        n = in.nextInt();
        System.out.print("İkinci kümeniz kaç elemanlı ? = ");
        r = in.nextInt();

        if (r <= n) { // r, n'den küçük veya eşit olmalı
            for (int i = 1; i <= n; i++) {
                countn = countn * i;
            }
            for (int i = 1; i <= r; i++) {
                countr = countr * i;
            }
            for (int i = 1; i <= (n - r); i++) { // (n - r) aralığına kadar döngü
                countf = countf * i;
            }
            int C = countn / (countr * countf); // Kombinasyon hesaplama formülü
            System.out.println(C);
        } else {
            System.out.println("Hata: r, n'den büyük olamaz.");
        }
    }
}