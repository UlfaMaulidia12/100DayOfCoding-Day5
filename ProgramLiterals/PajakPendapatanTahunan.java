package ProgramLiterals;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PajakPendapatanTahunan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ulangi;
        do {
            System.out.println("=== Kalkulator Pajak Pendapatan Tahunan ===");

            System.out.print("Masukkan Pendapatan Tahunan (Desimal)\t: $");
            double pendapatanTahunanDecimal = input.nextDouble();

            System.out.print("Masukkan Tarif Pajak (Persentase)\t: ");
            double tarifPajak = input.nextDouble();

            // Validasi input
            if (pendapatanTahunanDecimal < 0 || tarifPajak < 0 || tarifPajak > 100) {
                System.out.println("Input tidak valid. Pendapatan harus positif, dan tarif pajak harus dalam rentang 0-100%.");
            } else {
                double tarifPajakDecimal = tarifPajak / 100;

                // Menghitung jumlah pajak
                double jumlahPajakDecimal = pendapatanTahunanDecimal * tarifPajakDecimal;

                // Format tampilan dengan dua angka desimal
                DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

                // Menampilkan hasil perhitungan
                System.out.println("Pendapatan Tahunan (Desimal)\t: $" + decimalFormat.format(pendapatanTahunanDecimal));
                System.out.println("Tarif Pajak (Persentase)\t: " + tarifPajak + "%");
                System.out.println("Jumlah Pajak (Desimal)\t: $" + decimalFormat.format(jumlahPajakDecimal));
            }

            System.out.print("Hitung pajak lagi? (Y/N): ");
            ulangi = input.next().charAt(0);
        } while (ulangi == 'Y' || ulangi == 'y');

        input.close();
    }
}
