public class pares {
    public static void main(String []args){
        System.out.println("Numero impares:");
        for(int i = 1; i <=15; i+=2) {
            System.out.print(i);
            if (i != 15) {
            System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Numero pares:");
        for(int i = 0; i <=15; i+=2) {
            System.out.print(i);
            if (i != 14) {
            System.out.print(", ");
            }
        }
        
    }

}



