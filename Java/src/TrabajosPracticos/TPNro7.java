package TrabajosPracticos;
import java.util.Scanner;

public class TPNro8 {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int n1;
        double raizn1;

        System.out.println("Ingrese un numero: ");
        n1 = myScan.nextInt();
        raizn1 = Math.sqrt(n1);


        System.out.println(raizn1);

        myScan.close();
    }
}
