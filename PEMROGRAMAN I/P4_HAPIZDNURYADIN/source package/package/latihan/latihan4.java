import java.util.Scanner;

public class latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float tugas, uas, uts, kehadiran, realisasi;
        float b_kehadiran, b_uts, b_uas, b_tugas;
        float total;
        System.out.print("Input realisasi: ");
        realisasi = input.nextFloat();
        System.out.print("Masukkan kehadiran: ");
        kehadiran = input.nextFloat();

        System.out.print("Masukkan nilai tugas: ");
        tugas = input.nextFloat();

        System.out.print("Masukkan nilai UTS: ");
        uts = input.nextFloat();

        System.out.print("Masukkan nilai UAS: ");
        uas = input.nextFloat();

        b_kehadiran = kehadiran / realisasi * 10;
        b_tugas = tugas * 20 /100;
        b_uts = uts * 30 /100;
        b_uas = uas * 40 /100;

        total = b_kehadiran + b_tugas + b_uts + b_uas;

        System.out.println("Kehadiran: "+ kehadiran + "Dari Realisasi" + realisasi);
        System.out.println("Nilai Tugas: " + tugas + "\nNilai UTS: " + uts + "\nNilai UAS: " + uas + "\nNilai Total: " + total);
        input.close();
}

}