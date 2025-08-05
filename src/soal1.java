import java.util.Scanner;

public class soal1{
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.println("Apakah Anda ingin membeli handphone? (y/n)");
        String beliHandphone = scanner.nextLine();

        if (beliHandphone.equalsIgnoreCase("y")) {
            System.out.println("Pilih merk handphone:");
            System.out.println("1. Samsung");
            System.out.println("2. Oppo");
            System.out.println("3. Xiaomi");
            int merkPilihan = scanner.nextInt();
            scanner.nextLine();  // konsumsi newline

            if (merkPilihan == 1) {
                System.out.println("Pilih tipe handphone Samsung:");
                System.out.println("1. Galaxy A54 (Rp 6.500.000)");
                System.out.println("2. Galaxy A24 (Rp 3.500.000)");
                int tipeSamsung = scanner.nextInt();
                scanner.nextLine();  // konsumsi newline

                if (tipeSamsung == 1) {
                    System.out.println("Anda telah memilih: Samsung Galaxy A54");
                    System.out.println("Harga: Rp 6.500.000");
                } else if (tipeSamsung == 2) {
                    System.out.println("Anda telah memilih: Samsung Galaxy A24");
                    System.out.println("Harga: Rp 3.500.000");
                } else {
                    System.out.println("Pilihan tidak valid.");
                }

            } else if (merkPilihan == 2) {
                System.out.println("Pilih tipe handphone Oppo:");
                System.out.println("1. A55 (Rp 1.800.000)");
                System.out.println("2. A57 (Rp 2.300.000)");
                int tipeOppo = scanner.nextInt();
                scanner.nextLine();  // konsumsi newline

                if (tipeOppo == 1) {
                    System.out.println("Anda telah memilih: Oppo A55");
                    System.out.println("Harga: Rp 1.800.000");
                } else if (tipeOppo == 2) {
                    System.out.println("Anda telah memilih: Oppo A57");
                    System.out.println("Harga: Rp 2.300.000");
                } else {
                    System.out.println("Pilihan tidak valid.");
                }

            } else if (merkPilihan == 3) {
                System.out.println("Pilih tipe handphone Xiaomi:");
                System.out.println("1. Redmi Note 12 (Rp 2.200.000)");
                System.out.println("2. Redmi Note 12 Pro (Rp 4.400.000)");
                int tipeXiaomi = scanner.nextInt();
                scanner.nextLine();  // konsumsi newline

                if (tipeXiaomi == 1) {
                    System.out.println("Anda telah memilih: Xiaomi Redmi Note 12");
                    System.out.println("Harga: Rp 2.200.000");
                } else if (tipeXiaomi == 2) {
                    System.out.println("Anda telah memilih: Xiaomi Redmi Note 12 Pro");
                    System.out.println("Harga: Rp 4.400.000");
                } else {
                    System.out.println("Pilihan tidak valid.");
                }

            } else {
                System.out.println("Pilihan merk tidak valid.");
            }

        } else {
            System.out.println("Terima kasih, silakan kembali lagi!");
        }

        scanner.close();
    } 
}