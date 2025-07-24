import java.util.Scanner;

public class TERNARIOSanidados {
    public static void main(String[] args) throws Exception {
    
        var scn = new Scanner(System.in);  

        System.out.println("Ingrese un número: ");
        int numero = scn.nextInt();

        String resultado = (numero == 0) ? "el numero es igual a 0"
                : (numero % 2 == 0) ? "el numero es par"
                : "el numero es impar";


        System.out.println(resultado);
        scn.close();
    }
}
