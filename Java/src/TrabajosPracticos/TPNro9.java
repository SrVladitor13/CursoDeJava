package TrabajosPracticos;
import java.util.Scanner;

public class TPNro10 {
    public  static void main(String[] args){
        int nroIntentos = 0,    //Numero de intentos consumidos. El intento correcto también se cuenta
            nroAAdivinar = (int)(Math.random()*100),    //Se genera un numero al azar
            nroIngresado;   //Variable que almacenara el numero ingresado por el usuario
        Scanner myScan = new Scanner(System.in);

        System.out.println("Se acaba de generar un numero, y usted debe adivinar cual es\nSe le indicara si el numero ingresado es correcto, mayor, o menor al numero a encontrar");

        //Se pide el ingreso de un numero hasta que corresponda con el numero a adivinar
        do{
            System.out.println("Introduzca un numero entero entre 1 y 100");
            nroIngresado = myScan.nextInt();

            nroIntentos++;

            //Se informa si el numero ingresado es menor o mayor al numero a adivinar
            if (nroIngresado < nroAAdivinar){ 
                System.out.println("El numero ingresado es menor que el numero a adivinar!");
            }
            else if (nroIngresado > nroAAdivinar){
                System.out.println("El numero ingresado es mayor que el numero a adivinar!");
            }
        } while (nroIngresado != nroAAdivinar);

        System.out.println("¡Correcto!\n¡Felicidades! El numero a adivinar era " + nroAAdivinar);
        System.out.println("\nNumero de intentos fallidos: " + nroIntentos);
        
        myScan.close();
    }
}
