//Me di cuenta de que solamente había que declarar las variables después de terminar todo el código
//así que aprovecho a testear si usted considera que excederse o hacer cosas que no pidió explicitamente
//se consideran mal

package TrabajosPracticos;
import javax.swing.*;

public class TPNro4{
    public static void main(String[] args){
        String nombre=JOptionPane.showInputDialog(null, "Ingrese su nombre");
        int edad=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
        float salario=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el salario que le gustaría ganar mensualmente (con centavos)"));
        boolean carnet= true;

        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nEdad: " + edad + "\nSalario deseado: " + salario + "\nCarnet: " + carnet);

    }
}