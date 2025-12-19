package vehiclemanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import vehiclemanagement.enums.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Vehicle> vehicles = new ArrayList<>();

    System.out.print("Enter number of vehicles: ");
    int vehicleCount = scanner.nextInt();

    for (int i = 0; i < vehicleCount; i++) {
      System.out.println("\n1. Car | 2. Motorbike | 3. Bicycle");
      int choice = scanner.nextInt();
      scanner.nextLine();

      System.out.print("Model: ");
      String model = scanner.nextLine();
      System.out.print("Manufacturer: ");
      String manufacturer = scanner.nextLine();
      System.out.print("Year: ");
      int year = scanner.nextInt();
      System.out.print("Base price: ");
      double price = scanner.nextDouble();
      System.out.print("Origin (1-Domestic, 2-Imported): ");
      Origin origin = scanner.nextInt() == 1 ? Origin.DOMESTIC : Origin.IMPORTED;

      if (choice == 1) {
        System.out.print("Seats: ");
        int seats = scanner.nextInt();
        System.out.print("Engine capacity (cc): ");
        int cc = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Body type: ");
        String body = scanner.nextLine();

        vehicles.add(new Car(
            model, manufacturer, year, price, origin,
            seats, FuelType.PETROL, cc, body));

      } else if (choice == 2) {
        System.out.print("Engine capacity (cc): ");
        int cc = scanner.nextInt();
        System.out.print("Type (1-Manual, 2-Automatic): ");
        MotorbikeType type =
            scanner.nextInt() == 1 ? MotorbikeType.MANUAL : MotorbikeType.AUTOMATIC;
        System.out.print("Power (kW): ");
        double power = scanner.nextDouble();

        vehicles.add(new Motorbike(
            model, manufacturer, year, price, origin,
            cc, type, power));

      } else {
        System.out.print("Type (1-Normal, 2-Electric): ");
        BicycleType type =
            scanner.nextInt() == 1 ? BicycleType.NORMAL : BicycleType.ELECTRIC;
        scanner.nextLine();
        System.out.print("Frame material: ");
        String frame = scanner.nextLine();

        vehicles.add(new Bicycle(
            model, manufacturer, year, price, origin,
            type, frame));
      }
    }

    System.out.println("\n=== VEHICLE LIST ===");
    for (Vehicle vehicle : vehicles) {
      vehicle.printInfo();
      System.out.println("-------------------");
    }

    scanner.close();
  }
}
