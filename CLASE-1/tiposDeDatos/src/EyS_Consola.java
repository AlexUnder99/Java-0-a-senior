import java.util.Scanner;


public class EyS_Consola {
    public static void main(String[] args) {


    //VARIABLES
    Scanner entrada = new Scanner(System.in);      //de izquierda a derecha, creamos un escanor y eso va a ser igual a la variable "entrada" la cual es de tipo scanner

    int edad;
    String nombre;                                 //definimos//
    float estatura;                                //variables//
    char letra;


    //CONSOLA

    System.out.println("digite la edad del estudiante: ");      //aca preguntamos con el sout 
    edad = entrada.nextInt();                                    //aca vamos a decir que la entrada de consola en cuestion se la asignamos a la variable de edad


    entrada.nextLine(); //limpiamos el buffer


    System.out.println("digite el nombre del estudiante: ");
    nombre = entrada.nextLine();

    System.out.println("digite la estatura del estudiante: ");
    estatura = entrada.nextFloat();

    System.out.println("digite la primera letra del nombre del estudiante: ");
    letra = entrada.next().charAt(0);


    // IMPRESIÓN
    System.out.println("La edad del estudiante es de: " + edad + " años");
    System.out.println("El nombre del estudiante es: " + nombre);
    System.out.println("La estatura del estudiante es de: " + estatura + "cm");
    System.out.println("La primera letra del nombre del estudiante es: " + letra);
    }
}
