package ProgramFloatingNumber;

import java.util.Scanner;

public class PajakTahundanBulan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ulangi;
        do {
            System.out.println("=== Kalkulator Pajak ===");
            try {
                // Input pendapatan tahunan (double)
                double pendapatanTahunan = getInput("Masukkan Pendapatan Tahunan (Double)\t: $");
                double tarifPajak1 = getInput("Masukkan Tarif Pajak (Double)\t\t: ");

                // Input pendapatan bulanan (double)
                double pendapatanBulanan = getInput("Masukkan Pendapatan Bulanan (Double)\t: $");
                double tarifPajak2 = getInput("Masukkan Tarif Pajak (Double)\t\t: ");

                double jumlahPajak1 = calculateTax(pendapatanTahunan, tarifPajak1);
                double jumlahPajak2 = calculateTax(pendapatanBulanan, tarifPajak2);

                // Menampilkan hasil perhitungan dengan format yang sesuai
                displayResult("Pendapatan Tahunan (Double)\t", pendapatanTahunan);
                displayResult("Tarif Pajak (Double)\t\t", tarifPajak1);
                displayResult("Pajak Tahunan (Double)\t\t", jumlahPajak1);

                System.out.println();

                displayResult("Pendapatan Bulanan (Double)\t", pendapatanBulanan);
                displayResult("Tarif Pajak (Double)\t\t", tarifPajak2);
                displayResult("Pajak Bulanan (Double)\t\t", jumlahPajak2);

                double totalPajak = jumlahPajak1 + jumlahPajak2;
                displayResult("Total Pajak\t\t\t", totalPajak);
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Pastikan Anda memasukkan angka yang benar.");
            }

            ulangi = getYesNoInput("Hitung pajak lagi? (Y/N):");
        } while (ulangi == 'Y' || ulangi == 'y');

        input.close();
    }

    // Metode untuk mengambil input dari pengguna
    private static double getInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.nextDouble();
    }

    // Metode untuk menghitung pajak
    private static double calculateTax(double pendapatan, double tarif) {
        return pendapatan * (tarif / 100);
    }

    // Metode untuk menampilkan hasil dengan format yang sesuai
    private static void displayResult(String label, double value) {
        System.out.println(label + ": $" + String.format("%.2f", value));
    }

    // Metode untuk mengambil input 'Y' atau 'N' dari pengguna
    private static char getYesNoInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        String response = input.nextLine().trim();
        if (response.length() > 0) {
            return response.charAt(0);
        }
        return 'N'; // Default value if no input is provided
    }
}
