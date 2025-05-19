import java.util.Scanner;

public class NilaiAkhirMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input Nama Mahasiswa
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();

        // Input Nama Mata Kuliah
        System.out.print("Masukkan nama mata kuliah: ");
        String mataKuliah = input.nextLine();

        // Input Nilai Tugas dan PR
        System.out.print("Masukkan nilai tugas dan PR (0-100): ");
        double tugasPR = input.nextDouble();

        // Input Nilai UTS
        System.out.print("Masukkan nilai UTS (0-100): ");
        double uts = input.nextDouble();

        // Input Nilai UAS
        System.out.print("Masukkan nilai UAS (0-100): ");
        double uas = input.nextDouble();

        // Input Kehadiran
        System.out.print("Masukkan persentase kehadiran (0-100): ");
        double kehadiran = input.nextDouble();

        // Proses Perhitungan
        double nilaiAkhir = (10 * kehadiran + 25 * tugasPR + 30 * uts + 35 * uas) / 100;

        // Output
        System.out.println();
        System.out.println("=== HASIL PERHITUNGAN NILAI ===");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Mata Kuliah    : " + mataKuliah);
        System.out.println("Nilai Akhir    : " + nilaiAkhir);
        System.out.println(nama + " mendapatkan nilai akhir " + nilaiAkhir + " pada mata kuliah " + mataKuliah);
    }
}
