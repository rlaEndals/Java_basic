package day16;

public class Mage implements Attackable, Healable {
    @Override
    public void attack() {
        System.out.println("공격을 합니다.");
    }

    @Override
    public void heal() {
        System.out.println("힐을 합니다.");
    }
}
