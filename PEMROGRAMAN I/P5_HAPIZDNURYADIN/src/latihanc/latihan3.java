/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanc;

/**
 *
 * @author hapiz
 */
import java.util.Scanner;

public class latihan3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int kehadiran, realisasi;
        int tugas, uts, uas;
        double nilaiAkhir, validasi, nilaiKehadiran;
        String grade;

        System.out.print("Masukkan Jumlah Pertemuan: ");
        realisasi = input.nextInt();

        System.out.print("Masukkan Kehadiran: ");
        kehadiran = input.nextInt();

        System.out.print("Masukkan Nilai Tugas: ");
        tugas = input.nextInt();

        System.out.print("Masukkan Nilai UTS: ");
        uts = input.nextInt();

        System.out.print("Masukkan Nilai UAS: ");
        uas = input.nextInt();

        validasi = realisasi * 75 / 100.0;

        nilaiKehadiran = (kehadiran * 100.0) / realisasi;

        nilaiAkhir = (nilaiKehadiran * 0.1) +
                     (tugas * 0.2) +
                     (uts * 0.3) +
                     (uas * 0.4);

        if (kehadiran >= validasi) {
            if (nilaiAkhir > 80) grade = "A";
            else if (nilaiAkhir > 70) grade = "B";
            else if (nilaiAkhir > 60) grade = "C";
            else if (nilaiAkhir > 55) grade = "D";
            else grade = "E";
        } else {
            if (nilaiAkhir > 55) grade = "D";
            else grade = "E";
        }

        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Grade: " + grade);

        if (grade.equals("E")) {
            System.out.println("Kamu Tidak Lulus");
        }

        input.close();
    }
}