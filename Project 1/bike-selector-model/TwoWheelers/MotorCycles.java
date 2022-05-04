package TwoWheelers;

public class MotorCycles extends TwoWheelers {

  public MotorCycles(    String name,
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
      " 1.CB200X \n 2.Hornet 2.0 \n 3.XBLADE \n 4.Unicorn \n 5.SP125 \n 6.CBSHINE \n"
    );
  }

}
