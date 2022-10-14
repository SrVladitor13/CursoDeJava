import java.io.FileReader;

public class FileReader1 {
    public static void main(String[] args){
        try {
            FileReader file = new FileReader("C:\\Users\\Usuario\\Desktop\\archivo.txt");

            int caracter = file.read();
            char letra = (char)caracter;

            while (caracter != -1){
                System.out.print(letra);
                caracter = file.read();
                letra = (char)caracter;
            }

            while (caracter != -1){

            }

            file.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
