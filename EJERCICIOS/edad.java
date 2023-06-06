import java.util.Scanner;

public class edad {
    public static void main(String[] args) {
        String nombre;
        int anio;
        boolean mayor_edad;
        int edad;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        nombre = sc.nextLine();
        System.out.println("Ingresa tu año de nacimiento:");
        anio = sc.nextInt();
        if(anio >=1924 && anio <=2013){
            edad = (2023-anio);
        } else{
            edad =0;
        }

        if (edad >=10 && edad <=14) {
            System.out.println(nombre + " usted es un niño, tiene " + edad + " años");
        } else if(edad >=15 && edad <=17){
            System.out.println(nombre + " usted es un adolescente, tiene " + edad + " años");
        } else if(edad >=18 && edad <=25){
            System.out.println(nombre + " usted es un joven, tiene " + edad + " años");
        } else if(edad >=26 && edad <=35){
            System.out.println(nombre + " usted es un jove adulto, tiene " + edad + " años");
        } else if(edad >=35 && edad <=60){
            System.out.println(nombre + " usted es un adolescente, tiene " + edad + " años");
        } else if(edad >=61 && edad <=99){
            System.out.println(nombre + " usted es un viejito, tiene " + edad + " años");
        }
    }
}