import java.util.Scanner;

public class Pajak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ulangi;
        do {
            System.out.println("=== Kalkulator Pajak ===");

            System.out.print("Masukkan Pendapatan Tahunan\t: $");
            double pendapatanTahunan = input.nextDouble();

            System.out.print("Masukkan Batas Pendapatan untuk Pajak: $");
            double batasPendapatan = input.nextDouble();

            // Validasi input
            if (pendapatanTahunan < 0 || batasPendapatan < 0) {
                System.out.println("Input tidak valid. Pendapatan dan batas pendapatan harus positif.");
            } else {
                // Membuat variabel boolean untuk menentukan apakah harus membayar pajak
                boolean harusBayarPajak = pendapatanTahunan > batasPendapatan;

                // Menampilkan hasil perhitungan
                System.out.println("Pendapatan Tahunan \t\t: $" + pendapatanTahunan);
                System.out.println("Batas Pendapatan untuk Pajak \t: $" + batasPendapatan);

                // Menggunakan variabel boolean untuk menentukan apakah harus membayar pajak
                if (harusBayarPajak) {
                    System.out.println("Anda harus membayar pajak.");
                } else {
                    System.out.println("Anda tidak harus membayar pajak.");
                }
            }

            System.out.print("Hitung pajak lagi? (Y/N): ");
            ulangi = input.next().charAt(0);
        } while (ulangi == 'Y' || ulangi == 'y');

        input.close();
    }
}
