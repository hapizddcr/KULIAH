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
public class Latihan2 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        double r, luas;

        System.out.print("Masukkan jari-jari: ");
        r = input.nextDouble();

        luas = 3.14 * r * r;

        System.out.println("Luas lingkaran: " + luas);
    }
}
