/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author hapiz
 */
class Person {
    String nama;

    void tampilkanNama() {
        System.out.println("Nama: " + nama);
    }
}

class Mahasiswa extends Person {
    String nim;

    void tampilkanData() {
        tampilkanNama();
        System.out.println("NIM: " + nim);
    }
}
public class Latihan1 {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();

        m.nama = "HAPIZD NURYADIN";
        m.nim = "241011402448";

        m.tampilkanData();
    }
}
