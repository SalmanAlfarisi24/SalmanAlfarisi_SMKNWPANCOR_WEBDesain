import java.util.Scanner; 
public class DiskonBelanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total, diskon = 0;

        System.out.print("Masukkan total belanja: ");
        total = input.nextDouble();

        if (total >= 100000 && total <= 200000) {
            diskon = 0.1; // 10%
        } else if (total > 200000) {
            diskon = 0.2; // 20%
        }

        double potongan = total * diskon;         // aritmatika
        total -= potongan;                        // assignment
        System.out.println("Diskon: " + (diskon * 100) + "%");
        System.out.println("Total Bayar Setelah Diskon: Rp" + total);
    }
}
