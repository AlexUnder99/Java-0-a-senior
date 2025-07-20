// Definimos la clase principal llamada Temperatura

import java.util.Scanner;

public class Temperatura {

    // Método main: es el punto de entrada del programa
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);


        

        // Fórmulas de conversión:
        // Fahrenheit = (Celsius * 9/5) + 32
        // Kelvin = Celsius + 273.15  <-- por si más adelante quieres practicar

        // ✅ Usamos 'var' para que Java infiera el tipo automáticamente (aquí será double)
        // Esto es válido porque el valor asignado (30.5) es claramente decimal
        System.out.println("ingresa la temperatura en grado celsius");
        var celcius = scanner.nextDouble();

        // ✅ Consejo importante:
        // Siempre usa punto decimal en divisiones (9.0 / 5) para forzar tipo double
        // Si pusieras solo 9 / 5, Java lo trataría como división entera y el resultado sería 1 (incorrecto)
        var fahrenheit = celcius * (9.0 / 5) + 32;

        // ✅ printf permite imprimir con formato:
        // %.2f = muestra solo 2 cifras decimales
        // \n = salto de línea al final

        var kelvin = celcius +273.15;


        System.out.printf(" %,.2f grados Celsius son %,.2f grados Fahrenheit\n", celcius, fahrenheit);

        System.out.printf(" %,.2f grados Celsius son %,.2f grados kelvin\n", celcius, kelvin);

        scanner.close();
    }

}


