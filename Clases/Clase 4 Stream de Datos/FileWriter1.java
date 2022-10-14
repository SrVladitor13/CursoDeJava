import java.io.FileWriter;

public class FileWriter1 {
    public static void main(String[] args) {
        Escritura uoo = new Escritura();
        uoo.escribir();
    }
}

class Escritura{
    public void escribir(){
        String texto="Elgatooo";

        try{
            FileWriter escritura=new FileWriter("C:\\Users\\Usuario\\Desktop\\archivo.txt");

            for(int i=0;i<texto.length();i++){
            escritura.write(texto.charAt(i));
        }
            escritura.write("\n");
            escritura.close();
        }
            catch(Exception e){
            e.printStackTrace();
        }
    }
}
