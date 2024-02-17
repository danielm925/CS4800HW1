package Polymorphism;

public class Ship {
    String name;
    String year;

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void printInfo() {
        System.out.println("Ship\n" + "Name: " + name + "\nYear: " + year + "\n");
    }
}
