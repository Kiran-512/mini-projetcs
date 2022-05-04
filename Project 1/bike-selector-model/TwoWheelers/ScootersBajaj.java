package TwoWheelers;

public class ScootersBajaj extends TwoWheelers{

    public ScootersBajaj(
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
        " 1.Chetak 1.0  \n 2.Scooter  \n 3.Grazia Repsol \n 4.CHetak \n 5.Ather 450X \n 6.CHETAK 2.0"
      );
    }
  
}
