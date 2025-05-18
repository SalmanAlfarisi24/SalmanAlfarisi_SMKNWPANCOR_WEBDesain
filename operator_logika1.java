import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian: ");
        int nilai = input.nextInt();

        // Menggunakan operator logika dan perbandingan
        if (nilai >= 0 && nilai <= 100) { // Validasi nilai
            if (nilai >= 75) {
                System.out.println("Lulus");
            } else {
                System.out.println("Tidak Lulus");
            }
        } else {
            System.out.println("Nilai tidak valid (harus antara 0 - 100)");
        }

        input.close();
    }
}