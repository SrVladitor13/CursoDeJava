public class Cliente {
    private int NroCliente;
    private String Nombre;
    private float Saldo;


    public Cliente(int NroCliente, String Nombre){
        this.NroCliente = NroCliente;
        this.Nombre = Nombre;
    }


    public int getNroCliente(){
        return this.NroCliente;
    }

    public String getNombre(){
        return this.Nombre;
    }
    public void setNombre(String nombre){
        this.Nombre = nombre;
        System.out.println("Nombre cambiado con exito :D");
    }

    public float getSaldo(){
        return this.Saldo;
    }
    public void setSaldo(float Saldo){
        this.Saldo = Saldo;
    }


    @Override
    public String toString() {
        return this.NroCliente + " " + this.Nombre;
    }


}
