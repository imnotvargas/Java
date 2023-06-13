import java.util.Scanner;

public class Viciesto {
    public static void main(String[] args) {
        int mes;
        boolean bisiesto;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el número del mes del 1 al 12:");
        mes = sc.nextInt();

        switch (mes) {
            case 1:
                bisiesto = false;
                break;
            case 2:
                bisiesto = true;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                bisiesto = false;
                break;
            default:
                System.out.println("Número de mes inválido");
                return;
        }

        if (bisiesto) {
            System.out.println("El mes " + mes + " es bisiesto.");
        } else {
            System.out.println("El mes " + mes + " no es bisiesto.");
        }
    }
}