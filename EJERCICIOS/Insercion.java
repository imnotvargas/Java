public class Insercion {
    public static void main(String[] args) {
    
    
    int[] arreglo = {50,20,40,80,30}; //int arreglo[],50,20,40,80,30; int arreglo[]={50,20,40,80,30}; 
    int posicion;
    int auxiliar;
    for(int i=0;i<arreglo.length;i++){
        posicion=i;
        auxiliar=arreglo[i];
        while(posicion>0&&arreglo[posicion-1]>auxiliar){
            arreglo[posicion] = arreglo[posicion - 1];
            posicion--;
        }
        arreglo[posicion]=auxiliar;     
    }  
    //impresion en forma ascendente
    System.out.println("Forma ascendente: ");
    for(int i=0;i<arreglo.length;i++){
        System.out.println(arreglo[i]);
    } 
    //impresion en forma descendente
    System.out.println("Forma Descendente: ");
    for(int i=4;i>=0;i--){
        System.out.println(arreglo[i]);
    } 
    }
}