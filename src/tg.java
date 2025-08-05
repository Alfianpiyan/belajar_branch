import java.util.Scanner;

public class tg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Menambahkan deklarasi Scanner
        int saldoAwal = 50000;
        int saldoMinimum = 50000;

        System.out.println("Saldo awal: " + saldoAwal);
        System.out.println("Saldo minimum yang diizinkan: " + saldoMinimum);

        while (true) {
            System.out.print("Masukkan jumlah uang yang ingin ditarik (0 untuk berhenti): ");
            int jumlahTarik = scanner.nextInt();

            if (jumlahTarik == 0) {
                break;
            }

            if (jumlahTarik > saldoAwal) {
                System.out.println("Jumlah uang yang ingin ditarik melebihi saldo awal.");
            } else if (saldoAwal - jumlahTarik < saldoMinimum) {
                System.out.println("Jumlah uang yang ingin ditarik melebihi saldo minimum yang diizinkan.");
            } else {
                saldoAwal -= jumlahTarik;
                System.out.println("Saldo akhir: " + saldoAwal);
            }
        }

        scanner.close();
    }
}
