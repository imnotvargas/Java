public class Burbuja{
    public static void main(String[] args){
        int [] numeros={50,20,40,80,30};

        //A partir de aqui acomodaremos los numeros
        for(int i=0; i<numeros.length; i++){
            for(int j=0; j<numeros.length-1; j++){
                if(numeros[j] > numeros[j+1]){
                    int aux=numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j]=numeros[j+1];           
                    numeros[j+1]=aux;
                }
            }
        }
        for(int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]+" ");
        }
    }
}