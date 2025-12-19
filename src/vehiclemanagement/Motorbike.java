package vehiclemanagement;

import vehiclemanagement.enums.MotorbikeType;
import vehiclemanagement.enums.Origin;

public class Motorbike extends Vehicle {

  private static final double IMPORT_TAX_RATE = 0.30;
  private static final double SPECIAL_TAX_RATE = 0.20;
  private static final int TAX_FREE_LIMIT = 150;

  private final int engineCapacity;
  private final MotorbikeType type;
  private final double power;

  public Motorbike(
      String model,
      String manufacturer,
      int year,
      double basePrice,
      Origin origin,
      int engineCapacity,
      MotorbikeType type,
      double power) {

    super(model, manufacturer, year, basePrice, origin);
    this.engineCapacity = engineCapacity;
    this.type = type;
    this.power = power;
  }

  @Override
  public double importTax() {
    return getOrigin() == Origin.IMPORTED
        ? IMPORT_TAX_RATE * getBasePrice()
        : 0;
  }

  @Override
  public double specialConsumptionTax() {
    if (engineCapacity <= TAX_FREE_LIMIT) {
      return 0;
    }
    return SPECIAL_TAX_RATE * (getBasePrice() + importTax());
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Type: " + type);
    System.out.println("Engine capacity: " + engineCapacity + " cc");
    System.out.println("Power: " + power + " kW");
  }
}
