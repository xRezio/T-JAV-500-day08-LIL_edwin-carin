package Decorator;

public abstract class Warrior {

    protected int hp;
    protected int dmg;

    protected Warrior(int hp, int dmg) {
        this.hp = hp;
        this.dmg = dmg;
    }

    public int getHp() {
        return hp;
    }

    public int getDmg() {
        return dmg;
    }
}
