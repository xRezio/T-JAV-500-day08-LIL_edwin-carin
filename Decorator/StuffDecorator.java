package Decorator;

public class StuffDecorator extends Warrior {

    protected Warrior holder;

    public StuffDecorator(Warrior warrior) {
        super(warrior.hp, warrior.dmg);
        this.holder = warrior;
    }

    @Override
    public int getHp() {
        return holder.getHp();
    }

    @Override
    public int getDmg() {
        return holder.getDmg();
    }
}
