import javax.swing.JOptionPane;

public class EyS_VentanaEmergente {

public static void main(String[] args) {
    //ENTRADA

    String nombre = JOptionPane.showInputDialog("digite el nombre");                    //JOptionPane(ventana emergente) ShowInputDialog(mostrar ventan de la entrada)
    int edad = Integer.parseInt(JOptionPane.showInputDialog("digite la edad"));         // lo mismo que arriba, pero se encierra en parentesis y antes se pone el (tipo de variable).Parse(tipo de variable)
    float estatura = Float.parseFloat(JOptionPane.showInputDialog("digite la estatura"));
    double sueldo = Double.parseDouble(JOptionPane.showInputDialog("digite el sueldo"));
    char letra = JOptionPane.showInputDialog("digite su nombre").charAt(0);         //cuando es char siempre al final se pone ".charAt(0)"

     


    //SALIDAS
    JOptionPane.showMessageDialog(null, "Su nombre es " + nombre);
    JOptionPane.showMessageDialog(null, "la edad es " + edad);
    JOptionPane.showMessageDialog(null, "La estatura es: " + estatura);
    JOptionPane.showMessageDialog(null, "El sueldo es: " + sueldo);
    JOptionPane.showMessageDialog(null, "La letra de su primer nombre es: " + letra);
} }