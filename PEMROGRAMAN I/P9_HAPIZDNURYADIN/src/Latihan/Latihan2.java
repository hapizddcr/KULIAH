/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author hapiz
 */
class BangunDatar {
    int panjang;
    int lebar;

    int luas() {
        return panjang * lebar;
    }
}

class PersegiPanjang extends BangunDatar {
    int keliling() {
        return 2 * (panjang + lebar);
    }
}
public class Latihan2 {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();

        pp.panjang = 15;
        pp.lebar = 10;

        System.out.println("Luas: " + pp.luas());
        System.out.println("Keliling: " + pp.keliling());
    }
}
