package day14;

public class Day14Bird extends Day14Animal{

    private int wingSize;

    public Day14Bird(String name, int wingSize) {
        super(name);
        this.wingSize = wingSize;
    }

      public void fly(){System.out.println(getName() + "가 훨훨 납니다.");}

    @Override
    public void makeSound() {
        System.out.println("짹짹");
    }
}
