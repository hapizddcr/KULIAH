/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

 */

package Latihana;

/**
 *
 * @author hapiz
 */
import java.util.Scanner;
public class Latihan1 {
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
        else if (nilai > 60) grade = "C";
        else if (nilai > 55) grade = "D";
        else grade = "E";
        
        System.out.println("Nilai: " + nilai +"\nGrade: " + grade);
    }
   input.close();
}
}
