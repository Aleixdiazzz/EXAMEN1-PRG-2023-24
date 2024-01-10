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