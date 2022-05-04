package BikeSelectModel;

import TwoWheelers.MotorCycles;
import TwoWheelers.Scooters;
import TwoWheelers.SuperBikes;
import TwoWheelers.*;
import java.util.Scanner;

public class BikeSelectModel {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("====== Welcome to the Bike Buying Guide =====");
	 int finalChoice;
do{
  String company;
    
    do{
      System.out.println(
        "Which company bike you are looking for? Please enter any of the choice => Honda or Bajaj"
      );
      company = sc.next();
  if (company.equalsIgnoreCase("Honda")) {
    MotorCycles[] model = new MotorCycles[6];
    
    model[0] = new MotorCycles("CB200X", "Sprots Red", 185,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    model[1] = new MotorCycles("Hornet 2.0", "PEARL IGNEOUS BLACK", 185,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    model[2] = new MotorCycles("XBLADE", "Matte marvel blue metallic", 165,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    model[3] = new MotorCycles("Unicorn", "Black", 160,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    model[4] = new MotorCycles("SP125", "Blakc Yellow", 125,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    model[5] = new MotorCycles("CBSHINE", "Black", 125,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);

    Scooters[] ScootyModel = new Scooters[6];
    ScootyModel[0] = new Scooters("Grazia", "Sprots Red", 185,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    ScootyModel[1] = new Scooters("Activa125", "PEARL IGNEOUS BLACK", 185,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    ScootyModel[2] = new Scooters("Grazia Repsol", "Matte marvel blue metallic", 165,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    ScootyModel[3] = new Scooters("Grazia SE", "Black", 160,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    ScootyModel[4] = new Scooters("Dio", "Blakc Yellow", 125,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    ScootyModel[5] = new Scooters("Activa 6G", "Black", 125,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);

    SuperBikes[] sBikeModel = new SuperBikes[5];
    sBikeModel[0] = new SuperBikes("CB350", "Sprots Red", 185,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    sBikeModel[1] = new SuperBikes("CB500X 2.0", "PEARL IGNEOUS BLACK", 185,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    sBikeModel[2] = new SuperBikes("CB650R", "Matte marvel blue metallic", 165,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    sBikeModel[3] = new SuperBikes("Goldwine", "Black", 160,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    sBikeModel[4] = new SuperBikes("CB300", "Blakc Yellow", 125,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);

    System.out.println(
      "Please let us which type of bike you are looking for 1.MotorBike 2.Scooty 3.SuperBike"
    );
    //call display function of particular type of bike
    int typeChoice = 1;
    do{
    System.out.println("Please enter the choice Number from(1/2/3)");
    typeChoice = sc.nextInt();
  }
  while (typeChoice<1 || typeChoice>3);

    System.out.println("We have below models in the selected segment");
    TwoWheelers.choseType(typeChoice);
    
    System.out.println(
      "Please choose the model number to check the detailed specifications"
    );
    int key=0;
    int ModelNum= 0;
    //display the specs as per the choice
    if (typeChoice == 1) {
      do{
        ModelNum = sc.nextInt();
        key = ModelNum-1;
      switch (key) {
        case 0:
          model[0].displaySpecs();
          break;
        case 1:
          model[1].displaySpecs();
          break;
        case 2:
          model[2].displaySpecs();
          break;
        case 3:
          model[3].displaySpecs();
          break;
        case 4:
          model[4].displaySpecs();
          break;
        case 5:
          model[5].displaySpecs();
          break;
        default:
          System.out.println("Please enter the number from 1 to 6");
    } 
      }    while(ModelNum>6 || ModelNum<1);
  }
    else if (typeChoice == 2) {
      do{
        ModelNum = sc.nextInt();
        key = ModelNum-1;
      switch (key) {
        case 0:
          ScootyModel[0].displaySpecs();
          break;
        case 1:
          ScootyModel[1].displaySpecs();
          break;
        case 2:
          ScootyModel[2].displaySpecs();
          break;
        case 3:
          ScootyModel[3].displaySpecs();
          break;
        case 4:
          ScootyModel[4].displaySpecs();
          break;
        case 5:
          ScootyModel[5].displaySpecs();
          break;
        default:
          System.out.println("Please enter the number from 1 to 6");
      }
    }while(ModelNum>6 || ModelNum<1);
    } else if (typeChoice == 3) {
      do{
        ModelNum = sc.nextInt();
        key = ModelNum-1;
      switch (key) {
        case 0:
          sBikeModel[0].displaySpecs();
          break;
        case 1:
          sBikeModel[1].displaySpecs();
          break;
        case 2:
          sBikeModel[2].displaySpecs();
          break;
        case 3:
          sBikeModel[3].displaySpecs();
          break;
        case 4:
          sBikeModel[4].displaySpecs();
          break;
        default:
          System.out.println("Please enter the number from 1 to 5");
      }
    }while(ModelNum>5 || ModelNum<1);
    }
  } else if(company.equalsIgnoreCase("Bajaj")){
    int ModelNum=0;
    MotorCyclesBajaj[] model = new MotorCyclesBajaj[6];
    
    model[0] = new MotorCyclesBajaj("CT100X", "Sprots Red", 185,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    model[1] = new MotorCyclesBajaj("PLATINA 100 2.0", "PEARL IGNEOUS BLACK", 185,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    model[2] = new MotorCyclesBajaj("PLATINA 110", "Matte marvel blue metallic", 165,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    model[3] = new MotorCyclesBajaj("AVENGER 160", "Black", 160,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    model[4] = new MotorCyclesBajaj("Pulsor RS 200", "Blakc Yellow", 125,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    model[5] = new MotorCyclesBajaj("Pulsor NS 200", "Black", 125,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);

    ScootersBajaj[] ScootyModel = new ScootersBajaj[6];
    ScootyModel[0] = new ScootersBajaj("Chetak 1.0", "Sprots Red", 185,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    ScootyModel[1] = new ScootersBajaj("Scooter", "PEARL IGNEOUS BLACK", 185,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    ScootyModel[2] = new ScootersBajaj("Grazia Repsol", "Matte marvel blue metallic", 165,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    ScootyModel[3] = new ScootersBajaj("CHetak", "Black", 160,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    ScootyModel[4] = new ScootersBajaj("Ather 450X", "Blakc Yellow", 125,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    ScootyModel[5] = new ScootersBajaj("CHETAK 2.0", "Black", 125,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);

    SuperBikesBajaj[] sBikeModel = new SuperBikesBajaj[5];
    
    sBikeModel[0] = new SuperBikesBajaj("AVENGER 220 CRUIZE", "Sprots Red", 185,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    sBikeModel[1] = new SuperBikesBajaj("Dominor 400", "PEARL IGNEOUS BLACK", 185,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    sBikeModel[2] = new SuperBikesBajaj("Dominor 250", "Matte marvel blue metallic", 165,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    sBikeModel[3] = new SuperBikesBajaj("Pulsor 250", "Black", 160,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);
    sBikeModel[4] = new SuperBikesBajaj("CB300", "Blakc Yellow", 125,"4 Stroke SI Engine BS-V","12.7 kW @ 8500 rpm","16.1 N-m @ 6000 rpm","PGM-FI",61,63,"Self Start","Diamond type","Upside down Fork (USD)","Upside down Fork (USD)","110/70-17 M/C 54S (Tubeless)","140/70- 17 M/C 66S (Tubeless)","Disc -276 mm (1 Channel ABS)","Disc 220 mm","Multiplate Wet Clutch",5,96870.00);

    System.out.println(
      "Please let us which type of bike you are looking for 1.MotorBike 2.Scooty 3.SuperBike"
    );
  
    //call display function of particular type of bike
       int typeChoice = 1;
       do{
       System.out.println("Please enter the choice Number from(1/2/3)");
       typeChoice = sc.nextInt();
     }
     while (typeChoice<1 || typeChoice>3);
 
       System.out.println("We have below models in the selected segment");
       TwoWheelers.choseTypeBajaj(typeChoice);
      
    System.out.println(
      "Please choose the model number to check the detailed specifications"
    );
    int key ;
    //display the specs as per the choice
    if (typeChoice == 1) {
      do{
        ModelNum = sc.nextInt();
        key = ModelNum-1;
      switch (key) {
        case 0:
          model[0].displaySpecs();
          break;
        case 1:
          model[1].displaySpecs();
          break;
        case 2:
          model[2].displaySpecs();
          break;
        case 3:
          model[3].displaySpecs();
          break;
        case 4:
          model[4].displaySpecs();
          break;
        case 5:
          model[5].displaySpecs();
          break;
        default:
          System.out.println("Please enter the number from 1 to 6");
      }     
    }
      while(ModelNum>5 || ModelNum<1);
    } else if (typeChoice == 2) {
      do{
        ModelNum = sc.nextInt();
        key = ModelNum-1;
      switch (key) {
        case 0:
          ScootyModel[0].displaySpecs();
          break;
        case 1:
          ScootyModel[1].displaySpecs();
          break;
        case 2:
          ScootyModel[2].displaySpecs();
          break;
        case 3:
          ScootyModel[3].displaySpecs();
          break;
        case 4:
          ScootyModel[4].displaySpecs();
          break;
        case 5:
          ScootyModel[5].displaySpecs();
          break;
        default:
          System.out.println("Please enter the number from 1 to 6");
      }
    }
      while(ModelNum>6 || ModelNum<1);
    } else if (typeChoice == 3) {
      do{
        ModelNum = sc.nextInt();
        key = ModelNum-1;
      switch (key) {
        case 0:
          sBikeModel[0].displaySpecs();
          break;
        case 1:
          sBikeModel[1].displaySpecs();
          break;
        case 2:
          sBikeModel[2].displaySpecs();
          break;
        case 3:
          sBikeModel[3].displaySpecs();
          break;
        case 4:
          sBikeModel[4].displaySpecs();
          break;
        default:
          System.out.println("Please enter the number from 1 to 5");
      }
    }
    while(ModelNum>5 || ModelNum<1);
  }

  }
}
while(!(company.equalsIgnoreCase("Bajaj")) && !(company.equalsIgnoreCase("Honda")));
System.out.println(
  "If you liked the bike, Please enter 1 to book an oppointment! to check another model Enter 0"
  );
  finalChoice = sc.nextInt();
  //if fc =1 then congrats him
  if (finalChoice == 1) {
    System.out.println("Please neter your 10 digit Contact Number : ");
    long mobileNo =sc.nextLong();

    if (company.equals("Bajaj")) {
      System.out.println(
        "Congratulation!! Thank you for choosing Bajaj Motors! Our Executive will reach out to you within next 24 hours!"
        );
      } else {
        System.out.println(
          "Congratulation!! Thank you for choosing Honda Motors! Our Executive will reach out to you within next 24 hours!"
          );
        }
      }
    }
//if fc=0 , call control move back to the first line from here 
while(finalChoice == 0);
  }
}
