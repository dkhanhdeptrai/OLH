package vehiclemanagement;

import vehiclemanagement.enums.FuelType;
import vehiclemanagement.enums.Origin;

public class Car extends Vehicle {

  private static final double IMPORT_TAX_RATE = 0.50;
  private static final double SMALL_ENGINE_TAX_RATE = 0.50;
  private static final double LARGE_ENGINE_TAX_RATE = 1.00;
  private static final int ENGINE_CAPACITY_THRESHOLD = 3000;

  private final int seatCount;
  private final FuelType fuelType;
  private final int engineCapacity;
  private final String bodyType;

  public Car(
      String modelName,
      String manufacturer,
      int year,
      double basePrice,
      Origin origin,
      int seatCount,
      FuelType fuelType,
      int engineCapacity,
      String bodyType) {

    super(modelName, manufacturer, year, basePrice, origin);
    this.seatCount = seatCount;
    this.fuelType = fuelType;
    this.engineCapacity = engineCapacity;
    this.bodyType = bodyType;
  }

  @Override
  public double importTax() {
    return getOrigin() == Origin.IMPORTED
        ? IMPORT_TAX_RATE * getBasePrice()
        : 0;
  }

  @Override
  public double specialConsumptionTax() {
    double taxBase = getBasePrice() + importTax();
    return engineCapacity < ENGINE_CAPACITY_THRESHOLD
        ? SMALL_ENGINE_TAX_RATE * taxBase
        : LARGE_ENGINE_TAX_RATE * taxBase;
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Seats: " + seatCount);
    System.out.println("Fuel type: " + fuelType);
    System.out.println("Engine capacity: " + engineCapacity + " cc");
    System.out.println("Body type: " + bodyType);
  }
}
