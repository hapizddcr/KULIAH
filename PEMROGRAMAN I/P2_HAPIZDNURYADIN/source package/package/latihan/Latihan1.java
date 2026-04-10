import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int usia;
        String alamat; 
        System.out.print("Masukkan nama Anda: ");
        nama = input.nextLine();
        System.out.print("Masukkan usia Anda: ");
        usia = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Alamat Anda: ");
        alamat = input.nextLine();
        System.out.println("Nama " + nama + "\nUsia: " + usia + "\nAlamat: " + alamat);
        input.close();
    }
}
