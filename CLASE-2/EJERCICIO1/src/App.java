import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
    
    Scanner entrada = new Scanner(System.in);


    System.out.println("digite su estrato: ");
    int estrato = entrada.nextInt();

    System.out.println("digite el valor de la vivienda a comprar: ");
    double valor = entrada.nextDouble();

    if (estrato == 0) {
    System.out.println("el valor sin descuento es: " + valor );



    double descuento = 5000000;
    System.out.println("el descuento es: " + descuento );


    double total = (valor-descuento);
    System.out.println("el valor con descuento es: " + total);

    }


    else if (estrato == 1){
    System.out.println("el valor sin descuento es: " + valor );



    double descuento = 3500000;
    System.out.println("el descuento es: " + descuento );


    double total = (valor-descuento);
    System.out.println("el valor con descuento es: " + total);


    }

    if (estrato == 2){
    System.out.println("el valor sin descuento es: " + valor );



    double descuento = 2500000;
    System.out.println("el descuento es: " + descuento );


    double total = (valor-descuento);
    System.out.println("el valor con descuento es: " + total);

    }


    if (estrato == 3){
    System.out.println("el valor sin descuento es: " + valor );



    double descuento = 1000000;
    System.out.println("el descuento es: " + descuento );


    double total = (valor-descuento);
    System.out.println("el valor con descuento es: " + total);
    }



    if (estrato == 4){
    System.out.println("el valor es: " + valor );



    double descuento = 0;
    System.out.println("no tiene descuento: ");


    }




    if (estrato == 5){
    System.out.println("el valor sin descuento es: " + valor );



    double impuesto = 2500000;
    System.out.println("el impuesto es: " + impuesto );


    double total = (valor+impuesto);
    System.out.println("el valor con descuento es: " + total);
    }

    else {
        System.out.println("ERROR.....");

    }


    }





 /* 
    double pesomelisa = Double.parseDouble(JOptionPane.showInputDialog("pesos de melissa:" ));
   


    double PFMELISA = pesomelisa;
    double PFXIOMARA = pesomelisa / 2;
    double pfmaria = (PFXIOMARA+PFMELISA) / 2;


    System.out.println("MELISSA TIENE " + PFMELISA + " PESOS");
    System.out.println("XIOMARA TIENE " + PFXIOMARA + " PESOS");
    System.out.println("MARIA TIENE " + pfmaria + " PESOS"); 
    System.out.println("el dinero total es " + (pfmaria+PFMELISA+PFXIOMARA) + " PESOS"); 






    double precioOriginal = Double.parseDouble(JOptionPane.showInputDialog("DIGITE EL PRECIO DEL PRODUCTO: " ));
    double PORCENTAJE = Double.parseDouble(JOptionPane.showInputDialog("DIGITE EL PORCENTAJE DE DESCUENTO DEL PRODUCTO: " ));

    double preciofinal = (precioOriginal * PORCENTAJE) / 100;
    double totalpagar = precioOriginal - preciofinal;

    System.out.println("el precio original es de " + precioOriginal);
    System.out.println("el descuento es de " + preciofinal);
    System.out.println("el precio final es: " + totalpagar);  */


    }

