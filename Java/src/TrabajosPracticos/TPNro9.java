package TrabajosPracticos;
import java.util.Scanner;

public class TPNro9 {
    public static void main(String[] args){
        //Constantes utilizadas para calcular el peso ideal
        final int calculoPesoIdealFemenino = 120;
        final int calculoPesoIdealMasculino = 110;

        float altura,   //Altura de la persona
              pesoIdeal;    //Aqui se almacenara el peso ideal calculado de la persona
        String sexo;    //Sexo de la persona
        Scanner myScan = new Scanner(System.in);

        //Se pide por consola la altuar de la persona
        System.out.println("Ingrese su altura en centimetros: ");
        altura = myScan.nextFloat();
        myScan.nextLine();  //Esto es necesario para captar el newline de myScan.nextFloat

        //Se pide el ingreso del sexo de la persona, y si no se ingresa una de las dos opciones, se vuelve a pedir el ingreso
        do{
            System.out.println("Ingrese su sexo ['Masculino' o 'Femenino']");
            sexo = myScan.nextLine().toLowerCase(); //Lo que sea que se ingrese se convierte a minusculas

        } while (!sexo.equals("masculino") && !sexo.equals("femenino"));

        //Dependiendo del sexo ingresado se detecta el peso ideal con la constante adecuada
        if (sexo.equals("Femenino")){
            pesoIdeal = altura - calculoPesoIdealFemenino;
        }
        else{
            pesoIdeal = altura - calculoPesoIdealMasculino;
        }

        System.out.println("Su peso ideal es de: " + pesoIdeal);

        myScan.close();
    }
}
