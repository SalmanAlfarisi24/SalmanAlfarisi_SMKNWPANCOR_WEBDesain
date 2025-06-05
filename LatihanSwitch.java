import java.util.Scanner;

public class Latihan2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data mahasiswa
        System.out.println("===== SISTEM LAYANAN AKADEMIK =====");
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        // Menampilkan menu layanan
        System.out.println("\n=== MENU LAYANAN ===");
        System.out.println("1. Lihat Jadwal Kuliah");
        System.out.println("2. Lihat Nilai Semester");
        System.out.println("3. Ajukan Cuti Akademik");
        System.out.println("4. Daftar KKN");
        System.out.println("5. Konsultasi Dosen Wali");
        System.out.print("Pilih menu (1-5): ");
        int pilihan = input.nextInt();

        // Menangani pilihan dengan switch-case
        System.out.println("\n===== INFORMASI MAHASISWA =====");
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("--------------------------------");

        switch (pilihan) {
            case 1:
                tampilkanJadwalKuliah();
                break;
            case 2:
                tampilkanNilai();
                break;
            case 3:
                ajukanCutiAkademik();
                break;
            case 4:
                daftarKKN();
                break;
            case 5:
                konsultasiDosenWali();
                break;
            default:
                System.out.println("Pilihan tidak tersedia.");
        }

        input.close();
    }

    public static void tampilkanJadwalKuliah() {
        System.out.println(">> Jadwal Kuliah:");
        System.out.println("- Senin     : Pancasila - 08:00");
        System.out.println("- Selasa    : Pemrograman Java - 10:00");
        System.out.println("- Kamis     : Struktur Data - 13:00");
    }

    public static void tampilkanNilai() {
        System.out.println(">> Nilai Semester Genap:");
        System.out.println("- Pancasila         : A");
        System.out.println("- Pemrograman Java  : A-");
        System.out.println("- Struktur Data     : B+");
    }

    public static void ajukanCutiAkademik() {
        System.out.println(">> Pengajuan Cuti:");
        System.out.println("Status: Pengajuan cuti berhasil disimpan untuk Semester Ganjil 2025.");
    }

    public static void daftarKKN() {
        System.out.println(">> Pendaftaran KKN:");
        System.out.println("Status: Anda telah terdaftar dalam KKN Gelombang 2 di Desa Sukamakmur.");
    }

    public static void konsultasiDosenWali() {
        System.out.println(">> Jadwal Konsultasi Dosen Wali:");
        System.out.println("- Dosen  : Dr. Budi Santoso");
        System.out.println("- Waktu  : Jumat, pukul 10:00-12:00 WIB");
        System.out.println("- Tempat : Ruang Dosen 104");
    }
}
