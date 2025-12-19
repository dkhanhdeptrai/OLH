package vehiclemanagement;

import vehiclemanagement.enums.BicycleType;
import vehiclemanagement.enums.Origin;

public class Bicycle extends Vehicle {

  private static final double IMPORT_TAX_RATE = 0.10;

  private final BicycleType type;
  private final String frameMaterial;

  public Bicycle(
      String model,
      String manufacturer,
      int year,
      double basePrice,
      Origin origin,
      BicycleType type,
      String frameMaterial) {

    super(model, manufacturer, year, basePrice, origin);
    this.type = type;
    this.frameMaterial = frameMaterial;
  }

  @Override
  public double importTax() {
    return getOrigin() == Origin.IMPORTED
        ? IMPORT_TAX_RATE * getBasePrice()
        : 0;
  }

  @Override
  public double specialConsumptionTax() {
    return 0;
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Type: " + type);
    System.out.println("Frame material: " + frameMaterial);
  }
}
