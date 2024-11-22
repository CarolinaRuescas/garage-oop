package org.ies.vehicles.components;

import org.ies.vehicles.model.Garage;
import org.ies.vehicles.model.Vehicle;

import java.util.Scanner;

public class GarageReader {
    private final Scanner scanner;
    private final VehicleReader vehicleReader;

    public GarageReader(Scanner scanner, VehicleReader vehicleReader) {
        this.scanner = scanner;
        this.vehicleReader = vehicleReader;
    }

    public Garage read(){
        System.out.println("Introduce los datos del garaje");
        System.out.println("Nombre");
        String name = scanner.nextLine();
        System.out.println("Dirección");
        String address = scanner.nextLine();

        // para pedir un array de vehiculos
        System.out.println("¿Cuántos vehículos hay?");
        int size = scanner.nextByte();
        scanner.nextLine();

        Vehicle[] vehicles = new Vehicle[size];
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i] = vehicleReader.read();
        }

        return new Garage(
                name,
                address,
                vehicles
        );
    }
}
