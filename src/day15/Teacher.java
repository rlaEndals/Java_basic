package day15;

public abstract class Teacher {
    protected String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println(name);
    }

    public abstract void teachSubject();
}
