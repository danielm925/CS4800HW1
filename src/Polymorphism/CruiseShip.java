package Polymorphism;

public class CruiseShip extends Ship {

    int passengerCount;

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public void printInfo() {
        System.out.println("Cruise Ship\n" + "Name: " + name + "\nNumber of Passengers: " + passengerCount + "\n");
    }
}
