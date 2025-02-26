package day13.animal;

public class Day13Animal {
    private String name;
    protected String color;
    protected String gender;

    public Day13Animal(String name, String color, String gender) {
        this.name = name;
        this.color = color;
        this.gender = gender;
    }

    public void makeSound() {
        System.out.println(this.name + "이(가) 소리를 냅니다.");
    }

    public void moving() {
        System.out.println(this.name + "이(가) 움직입니다.");
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
