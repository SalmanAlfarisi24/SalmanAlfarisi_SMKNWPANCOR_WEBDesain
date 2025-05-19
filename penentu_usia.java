import java.util.Scanner;

public class KategoriUsia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        if (umur >= 0 && umur <= 12) {
            System.out.println("Kategori: Anak-anak");
        } else if (umur <= 17) {
            System.out.println("Kategori: Remaja");
        } else if (umur <= 59) {
            System.out.println("Kategori: Dewasa");
        } else {
            System.out.println("Kategori: Lansia");
        }
    }
}
