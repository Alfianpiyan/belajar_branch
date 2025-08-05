import java.util.Scanner;

public class inputbarang1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih merek hp:");
        String merk = scanner.nextLine();

        System.out.println("pilih tipe hp:");
        String tipe = scanner.nextLine();

        int harga;

        switch (merk.toLowerCase()) {
            case "samsung":
                switch (tipe.toLowerCase()) {
                    case "galaxy a54":
                        harga = 6500000;
                        break;
                    case "galaxy a24":
                        harga = 3500000;
                        break;
                    default:
                        System.out.println("Tipe Samsung tidak valid.");
                        return;
                }
                break;

            case "oppo":
                switch (tipe.toLowerCase()) {
                    case "a55":
                        harga = 1800000;
                        break;
                    case "a57":
                        harga = 2300000;
                        break;
                    default:
                        System.out.println("Tipe Oppo tidak tersedia.");
                        return;
                }
                break;

            case "xiaomi":
                switch (tipe.toLowerCase()) {
                    case "redmi note 12":
                        harga = 2200000;
                        break;
                    case "redmi note 12 pro":
                        harga = 4400000;
                        break;
                    default:
                        System.out.println("Tipe Xiaomi tidak tersedia.");
                        return;
                }
                break;

            default:
                System.out.println("Merk tidak tersedia.");
                return;
        }

        System.out.println("Harga untuk " + merk + " " + tipe + " adalah Rp" + harga);
    }
}
