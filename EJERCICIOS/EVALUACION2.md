# Práctica 2.

## 2. VARIABLES

Objetivo: Verificar el dominio teórico y técnico del concepto de variable en el lenguaje
de java mediante preguntas de opción múltiple y ejercicios para desarrollar su código.
Indicaciones: Pedir responder cada una de las preguntas de manera acertada, breve y
clara, según sea el caso.

1. ¿Cuál de las siguientes líneas arrojaría un error de compilación? (Valor 1 punto)

          b. double isRaining = false;

2. ¿Cuál de los siguientes valores es un char válido? (Valor 1 punto)

          d. 7

3. ¿A qué tipo de datos solo se le puede asignar uno de dos valores? (Valor 1 punto)

          c. boolean


4. ¿Qué línea declara la variable bestProgrammingLanguage y la inicializa para que
sea "Java"? (Valor 1 punto)

          c. String bestProgrammingLanguage = "Java";



5. ¿Qué opción es un nombre de variable válido y sigue las convenciones de
nomenclatura de Java? (Valor 1 punto)

          b. TimeUntilLaunch

7. ¿Qué línea de código declara una variable llamada numConejos para almacenar
un número entero? (Valor 1 punto)

          d. int numConejos;

8. ¿Qué valor NO se puede asignar a una variable con el tipo de datos double? (Valor
1 punto)

          d. -.2

9. Supón que tienes un programa llamado Creador.java y dentro de este hemos
definido algunas variables relacionadas a James Gosling, el creador de Java como
se muestra a continuación: (Valor 2 puntos)

                    public class Creator {

                      public static void main(String[] args) {

                       String nombre = "James Gosling";

                       int yearCreado = 1995;

                      }

                    }

a. Dentro de main(), use System.out.println() para imprimir la variable
nombre.

b. Use el mismo comando para imprimir yearCreado.

c. Escribe la salida.


      Salida:
      James Gosling
      1995


                    public class Creator {

                      public static void main(String[] args) {

                       String nombre = "James Gosling";

                       int yearCreado = 1995;
                              System.out.println("Salida:")
                              System.out.println(nombre)
                              System.out.println(yearCreado)
                      }

                    }

                    
9. Supón que tienes un programa llamado ContComentarios.java y dentro de este
tenemos el siguiente código definido: (Valor 2 puntos)

                //Esta es la declaración de la clase
                public class ContComentarios {
                  //Este es el método main que se ejecuta cuando compilas
                  public static void main(String[] args) {
                    //Aquí es donde vas a definir tu variable
                    //Aquí es donde vas a imprimir tu variable
                    }
                    //Este es el final de la class
                  }
                //Esto está afuera de la clase

El archivo ContComentarios.java tiene varios comentarios.

a. En tu cabeza, cuenta el número de comentarios. Luego, dentro del método main(),
declara una variable llamada numComentarios que contiene cuántos comentarios
contaste.

b. Imprime numComments.

c. Escribe la salida.

      Salida:
      6

                public class ContComentarios {
                   public static void main(String[] args) {

                       System.out.println("Numero de comentarios en el codigo:");
                       System.out.println("6");
                   }
                 }

10. Considera el código del siguiente programa escrito en Java cuyo nombre del
archivo es CuotaMercado.java: (Valor 2 puntos)

              public class CuotaMercado {
                public static void main(String[] args) {
                }
              }

Al año 2022, Android tiene el 70.97 por ciento de la cuota de mercado de los sistemas
operativos móviles.

a. Crea una variable llamada androidCuota que contenga este porcentaje como un
double.

b. Imprime en valor de androidShare en la consola.

c. Escribe la salida.

                Salida:
                70.97

11. Considera el código del siguiente programa escrito en Java cuyo nombre del
archivo es Booleans.java: (Valor 2 puntos)

              public class Booleans {
                public static void main(String[] args) {
                }
              }

a. Crea una variable llamada intsPuedeAlmacenarDecimales. Ponlo en verdadero
(True) si el tipo int puede contener un número decimal. Ponlo en falso (false) si el
tipo int no puede hacer esto.

  public class Booleans {
                public static void main(String[] args) {
                boolean intsPuedeAlmacenarDecimales = (false)
                }
              }

b. Imprime la variable intsPuedeAlmacenarDecimales.
           
               public class Booleans {
                public static void main(String[] args) {
                          boolean intsPuedeAlmacenarDecimales = (false)
                          System.out.prinln("int puede imprimir decimales?");
                          System.out.prinln(intsPuedeAlmacenarDecimales)
       
                }
              }

c. Escribe la salida.

                Salida:
                70.97

               public class Booleans {
                public static void main(String[] args) {
                          double intsPuedeAlmacenarDecimales;
                          intsPuedeAlmacenarDecimales=(70.97);
                          System.out.println(intsPuedeAlmacenarDecimales)
                }
              }

              
12. Considera el código del siguiente programa escrito en Java cuyo nombre del
archivo es Char.java: (Valor 2 puntos)

              public class Char {
                public static void main(String[] args) {
                        
                }
              }
    
a. Escribe como comentario de una sola línea tu nombre
 public class Char {
          //Alonso
          .....

b. Crea una variable llamada primerLetra de tipo char y almacena ahí la primer
letra de tu nombre.

            public class Char {
                public static void main(String[] args) {
                        char primerLetra = ("A")
                }
              }

c. Imprime en la terminal el valor de la variable primerLetra.

d. Escribe la salida.


                Salida:
                M

              public class Char {
                public static void main(String[] args) {
                        char primerLetra = ("A");
                        System.out.prinln(primerLetra)
                }
              }

13. Considera el código del siguiente programa escrito en Java cuyo nombre del
archivo es Poema.java: (Valor 2 puntos)

              public class Poema {
                public static void main(String[] args) {
                }
              }
    
a. Crea una variable llamada verso de tipo string y almacena ahí el verso “Aquí no
suceden cosas de mayor trascendencia que las rosas.”.

b. Invoca System.out.println() para imprimir el valor de la variable verso.

c. Escribe la salida.


                Salida:
                Aquí no suceden cosas de mayor trascendencia que las rosas.

  public class Poema {
     public static void main(String[] args) {
         String verso = (“Aquí no suceden cosas de mayor trascendencia que las rosas.”);
               System.out.println(verso)
     }
  }


              
14. Considera el código del siguiente programa escrito en Java cuyo nombre del
archivo es MiPerfil.java: (Valor 3 puntos)

              public class MyProfile {
                public static void main(String[] args) {

                }
              }
    
El archivo MiPerfil.java contiene una clase que representa tu perfil de contratación que
se presentará a potenciales empleadores.

a. En el método main(), crea una variable llamada nombre que contenga tu
nombre, como una secuencia de caracteres.

b. Crea una variable llamada edad que contenga tu edad como un número
entero.

c. Crea una variable llamada salarioDeseado que contenga tu salario
deseado por mes con una precisión de dos puntos decimales.

d. Crea una variable llamada genero que contenga un solo carácter, m
(masculino), f (femenino), n (para ninguno) u o (para otro).

e. Crea una variable llamada buscandoTrabajo que contenga si actualmente
estás abierto a ofertas de trabajo o no.

f. Iimprime el valor de cada una de las variables, una por cada línea.

g. Escribe la salida.


              Salida:
              Mi Nombre
              22
              500000.01
              n
              true

              public class MyProfile {
                public static void main(String[] args) {

                char nombre = ("Alonso");
                int edad = (22);
                double salarioDeseado = (500000.01);
                Strig genero = ("m");
                boolean buscandoTrabajo (True);

                System.out.println("Nombre: ");
                System.out.println(nombre);
                System.out.println("Edad: ");
                System.out.println(edad);
                System.out.println("Salario deseado:");
                System.out.println(salarioDeseado);
                System.out.println("Genero ");
                System.out.println(genero);
                System.out.println("Abierto a chambiar");
                System.out.println(buscandoTrabajo);
                

              }
             }
