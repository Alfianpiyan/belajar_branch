import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        int nilai = 76;
        Scanner input=new Scanner (System.in);
        System.out.println("masukan nilai");
        nilai = input.nextInt();
        if(nilai >= 0 && nilai <60){
            System.out.println("D");
        }
        else if (nilai >=61 && nilai <=76){
            System.out.println("C");
        }
        else if (nilai >=77 && nilai <=88){
            System.out.println("B");
        }
        else if (nilai >=89 && nilai <=100){
            System.out.println("A");
        }
    }
}
 