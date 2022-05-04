package TwoWheelers;

public class SuperBikes extends TwoWheelers {

  public SuperBikes(
    String name,
    String bikeColor,
    int engineCC,
    String EngineType,
    String maxPow,
    String maxTorque,
    String fuelSystem,
    int bore,
    int stroke,
    String engStartMethod,
    String frameType,
    String frontSuspension,
    String rearSuspension,
    String frontTyre,
    String backTyre,
    String frontBrakes,
    String backBrakes,
    String clutchType,
    int noOfGear,
    double price

  ) {
    this.BikeName = name;
    this.BikeColor = bikeColor;
    this.EngineCC = engineCC;
    this.EngineType = EngineType;
    this.maxPow = maxPow;
    this.maxTorque = maxTorque;
    this.fuelSystem = fuelSystem;
    this.bore = bore;
    this.stroke = stroke;
    this.engStartMethod = engStartMethod;
    this.frameType = frameType;
    this.frontSuspension = frontSuspension;
    this.rearSuspension = rearSuspension;
    this.frontTyre = frontTyre;
    this.backTyre = backTyre;
    this.frontBrakes = frontBrakes;
    this.backBrakes = backBrakes;
    this.clutchType=clutchType;
    this.noOfGear=noOfGear;
    this.price = price;
  }

  public static void displayModels() {
    System.out.print(
      " 1.CB350 RS \n 2.CB500X  \n 3.CB650R \n 4.Goldwine \n 5.CB300 R \n"
    );
  }

}
