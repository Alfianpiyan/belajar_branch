import java.util.Scanner;

public class Umur {  
    public static void main(String[] args) {
        int umur;
        Scanner input = new Scanner(System.in);
        boolean weekday = true;

        System.out.println("masukan umur");
        umur = input.nextInt();
        System.out.println("apakah weekday");
        weekday = input.nextBoolean();
        if ( umur <= 15) {
        if ( weekday) {
            System.out.println(40000);
        }
        else {System.out.println(60000);}
    }
        else{
            if (weekday == true) {System.out.println(50000
            );}
            else {System.out.println(70000);}
        }
        input.close();
}
}