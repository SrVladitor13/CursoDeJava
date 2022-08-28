package TrabajosPracticos.TPNro11;

public class UsoCuenta {
    public static void main(String[] args){
        CuentaCorriente Cuenta1 = new CuentaCorriente("Facundo Uferer", 9999999.25);
        CuentaCorriente Cuenta2 = new CuentaCorriente("Lucas Luque", 0);

        Cuenta1.transferir(Cuenta2, 2500);

        System.out.println("Cuenta 1:\n" + Cuenta1.getNroCuentaYNombre() +"\nSaldo: " + Cuenta1.getSaldo());
        System.out.println("\n\nCuenta 2:\n" + Cuenta2.getNroCuentaYNombre() +"\nSaldo: " + Cuenta2.getSaldo());
        
    }
}
