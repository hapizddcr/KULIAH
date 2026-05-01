/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author hapiz
 */
import java.util.Scanner;
public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        int umur;

        System.out.print("Masukkan nama: ");
        nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        umur = input.nextInt();

        System.out.println("\n=== INFORMASI KAMU ===");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }
}
