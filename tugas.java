import java.util.Scanner;

public class NilaiAkhirMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan nama mata kuliah: ");
        String mataKuliah = input.nextLine();
        
        System.out.print("Masukkan nilai tugas dan PR: ");
        double tugasPR = input.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double uts = input.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas = input.nextDouble();
        System.out.print("Masukkan persentase kehadiran: ");
        double kehadiran = input.nextDouble();

        // Perhitungan
        double nilaiAkhir = (10 * kehadiran + 25 * tugasPR + 30 * uts + 35 * uas) / 100;
        
        // Menentukan nilai huruf dengan if-else
        char nilaiHuruf;
        if (nilaiAkhir >= 85) {
            nilaiHuruf = 'A';
        } else if (nilaiAkhir >= 75) {
            nilaiHuruf = 'B';
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = 'C';
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = 'D';
        } else {
            nilaiHuruf = 'E';
        }

        // Menentukan keterangan berdasarkan nilai huruf (switch-case)
        String keterangan;
        switch (nilaiHuruf) {
            case 'A':
                keterangan = "Sangat Baik";
                break;
            case 'B':
                keterangan = "Baik";
                break;
            case 'C':
                keterangan = "Cukup";
                break;
            case 'D':
                keterangan = "Kurang";
                break;
            case 'E':
                keterangan = "Gagal";
                break;
            default:
                keterangan = "Tidak Diketahui";
        }

        // Output
        System.out.println();
        System.out.println("=== HASIL PERHITUNGAN NILAI ===");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Mata Kuliah    : " + mataKuliah);
        System.out.printf("Nilai Akhir    : %.2f\n", nilaiAkhir);
        System.out.println("Nilai Huruf    : " + nilaiHuruf);
        System.out.println("Keterangan     : " + keterangan);
    }
                }
