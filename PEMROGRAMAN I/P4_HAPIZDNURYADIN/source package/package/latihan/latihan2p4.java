
public class latihan2p4 {
    public static void main(String[] args) {
    float makanan, transport, belanja;
    float p_makan, p_transport, p_belanja;
    int total;
    makanan = 20000;
    transport = 10000;
    belanja = 50000;

    total = 20000 + 10000 + 50000;

    p_makan = makanan / total * 100;
    p_transport = transport / total * 100;
    p_belanja = belanja / total * 100;

    System.out.println("Hitung Total: ");
    System.out.println("Total : " + total);
    System.out.println("Persentase: ");
    System.out.println("Makan : " + p_makan + "%" + "\nTransport : " + p_transport + "%" + "\nBelanja : " + p_belanja + "%");
    }
}
