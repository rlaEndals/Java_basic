package day16;

public class Day16Practice {
    public static void main(String[] args) {
        Attackable warrior = new Warrior();
        Mage mage = new Mage();
        Healable priest = new Priest();

        warrior.attack();
        mage.attack();
        mage.heal();
        priest.heal();
    }
}
