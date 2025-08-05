public class remed {
        public static void main(String[] args) {
            int a = 30;
            int b = 8;
            int c = 19;
            int d = 9;
            int e = 3;
    
            
            int nilaimin = Math.min(Math.min(Math.min(a, b), Math.min(c, d)), e);
    
           
            int nilaimax = Math.max(Math.max(Math.max(a, b), Math.max(c, d)), e);

            double nilairatarata = (a + b + c + d + e) / 5.0;

            int total= a+b+c+d+e;

            System.out.println("Nilai minimum: " + nilaimin);
            System.out.println("Nilai maksimum: " + nilaimax);
            System.out.println("Nilai rata-rata: " + nilairatarata);
            System.out.println("Total nilai:" + total);
        }
    
}
