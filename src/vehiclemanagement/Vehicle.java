package vehiclemanagement;

import vehiclemanagement.enums.Origin;

public abstract class Vehicle {

  private final String model;
  private final String manufacturer;
  private final int year;
  private final double basePrice;
  private final Origin origin;

  private static final double VAT_RATE = 0.10;

  protected Vehicle(
      String model,
      String manufacturer,
      int year,
      double basePrice,
      Origin origin) {

    this.model = model;
    this.manufacturer = manufacturer;
    this.year = year;
    this.basePrice = basePrice;
    this.origin = origin;
  }

  // protected getters cho subclass
  protected double getBasePrice() {
    return basePrice;
  }

  protected Origin getOrigin() {
    return origin;
  }

  public abstract double importTax();

  public abstract double specialConsumptionTax();

  public final double vat() {
    return VAT_RATE * (basePrice + importTax() + specialConsumptionTax());
  }

  public final double totalPrice() {
    return basePrice + importTax() + specialConsumptionTax() + vat();
  }

  public void printInfo() {
    System.out.println("Model: " + model);
    System.out.println("Manufacturer: " + manufacturer);
    System.out.println("Year: " + year);
    System.out.println("Origin: " + origin);
    System.out.printf("Import tax: %.0f%n", importTax());
    System.out.printf("Special consumption tax: %.0f%n", specialConsumptionTax());
    System.out.printf("VAT: %.0f%n", vat());
    System.out.printf("Total price: %.0f%n", totalPrice());
  }
}
