public class tugas2 {
        public static void main(String[] args) {
    
            String[] siswa = {"Devi", "Chika", "Ida", "Bima", "Yoga", "Ely"};
    
            int[][] Angka = {
                    {0, 0}, {0, 1}, {0, 2},
                    {1, 0}, {1, 1}, {1, 2}
            };
    
           
            for (int a = 0; a < Angka.length; a++) {
                int x = Angka[a][0];
                int y = Angka[a][1];
                System.out.println("Siapa yang akan duduk di meja (" + x + "," + y + ") : " + siswa[a]);
            } 
             
             System.out.println("-------------------------");
             for (int i = 0; i < 2; i++) {
                 System.out.print("| ");
                 for (int j = 0; j < 3; j++) { 
                     int index = i * 3 + j; 
                     System.out.print(siswa[index] + " | ");
                 }
                 System.out.println("\n-------------------------");
             }
        }
    }

