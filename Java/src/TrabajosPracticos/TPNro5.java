package TrabajosPracticos;
import javax.swing.*;

public class TPNro5{
    public static void main(String[] args){
        float resultado=((6/5f)-((2/3f)*(7/2f))+(2/30f))/((1/3f)/5);
        
        //Visto de otro punto de vista podríamos resolverlo así
        /*
        float 
            a = 6/5f,
            b = 2/3f,
            c = 7/2f,
            d = 2/30f,
            abcd = a-b*c+d,
            e = 1/3f,
            f = 5,
            ef = e/f,
            resultado = abcd/ef;
        */

        JOptionPane.showMessageDialog(null, resultado);
        
    }         
}
