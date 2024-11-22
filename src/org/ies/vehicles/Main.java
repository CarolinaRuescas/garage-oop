package org.ies.vehicles;

import org.ies.vehicles.components.GarageReader;
import org.ies.vehicles.components.VehicleReader;
import org.ies.vehicles.model.Garage;
import org.ies.vehicles.model.Vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creacion de componentes
        Scanner scanner = new Scanner(System.in);
        VehicleReader vehicleReader = new VehicleReader(scanner);
        GarageReader garageReader = new GarageReader(scanner, vehicleReader);

        //Ejecución del programa
        Garage garage = garageReader.read();

        //Muesra el resultado
        System.out.println(garage);

    }
}