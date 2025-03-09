package day15;

public abstract class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void startWork() {
        System.out.println(name + "(" + role + ")이(가) 일을 시작합니다.");
    }

    public abstract void performDuties();

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}
