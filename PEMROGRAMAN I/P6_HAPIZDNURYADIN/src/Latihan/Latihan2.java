/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author hapiz
 */
class Persegi {
    int sisi;

    int hitungLuas() {
        return sisi * sisi;
    }

    int hitungKeliling() {
        return 4 * sisi;
    }
}
public class Latihan2 {
    public static void main(String[] args) {
        Persegi p = new Persegi();

        p.sisi = 20;

        System.out.println("Luas: " + p.hitungLuas());
        System.out.println("Keliling: " + p.hitungKeliling());
    }
}
