import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan nama mata kuliah: ");
        String mataKuliah = input.nextLine();
        System.out.print("Masukkan nilai tugas dan PR (0-100): ");
        double tugasPR = input.nextDouble();
        System.out.print("Masukkan nilai UTS (0-100): ");
        double uts = input.nextDouble();
        System.out.print("Masukkan nilai UAS (0-100): ");
        double uas = input.nextDouble();
        System.out.print("Masukkan persentase kehadiran (0-100): ");
        double kehadiran = input.nextDouble();

        // Perhitungan
        double nilaiAkhir = (10 * kehadiran + 25 * tugasPR + 30 * uts + 35 * uas) / 100;

        // Output
        System.out.println(nama + " mendapatkan nilai akhir " + nilaiAkhir + " pada mata kuliah " + mataKuliah);
    }
}
