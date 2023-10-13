package ProgramTipeDataKarakter;

import java.util.Scanner;

public class Pajak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ulangi;
        do {
            System.out.println("=== Program Jenis Kelamin ===");

            System.out.print("Masukkan Jenis Kelamin Anda (L/P): ");
            char jenisKelamin = input.next().charAt(0);

            // Validasi input
            if (jenisKelamin == 'L' || jenisKelamin == 'l') {
                System.out.println("Anda adalah seorang Laki-laki.");
            } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
                System.out.println("Anda adalah seorang Perempuan.");
            } else {
                System.out.println("Jenis kelamin tidak valid.");
            }

            System.out.print("Ingin memasukkan jenis kelamin lagi? (Y/N): ");
            ulangi = input.next().charAt(0);
        } while (ulangi == 'Y' || ulangi == 'y');

        input.close();
    }
}
