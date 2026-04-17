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

        
        realisasi = inputAngka(input, "Jumlah Pertemuan");
        kehadiran = inputAngka(input, "Kehadiran");

        
        while (kehadiran > realisasi) {
            System.out.println("Kehadiran tidak boleh melebihi jumlah pertemuan!");
            kehadiran = inputAngka(input, "Kehadiran");
        }

        tugas = inputNilai(input, "Tugas");
        uts = inputNilai(input, "UTS");
        uas = inputNilai(input, "UAS");

       
        validasi = realisasi * 75 / 100.0;

        
        nilaiKehadiran = (kehadiran * 100.0) / realisasi;

        
        nilaiAkhir = (nilaiKehadiran * 10 / 100.0) +
                     (tugas * 20 / 100.0) +
                     (uts * 30 / 100.0) +
                     (uas * 40 / 100.0);

        
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

    
    public static int inputAngka(Scanner input, String teks) {
        String data;
        int nilai;

        while (true) {
            System.out.print("Masukkan " + teks + ": ");
            data = input.next();

            if (!data.matches("[0-9]+")) {
                System.out.println("Input harus berupa angka!");
                continue;
            }

            nilai = Integer.parseInt(data);

            if (nilai < 0) {
                System.out.println("Angak tidak boleh negatif!");
            } else {
                break;
            }
        }
        return nilai;
    }

    
    public static int inputNilai(Scanner input, String teks) {
        String data;
        int nilai;

        while (true) {
            System.out.print("Masukkan Nilai " + teks + ": ");
            data = input.next();

            
            if (!data.matches("[0-9]+")) {
                System.out.println("Input harus berupa angka!");
                continue;
            }

            nilai = Integer.parseInt(data);

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai harus antara 0 - 100!");
            } else {
                break;
            }
        }
        return nilai;
    }
}