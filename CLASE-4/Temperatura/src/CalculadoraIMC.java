import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
        

        var input = new Scanner(System.in);

        System.out.println("ingresa tu altura");
        var altura = input.nextDouble();

        System.out.println("ingresa tu peso");
        var peso = input.nextDouble();

        var IMC = peso / (altura*altura);

        System.out.printf("su indice de masa corporal es de %,.2f", IMC);





    }
    
}
