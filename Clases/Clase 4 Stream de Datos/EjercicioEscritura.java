import java.util.Scanner;
import java.io.FileWriter;

public class EjercicioEscritura {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        System.out.println("Ingrese texto");

        String texto = myScan.nextLine();

        try{
            FileWriter escritura = new FileWriter("C:\\Users\\Usuario\\Desktop\\archivo.txt", true);

            for (int i = 0; i < texto.length(); i++){
                escritura.write(texto.charAt(i));
            }

            escritura.write("\n");
            escritura.close();
        }
        catch (Exception e){
            e.printStackTrace();

        }
    }
}
