package Decorator;

// Abstract Warrior class
public abstract class Warrior {
    protected int hp;
    protected int dmg;

    public int getHp() {
        return this.hp;
    }

    public int getDmg() {
        return this.dmg;
    }
}