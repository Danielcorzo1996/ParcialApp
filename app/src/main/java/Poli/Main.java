package Poli;

public class Main {

    public static void main(String[] args) {

        Vehiculo misVehiculos[] = new Vehiculo[4];

        misVehiculos[0] = new Vehiculo("123-ABC", "Mazda", "c3");
        misVehiculos[1] = new VehiculoDeportivo(500, "asd-786", "Toyota", "prado");
        misVehiculos[2] = new VehiculoFurgoneta(5000, "ois-821", "Polo", "J9");
        misVehiculos[3] = new VehiculoTurismo(4, "loj-163", "Audi", "p14");

        for (Vehiculo misVehiculo : misVehiculos)  {
            System.out.println(misVehiculo.toString());
            System.out.println("\n");
        }
    }

}
