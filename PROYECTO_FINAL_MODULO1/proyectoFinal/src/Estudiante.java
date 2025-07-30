import java.util.Scanner;

public class Estudiante {
    static String nombre;
    static double nota1, nota2, nota3;
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    


    boolean salir = false;
    do {
    System.out.println("Bienvenido al sistema de gestion de estudiantes");
    System.out.println("\n--- Sistema de Registro de Estudiantes ---");
    System.out.println("1. Registrar estudiante");
    System.out.println("2. Mostrar estudiante");
    System.out.println("3. Calcular promedio");
    System.out.println("4. Validar nota");
    System.out.println("5. Validar nombre");
    System.out.println("6. Salir");
    System.out.println("que opcion desea realizar?");

    int opcion = scanner.nextInt();


        switch (opcion) {
            case 1: registrarEstudiante(scanner); 
            System.out.println("\n-------------------------\n");
            break;
            
            case 2: mostrarEstudiante(); break;
            case 3: double promedio = calcularPromedio();
                    System.out.printf("El promedio del estudiante %s es: %.2f%n", nombre, promedio);
                    System.out.println("\n-------------------------\n");
                    break;
            case 4: System.out.println(validarNota(scanner) ? "La nota es válida." : "");
                    System.out.println("\n-------------------------\n");
                    break;
            case 5: System.out.println(validarNombre(scanner) ? "el nombre es valido" : "");
                    System.out.println("\n-------------------------\n"); 
                    break;
            case 6:
                System.out.println("Saliendo del sistema...");
                salir = true;
                break;
                
        }
        
    } while (!salir);

    }
private static void registrarEstudiante(Scanner scanner) {
        System.out.println("Ingrese el nombre del estudiante:");
        scanner.nextLine();
        nombre = scanner.nextLine();
        nombreValido(scanner);
        
        System.out.println("Ingrese la primera nota:");
        nota1 = scanner.nextDouble();
        System.out.println("Ingrese la segunda nota:");
        nota2 = scanner.nextDouble();
        System.out.println("Ingrese la tercera nota:");
        nota3 = scanner.nextDouble();
        notasValidas(scanner);
        }




private static void nombreValido(Scanner scanner) {
        while (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacío. Ingrese nuevamente:");
            nombre = scanner.nextLine();
        }
    
      
    }
    
private static void notasValidas(Scanner scanner){
        while (nota1 < 0 || nota1 > 100 || nota2 < 0 || nota2 > 100 || nota3 < 0 || nota3 > 100) {
            System.out.println("Las notas deben estar entre 0 y 100. Ingrese nuevamente:");
            nota1 = scanner.nextDouble();
            nota2 = scanner.nextDouble();
            nota3 = scanner.nextDouble();
        }
    }

private static void mostrarEstudiante(){
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("No hay estudiante registrado.");
    
    }   else {
            System.out.println("Nombre del estudiante: " + nombre);
            System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
        }
    }
    

private static double calcularPromedio() {
            double promedio = (nota1 + nota2 + nota3) / 3;
         return promedio;

    

}

private static boolean validarNota(Scanner scanner) {
        System.out.println("Ingrese una nota para validar:");
        double nota = scanner.nextDouble();
        boolean vd = false;
        while (!vd) {
            if (nota < 0 || nota > 100) {
                vd = false;
                System.out.println("La nota no es válida. Debe estar entre 0 y 100. Ingrese nuevamente:");
                nota = scanner.nextDouble();
        }   else {
                vd = true;
                break;
            }

        }
        return vd;
    }
private static boolean validarNombre(Scanner scanner) {
        System.out.println("Ingrese el nombre del estudiante para validar:");
        scanner.nextLine();
        String nombre = scanner.nextLine();
        boolean vd = false;
        while (!vd) {
        if ((nombre == null || nombre.isEmpty())){
            System.out.println("El nombre no puede estar vacío. Ingrese nuevamente:");
            nombre = scanner.nextLine();
        }else {
                vd = true;
        
        }
        

    }
    return vd;
}

}

