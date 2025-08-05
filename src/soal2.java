import java.util.Scanner;

public class soal2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = scanner.nextInt();

        if (umur >= 18) {
            System.out.print("Apakah Anda sudah bekerja? (yes/no): ");
            String statusBekerja = scanner.next();

            if (statusBekerja.equalsIgnoreCase("yes")) {
                System.out.print("Masukkan pendapatan per bulan: ");
                double pendapatan = scanner.nextDouble();
                System.out.print("Masukkan jumlah tanggungan: ");
                int jumlahTanggungan = scanner.nextInt();
                double biayaHidup = pendapatan / jumlahTanggungan;

                if (biayaHidup < 300000) {
                    System.out.println("Penduduk Miskin");
                } else {
                    System.out.println("Bukan Penduduk Miskin");
                }
            }
             else {
                System.out.println("Penduduk Miskin");
            }

        }
         else {
            System.out.print("Apakah Anda masih sekolah? (y/n): ");
            String statusSekolah = scanner.next();

            if (statusSekolah.equalsIgnoreCase("y")) {
                System.out.println("Bukan Penduduk Miskin");
            } else {
                System.out.println("Penduduk Miskin");
            }
        }

        scanner.close();
    }
}
