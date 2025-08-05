import java.util.Scanner;

public class tugas3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saldo = 50000;
        int pilihan;
        int jumlah;

        System.out.println("=== PROGRAM TABUNGAN SISWA ===");

        do {
            System.out.println("\nSaldo Anda: Rp" + saldo);
            System.out.println("1. Setor Tabungan");
            System.out.println("2. Ambil Tabungan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah uang yang ingin disetor: Rp");
                    jumlah = input.nextInt();
                    saldo += jumlah;
                    System.out.println("Saldo berhasil ditambahkan.");
                    break;
                case 2:
                    if (saldo < 50000) {
                        System.out.println("Maaf, saldo Anda kurang dari minimum penarikan (Rp50.000).");
                    } else {
                        System.out.print("Masukkan jumlah uang yang ingin diambil: Rp");
                        jumlah = input.nextInt();
                        if (saldo - jumlah < 50000) {
                            System.out.println("Maaf, pengambilan gagal. Saldo tidak boleh di ambil jika kurang dari Rp50.000.");
                        } else {
                            saldo -= jumlah;
                            System.out.println("Pengambilan berhasil.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan PROGRAM TABUNGAN SISWA ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 3);
    }
}

