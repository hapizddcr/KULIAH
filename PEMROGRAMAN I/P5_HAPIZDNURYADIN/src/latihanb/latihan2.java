/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

 */

package Latihanb;

/**
 *
 * @author hapiz
 */
import java.util.Scanner;
public class latihan2 {
public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    
    int kehadiran, nilai;
    float validasi;
    String grade;
    
    System.out.print("Masukkan Kehadiran: ");
    kehadiran = input.nextInt();
    
    System.out.print("Masukkan Total Nilai: ");
    nilai = input.nextInt();
    
    validasi = 21 * 75 / 100;
    if (kehadiran >= validasi){
        if (nilai > 80) grade = "A";
        else if (nilai > 70) grade = "B";
        else grade = "C";
        
        System.out.println("Nilai: " + nilai +"\nGrade: " + grade);
    } else {
        if ( nilai > 55) grade = "D";
        else grade = "E";
        
        System.out.println("Kamu Mendapatkan Nilai: " + nilai + "\nGrade: " + grade + "\nKamu Tidak Lulus");
    }
   input.close();
}
}
