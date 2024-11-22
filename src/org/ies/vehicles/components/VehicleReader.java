package org.ies.vehicles.components;

import org.ies.vehicles.model.Vehicle;
import org.ies.vehicles.model.VehicleType;

import java.util.Scanner;

// el reader sirve para poder pedir o crear objetos del tipo que sea, lo devuelve porque ha sido previmente pedido
// por el usuario
// en un componente, que sirve par acodificar logica del programa
// en este caso sirve para leer vehiculo ,que devulve cada vez que ha sido leido


public class VehicleReader {
    private final Scanner scanner;

    public VehicleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Vehicle read() {
        System.out.println("Introduce los datos del vehículo");
        int option;
        do {
            System.out.println("elige el tipo de vwhículo");
            System.out.println("1. Coche");
            System.out.println("2. Moto");
            System.out.println("3. Camión");
            option = scanner.nextInt();
            scanner.nextLine();
        } while (option != 1 && option != 2 && option != 3);
        VehicleType vehicleType;

        if (option == 1) {
            vehicleType = VehicleType.Car;
        } else if (option == 2) {
            vehicleType = VehicleType.Motorbike;
        } else {
            vehicleType = VehicleType.Truck;
        }
        System.out.println(" Velocidad máxima:");
        int maxSpeed = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Color");
        String color = scanner.nextLine();

        System.out.println("Matricula");
        String plate = scanner.nextLine();

        return new Vehicle(
                vehicleType,
                maxSpeed,
                plate,
                color
        );
    }
}

