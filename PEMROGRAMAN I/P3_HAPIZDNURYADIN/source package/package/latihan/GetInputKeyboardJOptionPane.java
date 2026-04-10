import javax.swing.JOptionPane;

public class GetInputKeyboardJOptionPane {
    public static void main(String[] args) {
        String nama = "";

        nama = JOptionPane.showInputDialog("Ketik Nama Anda: ");
        String msg = "Hello " + nama + "\nLanjutkan belajarnya pasti menjadi programmer Java !";
        JOptionPane.showMessageDialog(null, msg);
    }
}
