package Decorator;

// Shield class
public class Shield extends StuffDecorator {

    public Shield(Warrior holder) {
        super(holder);
        System.out.println("May this shield protect me against every enemy.");
    }

    @Override
    public int getHp() {
        return super.getHp() + 10;
    }
}