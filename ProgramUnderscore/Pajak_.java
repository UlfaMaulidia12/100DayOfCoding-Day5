package ProgramUnderscore;

import java.util.Scanner;

public class Pajak_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ulangi;
        do {
            System.out.println("=== Program Angka ===");

            System.out.print("Masukkan angka: ");
            int angka = input.nextInt();

            System.out.println("Angka yang Anda masukkan: " + angka);

            // Operasi matematika sederhana (contoh: kuadrat)
            int kuadrat = angka * angka;
            System.out.println("Kuadrat angka: " + kuadrat);

            System.out.print("Ingin memasukkan angka lagi? (Y/N): ");
            ulangi = input.next().charAt(0);
        } while (ulangi == 'Y' || ulangi == 'y');

        input.close();
    }
}
