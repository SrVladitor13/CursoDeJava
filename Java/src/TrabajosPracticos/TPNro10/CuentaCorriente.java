package TrabajosPracticos.TPNro11;

public class CuentaCorriente {
    private long numeroCuenta;
    private String nombreTitular;
    private double saldo;

    public CuentaCorriente(String nombreTitular, double saldo) {
        this.numeroCuenta = (long)(Math.random()*100000);
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    
    public double getSaldo() {
        return this.saldo;
    }
    //Como pide 2 getters, pero no pide explicitamente un toString me tomé la libertad de hacer un getter
    //Que devuelva los dos atributos restantes con formato
    public String getNroCuentaYNombre() {
        return "Numero de cuenta: " + this.numeroCuenta +"\nNombre del titular: " + this.nombreTitular;
    }

    //Recibe un saldo y lo agrega al saldo de la cuenta
    public void ingreso(double saldo) {
        this.saldo += saldo;
    }

    //Recibe una cuentaCorriente y un saldo, a continuación pide/exige a la cuentaCorriente cuenta una transferencia hacia esta cuenta (utilizando this) por un valor igual a saldo
    public void reintegro(CuentaCorriente cuenta, double saldo){
        cuenta.transferir(this, saldo);
    }

    //Recibe una cuentaCorriente y un saldo, resta al saldo de esta cuenta el monto saldo e ingresa la misma cantidad a la cuentaCorriente cuenta
    public void transferir(CuentaCorriente cuenta, double saldo){
        this.saldo -= saldo;
        cuenta.ingreso(saldo);
    }


}
