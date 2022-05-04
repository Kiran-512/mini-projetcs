package TwoWheelers;

public class TwoWheelers {

  //General info
  protected String BikeName;
  protected String BikeColor;
  protected int EngineCC;
  protected int wheelBase;
  protected int groundClearance;
  protected int fuelTank;

  //Engine specifications
  protected String EngineType;
  protected String maxPow;
  protected String maxTorque;
  protected String fuelSystem;
  protected int bore;
  protected int stroke;
  protected String engStartMethod;

  //Frame and suspension
  protected String frameType;
  protected String frontSuspension;
  protected String rearSuspension;

  //TYRES & BRAKES
  protected String frontTyre;
  protected String backTyre;
  protected String frontBrakes;
  protected String backBrakes;

  //Transmission
  protected String clutchType;
  protected int noOfGear;

  //Price
  protected double price;

  static String EngineStroke = "4 Stroke";


  public static void choseType(int typeChoice) {
    if (typeChoice == 1) {
      MotorCycles.displayModels();
    } else if (typeChoice == 2) {
      Scooters.displayModels();
    } else if (typeChoice == 3) {
      SuperBikes.displayModels();
    }
  }

  public static void choseTypeBajaj(int typeChoice) {
    if (typeChoice == 1) {
      MotorCyclesBajaj.displayModels();
    } else if (typeChoice == 2) {
      ScootersBajaj.displayModels();
    } else if (typeChoice == 3) {
       SuperBikesBajaj.displayModels();
    }
  }

  public void displaySpecs() {
    System.out.println("Your choice is Superbb!");
    System.out.println("=========General Information=========");
    System.out.println("Model: " + this.BikeName);
    System.out.println("color: " + this.BikeColor);
    System.out.println("Engine Capacity: " + this.EngineCC);
    System.out.println("Engine Stroke :"+ EngineStroke);
    System.out.println("========= Engine Specifications =========");
    System.out.println("Engine Type: " + this.EngineType);
    System.out.println("Max Power: " + this.maxPow);
    System.out.println("Max Torqu: " + this.maxTorque);
    System.out.println("Fuel System:  " + this.fuelSystem);
    System.out.println("bore: " + this.bore);
    System.out.println("Stroke: " + this.stroke);
    System.out.println("Engine Start Method: " + this.engStartMethod);
    System.out.println("========= Frame and Suspension =========");
    System.out.println("Frame Type: " + this.frameType);
    System.out.println("Fron Suspension: " + this.frontSuspension);
    System.out.println("Rear Suspension: " + this.rearSuspension);
    System.out.println("Front Tyre: " + this.frontTyre);
    System.out.println("Back Tyre: " + this.backTyre);
    System.out.println("Front Brakes: " + this.frontBrakes);
    System.out.println("Back Brakes: " + this.backBrakes);

    System.out.println("=========================");
    this.totalCost();
  }
  public void totalCost() {
    double exShowRoomPrices = this.price;
    //Caculation kep small
    double OnRoadPrice = 1.15 * exShowRoomPrices;
    System.out.println(
      "The exShowroom prices the vehicle is : Rs." + exShowRoomPrices+"/-");
    System.out.println(
      "The total cost of the vehicle, including RTO,tax etc is : Rs." + OnRoadPrice+"/-"
    );
  }
}