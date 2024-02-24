package Poli;

public class VehiculoDeportivo extends Vehiculo {

    private int cilindraje;

    public VehiculoDeportivo(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public VehiculoDeportivo(int cilindraje, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCilindraje: " + cilindraje;
    }
}
