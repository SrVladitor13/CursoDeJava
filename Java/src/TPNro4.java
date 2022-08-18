import javafx.util.converter.IntegerStringConverter;

import javax.swing.*;

public class TPNro4{
    public static void main(String[] args){
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));

        int resultado = num1 + num2;

        JOptionPane.showMessageDialog(null,"El resultado de " + num1 + " + " + num2 + " es: " + resultado);

        if (resultado > 100) {
            JOptionPane.showMessageDialog(null, "Es mayor a 100 porque es: " + resultado);
        }
        else if (resultado == 100) {
            JOptionPane.showMessageDialog(null, "100");
        }
        else if (resultado < 0) {
            JOptionPane.showMessageDialog(null, "El resultado es negativo");
        }

        int listaDeNumeros [] = {};
        String numeroIngresado = null;

        while(!numeroIngresado.equals("f")){
            int contador;
            numeroIngresado= IntegerStringConverter.parseInt(JOptionPane.showInputDialog("Ingrese un numero (0 para detener el programa"));
            listaDeNumeros
        }

    }
}