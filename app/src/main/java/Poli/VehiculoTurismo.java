package Poli;
public class VehiculoTurismo extends Vehiculo{
    private int numeroPuertas;

    public VehiculoTurismo(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public VehiculoTurismo(int numeroPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nNumeroPuertas: " + numeroPuertas;
    }


}
