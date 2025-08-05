public class tgs2 {
    public static void main(String[] args) {
       
               String[] siswa = {"Devi","Chika","Ida","Bima","Yoga","Ely"};

               int[][] Angka = {
                {0,0},{0,1},{0,2},
                {1,0},{1,1},{1,2} 
               };
               for (int a =0; a < Angka.length;a++){
                int x = Angka[a][0];
                int y = Angka[a][1];
                System.out.println("Siapa yang akan duduk di meja ( "+x+","+y+" )");
               }
                    System.out.println("-------------------------");
                    System.out.println("| Devi | Chika | Ida |");
                    System.out.println("| Bima | Yoga  | Ely |");
            }
}