package day9;

public class Day9Car {
    public String name;
    public String species;
    public String color;

    public Day9Car() {
    }

    public Day9Car(String name) {
        this.name = name;
    }

    public Day9Car(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public Day9Car(String name, String species, String color) {
        this.name = name;
        this.species = species;
        this.color = color;
    }

    public void horn() {
        System.out.println(name + "빵빵");
    }
    public void jajun(){
        System.out.println("재준이 바보");
    }
}
