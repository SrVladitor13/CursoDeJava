package TrabajosPracticos;

public class TPNro6{
    public static void main(String[] args){
        double a = Math.toRadians(45);

        //Funciones trigonométricas
        System.out.println("Seno de 45º: " + Math.sin(a));
        System.out.println("Coseno de 45º: " + Math.cos(a));
        System.out.println("Tangente de 45º: " + Math.tan(a));
        System.out.println("Arcotangente de 45º: " + Math.atan(a));
        System.out.println("Arcotangente de 45º y 90º: " + Math.atan2(a, a*2));

        //Funciona exponencial y su inversa
        System.out.println("Exponencial de 45º: " + Math.exp(a));
        System.out.println("Exponencial inversa de 45º: " + Math.log(a));

        //Constantes PI y E
        System.out.println("Valor de Pi: " + Math.PI);
        System.out.println("Valor de E: " + Math.E);

    }
}