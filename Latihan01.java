import java.util.Scanner; // Mengimpor kelas Scanner untuk input dari pengguna

public class PenentuJabatan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner

        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine(); // Membaca input nama

        System.out.print("Masukkan jenis kelamin Anda (Laki-laki/Perempuan): ");
        String jenisKelamin = input.nextLine(); // Membaca input jenis kelamin

        System.out.print("Masukkan tinggi badan Anda (dalam cm): ");
        double tinggiBadan = input.nextDouble(); // Membaca input tinggi badan

        // Logika penentuan jabatan
        if (jenisKelamin.equalsIgnoreCase("laki-laki")) { // Menggunakan equalsIgnoreCase untuk mengabaikan kapitalisasi
            if (tinggiBadan == 165) {
                System.out.println("Petugas Teller");
            } else {
                System.out.println("Karyawan Biasa");
            }
        } else if (jenisKelamin.equalsIgnoreCase("perempuan")) {
            if (tinggiBadan == 160) {
                System.out.println("Sekretaris");
            } else {
                System.out.println("Cleaning Service");
            }
        } else {
            System.out.println("Input jenis kelamin tidak valid.");
        }

        input.close(); // Menutup objek Scanner untuk menghindari kebocoran sumber daya
    }
}
