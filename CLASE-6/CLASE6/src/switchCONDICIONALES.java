import java.util.Scanner;

public class switchCONDICIONALES {
    public static void main(String[] args) throws Exception {

try (var scanner = new Scanner(System.in)) {

        System.out.print("Ingresa el primer número: ");
        int n1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int n2 = scanner.nextInt();

        System.out.print("Ingresa el operador (+, -, *, /): ");
        String op = scanner.next(); 

        // Declaramos primero una variable String que va a contener el resultado
        double resultado = switch (op) {
            case "+" -> (n1 + n2);
            case "-" -> (n1 - n2);
            case "*" -> (n1 * n2);
            case "/" -> {
                if (n2 == 0) {
                    System.out.println("error division por cero");
                    yield 0;
                } else {
                    yield ((double) n1 / n2);
                }
            }
            default -> {
                System.out.println("Operador no válido, por favor ingresa uno de los siguientes: +, -, *, /");
                yield 0; // Valor por defecto en caso de operador no válido
            }
        };

                System.out.println("El resultado de la operación es: " + resultado);
            }
        }
        }
    
    

