import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcio = 0;
        double radi, longitud, costat1, costat2, costat3, volum = 0, volumATransportar, viatges;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++){
            System.out.println("Que has de transportar?");
            System.out.println("1. Líquids");
            System.out.println("2. Sòlids");
            opcio = sc.nextInt();
            if (opcio == 1 || opcio == 2){
                i = 2;
            }
            else{
                i--;
            }
        }
        if (opcio == 1){
            System.out.println("Introdueix el radi en cm");
            radi = sc.nextDouble();
            System.out.println("Introdueix la longitud en cm");
            longitud = sc.nextDouble();

            volum = volumCilindre(radi, longitud);
        }
        if (opcio == 2){
            System.out.println("Introdueix el primer costat");
            costat1 = sc.nextDouble();
            System.out.println("Introdueix el segon costat");
            costat2 = sc.nextDouble();
            System.out.println("Introdueix el tercer costat");
            costat3 = sc.nextDouble();

            volum = volumPrismaRectangula(costat1, costat2, costat3);
        }

        System.out.println("Quin volum en metres cùbics s'ha de transportar?");
        volumATransportar = sc.nextDouble();

        viatges = Math.ceil(volumATransportar / (volum / 1000000));
        System.out.println("El camió pot transportar " + volum + " Centímetres cúbics.");
        System.out.println("Hi caben " + (volum / 1000000) + " metres cúbics.");
        System.out.println("Haurás de fer " + viatges + " viatges.");
    }
    static double volumCilindre(double radi, double longitud){
        return (Math.PI * (Math.pow(radi , 2) * longitud));
    }
    static double volumPrismaRectangula(double costat1, double costat2, double costat3){
        return (costat1 * costat2 * costat3);
    }
}