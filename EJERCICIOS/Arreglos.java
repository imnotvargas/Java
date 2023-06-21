public class Arreglos{
    public static void main(String[] args) {
        int numeros [][] = new int [3][3];
        int nums2 [][] = new int [3][3];

        numeros [0][0] = 1;
        numeros [0][1] = 2;
        numeros [0][2] = 3;

        numeros [1][0] = 4;
        numeros [1][1] = 5;
        numeros [1][2] = 6;

        numeros [2][0] = 7;
        numeros [2][1] = 8;
        numeros [2][2] = 9;

        System.out.print("["+numeros[0][0]+", ");
        System.out.print(numeros[0][1]+", ");
        System.out.print(numeros[0][2]+"]");
        System.out.println();
        System.out.print("["+numeros[1][0]+", ");
        System.out.print(numeros[1][1]+", ");
        System.out.print(numeros[1][2]+"]");
        System.out.println();
        System.out.print("["+numeros[2][0]+", ");
        System.out.print(numeros[2][1]+", ");
        System.out.print(numeros[2][2]+"]");

        int nums2 [][] = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        System.out.print(nums2[0]);
    }

}
