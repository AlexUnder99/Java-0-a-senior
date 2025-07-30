import java.util.Scanner;

public class calculadoraMDLR {
    public static void main(String[] args) {

       var input = new Scanner(System.in);
        mostrarMenu(input);



       }


        private static void mostrarMenu(Scanner sc ) {
            var salir = false;
            do {
            System.out.println("Bienvenido a la calculadora MDLR");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            
            var opcion = leerentero(sc, "ingrese una opcion: ");

            switch (opcion) {
                case 1:
                    sumar(sc);
                    break;
                case 2:
                    resta(sc);
                    break;
                case 3:
                    Multiplicar(sc);
                    break;
                case 4:
                    Dividir(sc);
                    break;
                case 5:
                    System.out.println("Saliendo de la calculadora...");
                    System.exit(0);
                    salir = true;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        } while (!salir);
        }

        private static int leerentero(Scanner input, String mensaje) {
            System.out.print(mensaje);
            var entrada = input.nextInt();
            input.nextLine();
            return entrada;
        }


        private static void sumar(Scanner input) {
        System.out.println("suma");

        var num1 = leerentero(null, "Ingrese el primer número: ");
        var num2 = leerentero(null, "Ingrese el segundo número: ");

        var resultado = num1 + num2;
        System.out.printf("El resultado es %,d%n", resultado);

       
        }


        private static void resta(Scanner input) {
        System.out.println("resta");

        var num1 = leerentero(null, "Ingrese el primer número: ");
        var num2 = leerentero(null, "Ingrese el segundo número: ");

        var resultado = num1 - num2;
        System.out.printf("El resultado es %,d%n", resultado);
        }



        private static void Multiplicar(Scanner input) {
        System.out.println("multiplicacion");

        var num1 = leerentero(null, "Ingrese el primer número: ");
        var num2 = leerentero(null, "Ingrese el segundo número: ");

        var resultado = num1 * num2;
        System.out.printf("El resultado es %,d%n", resultado);
        }



        private static void Dividir(Scanner input) {
        System.out.println("division");

        var num1 = leerentero(null, "Ingrese el primer número: ");
        var num2 = leerentero(null, "Ingrese el segundo número: ");

        var resultado = num1 / num2;
        System.out.printf("El resultado es %,d%n", resultado);
        }
             

      
    
}
