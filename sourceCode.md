### BLOC 1 SOURCE CODE

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, opcio;
        Scanner sc = new Scanner(System.in);
        opcio = menu();

        while (opcio != 0) {
            switch (opcio) {
                case 1:
                    decimalBinari();
                    break;
                case 2:
                    binariDecimal();
                    break;
                case 3:
                    System.out.println("Introdueix un numero:");
                    n = sc.nextInt();
                    if (esParell(n)) {
                        System.out.println("Es parell");
                    } else {
                        System.out.println("No es parell");
                    }
                    break;
                case 4:
                    System.out.println("Introdueix un numero:");
                    n = sc.nextInt();
                    primersNombresParells(n);
                    break;
            }
            opcio = menu();
        }
    }
    static void decimalBinari(){
        int decimal;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix un nombre decimal positiu:");
        decimal = sc.nextInt();

        while (decimal > 0){
            System.out.println(decimal % 2);
            decimal = decimal / 2;
        }
        System.out.println("El nombre Binari s'ha de llegir d'abaix a dalt");
    }
    static void binariDecimal(){
        long numBinari, reste;
        int i = 0, numDecimal = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix un numero en Binari");
        numBinari = sc.nextLong();

        while (numBinari != 0){
            reste = numBinari % 10;
            numBinari = numBinari / 10;
            numDecimal = (int) (numDecimal + (reste * Math.pow(2 , i)));
            i++;
        }
        System.out.println(numDecimal);
    }
    static boolean esParell(int n){
        if (n % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
    static void primersNombresParells(int n){
        for (int i = 0; i < n; i++){
            if ( i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    static int menu() {
        int opcio;
        Scanner sc = new Scanner(System.in);

        System.out.println("Tria una de les següents opcions:");
        System.out.println("1. Decimal a Binari");
        System.out.println("2. Binari a Decimal");
        System.out.println("3. Es parell?");
        System.out.println("4. Calcular parells 0 fins n");
        System.out.println("0. Sortir");
        opcio = sc.nextInt();

        if (opcio == 0) {
            System.out.println("Goodbye <3");
            System.exit(1);
        } else if ((opcio < 0) || (opcio > 5)) {
            System.out.println("Opció incorrecta");
            menu();
        }
        return opcio;
    }
}

```
### BLOC 2 SOURCE CODE

```
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

```
