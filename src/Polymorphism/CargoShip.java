package Polymorphism;

public class CargoShip extends Ship {
    int cargoCapacity;

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void printInfo() {
        System.out.println("Cargo Ship\n" + "Name: " + name + "\nCargo Capacity: " + cargoCapacity + " tons\n");
    }
}
