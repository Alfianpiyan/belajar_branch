public class namakotaaa {
    
        public static void main(String[] args) {
            String namaKota = "Malang";
            int panjangNamaKota = namaKota.length();
            int indeks = 0;
            
            while (indeks < panjangNamaKota) {
                System.out.println(namaKota.substring(indeks, panjangNamaKota));
                indeks++;
            }
        }
    }

    

