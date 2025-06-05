import java.util.Scanner;

public class LatihanIF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();
        input.nextLine(); 
        // Nested if
        String kategoriUmur;
        if (umur >= 0) {
            if (umur <= 12) {
                kategoriUmur = "Anak-anak";
            } else if (umur <= 17) {
                kategoriUmur = "Remaja";
            } else if (umur <= 59) {
                kategoriUmur = "Dewasa";
            } else {
                kategoriUmur = "Lansia";
            }
        } else {
            kategoriUmur = "Umur tidak valid";
        }

        // ternary
        String jenisUmur = (umur % 2 == 0) ? "Genap" : "Ganjil";

        // switch-case
        System.out.print("Pilih hari (1=Senin, 2=Selasa, ..., 7=Minggu): ");
        int hari = input.nextInt();
        String aktivitas;

        switch (hari) {
            case 1:
                aktivitas = "Belajar Java";
                break;
            case 2:
                aktivitas = "Olahraga pagi";
                break;
            case 3:
                aktivitas = "Baca buku";
                break;
            case 4:
                aktivitas = "Bersih-bersih rumah";
                break;
            case 5:
                aktivitas = "Main game santai";
                break;
            case 6:
                aktivitas = "Jalan-jalan sore";
                break;
            case 7:
                aktivitas = "Istirahat dan refleksi";
                break;
            default:
                aktivitas = "Hari tidak valid";
        }

        // Output
        System.out.println("\n=== Informasi Pengguna ===");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Kategori Umur: " + kategoriUmur);
        System.out.println("Umur Anda adalah bilangan " + jenisUmur);
        System.out.println("Aktivitas Hari Ini: " + aktivitas);
    }
}
