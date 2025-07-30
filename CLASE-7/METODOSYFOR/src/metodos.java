import java.util.Scanner;

public class metodos {


public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
        System.out.println("¿Cuál es tu nombre?");
        String nombre = scanner.nextLine();

        saludar(nombre); // Solo llamas el método, ya imprime desde dentro

        System.out.print("Ingresa el primer número: ");
        int n1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int n2 = scanner.nextInt();

        // ⬇️ Aquí le pasamos esas entradas al método sumar
        int resultado = sumar(n1, n2); 

        System.out.println("El resultado es: " + resultado);
    }
    
    }


private static void saludar(String nombre) {
    System.out.println("hola " + nombre);
}

// 👇 Aquí definimos el método
public static int sumar(int a, int b) {
    return a + b;  // 👈 El método devuelve la suma
}

}
