import java.util.Scanner;
public class etkinlik {
    public static void main(String[] args) {

        int heat ;

        Scanner input=new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz: ");
        heat = input.nextInt();

        if (heat>5)
        {
            System.out.println("Kayak Yapabilirsiniz.");
        }



    }
}
