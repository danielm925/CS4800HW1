package Polymorphism;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Ship[] ships = new Ship[3];
        int userChoice;


        int i = 0;
        while(i < 3)
        {
            System.out.println("What type is boat #" + (i + 1) + "? \n1.Ship \n2.Cruise Ship \n3.Cargo Ship");
            userChoice = scanner.nextInt();
            scanner.nextLine();

            switch(userChoice) {
                case 1:
                    Ship tempShip = new Ship();
                    System.out.println("What is the name of the ship?");
                    tempShip.setName(scanner.nextLine());
                    System.out.println("What is the year of the ship?");
                    tempShip.setYear(scanner.nextLine());
                    ships[i] = tempShip;
                    break;
                case 2:
                    CruiseShip tempCruiseShip = new CruiseShip();
                    System.out.println("What is the name of the cruise ship?");
                    tempCruiseShip.setName(scanner.nextLine());
                    System.out.println("What is the maximum number of passengers that the cruise ship can hold?");
                    tempCruiseShip.setPassengerCount(scanner.nextInt());
                    ships[i] = tempCruiseShip;
                    break;
                case 3:
                    CargoShip tempCargoShip = new CargoShip();
                    System.out.println("What is the name of the cargo ship?");
                    tempCargoShip.setName(scanner.nextLine());
                    System.out.println("What is the cargo capacity of the cargo ship in tonnage?");
                    tempCargoShip.setCargoCapacity(scanner.nextInt());
                    ships[i] = tempCargoShip;
                    break;
                default:
                    System.out.println("Invalid option... Setting to default ship");
                    ships[i] = new Ship();
                    System.out.println("What is the name of the ship?");
                    ships[i].setName(scanner.nextLine());
                    System.out.println("What is the year of the ship?");
                    ships[i].setYear(scanner.nextLine());
                    break;
            }
            i++;
        }

        for(int j = 0; j < 3; j++)
        {
            ships[j].printInfo();
        }
    }
}
