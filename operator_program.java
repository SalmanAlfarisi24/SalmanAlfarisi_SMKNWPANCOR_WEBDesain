/*1. Program Penilaian Siswa**
**Operator**: Aritmatika, Pembanding, Logika, Assignment**/
import java.util.Scanner;

public class PenilaianSiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tugas, uts, uas;
        double rata2;
        
        System.out.print("Masukkan nilai Tugas: ");
        tugas = input.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        uts = input.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        uas = input.nextInt();

        rata2 = (tugas + uts + uas) / 3.0;  // Aritmatika
        System.out.println("Rata-rata = " + rata2);

        if (rata2 >= 75 && rata2 <= 100) {  // Pembanding + Logika
            System.out.println("Status: LULUS");
        } else {
            System.out.println("Status: TIDAK LULUS");
        }
    }
}



/*2. Program Kalkulator Mini dengan Assignment dan Unary**
**Operator**: Aritmatika, Assignment, Unary**/
public class KalkulatorMini {
    public static void main(String[] args) {
        int a = 10, b = 4;
        int hasil = 0;

        hasil += a + b; // Penjumlahan dan assignment
        System.out.println("Hasil += a + b : " + hasil);

        hasil *= 2; // Assignment dan perkalian
        System.out.println("Hasil *= 2 : " + hasil);

        hasil--; // Unary decrement
        System.out.println("Setelah hasil-- : " + hasil);

        ++hasil; // Unary increment
        System.out.println("Setelah ++hasil : " + hasil);
    }
}


/*3. Program Deteksi Bilangan Ganjil/Genap Positif**
**Operator**: Modulus, Pembanding, Logika**/
import java.util.Scanner;

public class DeteksiGanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan;
        System.out.print("Masukkan bilangan: ");
        bilangan = input.nextInt();

        if (bilangan > 0 && bilangan % 2 == 0) {
            System.out.println("Bilangan genap dan positif");
        } else if (bilangan > 0 && bilangan % 2 != 0) {
            System.out.println("Bilangan ganjil dan positif");
        } else {
            System.out.println("Bilangan bukan positif");
        }
    }
}


/*4. Program Login Sederhana (Boolean + Logika + Pembanding)
**Operator**: Logika, Pembanding**/
import java.util.Scanner;

public class LoginSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput, passInput;
        String username = "admin", password = "1234";

        System.out.print("Username: ");
        userInput = input.next();
        System.out.print("Password: ");
        passInput = input.next();

        boolean loginBerhasil = userInput.equals(username) && passInput.equals(password);
        if (loginBerhasil) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal!");
        }
    }
}


/*5. Program Prediksi Bonus Pegawai
Operator**: Aritmatika, Assignment, Pembanding, Logika+**//

public class BonusPegawai {
    public static void main(String[] args) {
        int gajiPokok = 3000000;
        int jamLembur = 10;
        int bonus = 0;

        if (jamLembur > 5 || gajiPokok < 4000000) {
            bonus += jamLembur * 10000; // aritmatika + assignment
        }

        System.out.println("Total bonus lembur: Rp" + bonus);
    }
}