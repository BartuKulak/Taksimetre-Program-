import  java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        double km,tutar,acilis,kmucreti;
        acilis=10;
        kmucreti=2.20;
        Scanner input=new Scanner(System.in);
        System.out.println("Gidilen Mesafeyi Girin: ");
        km= input.nextDouble();
        tutar=acilis+(km*kmucreti);
        if(tutar<20)
        {
            tutar=20;
        }
        System.out.println("Taksi ücretiniz = "+tutar);
    }
}