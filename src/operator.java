public class operator {
    public static void main(String[] args) {
        // Operasi Increament Dan Decreament
        int a= 80;
        a++;
        System.out.println("isi variabel a :" + a);

        int b= 10;
        --b;
        System.out.println("isi variabel b:" +b);

        int bp= 20;
        bp++;
        System.out.println("isi variabel bp:" +bp);

        int bk= 60;
        --bk;
        System.out.println("isi variabel bk:" +bk);

        int bj= 39;
        bj++;
        System.out.println("isi variabel bj:" +bj);
        
       


        
        //operasi perbandingan
        int c=15;
        int d=10;
        boolean hasil;
        
        hasil = c == d;
        System.out.println("apakah c == d ? :" +hasil);

        hasil = c != d;
        System.out.println("apakah c != d ? :" +hasil);
         
        hasil = c > d;
        System.out.println("apakah c > d ? :" +hasil);

        hasil = c < d; 
        System.out.println("apakah c < d ? :" +hasil);
         
        hasil = c >= d;
        System.out.println("apakah c >= d ? :" +hasil);


       

        // Operasi Logika
        int e =24;
        int f =29;
        boolean g =true;


        g= e<f && f>e;
        System.out.println("1.hasil dari e<f && f>e :" + g);
        
        g = e>f || f<e;
        System.out.println("  hasil dari e>f || f<e :" + g);

        g = !g;
        System.out.println("  hasil dari !f :" + g);



        int o=25;
        int l =27;
        boolean k =true;


        k= !(o == l);
        System.out.println("1.hasil dari !(e == f) :" + g);
        
        k = o<l || l>o;
        System.out.println("  hasil dari e>f || f<e :" + g);



       

        


    }
}
