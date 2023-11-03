package Factory;

import java.util.List;

public class Elf {
    private Toy toy;
    private List<GiftPaper> papers; 
    private Factory factory;

    public Elf(Factory factory) {
        this.factory = factory;
    }

    public boolean pickToy(String toyName) {
        if (toy != null) {
            System.out.println("Minute please?! I'm not that fast.");
            return false;
        }

        try {
            toy = factory.create(toyName);
            System.out.println("What a nice one! I would have liked to keep it...");
            return true;
        } catch (NoSuchToyException e) {
            System.out.println("I didn't find any " + toyName + ".");
            return false;
        }
    }

    public boolean ers(int nb) {
        papers = factory.getPapers(nb);
        return true;
    }

    public GiftPaper pack() {
        if (toy == null) {
            System.out.println("I don't have any toy, but I've some paper!");
            return null;
        }

        if (papers == null || papers.isEmpty()) {
            System.out.println("Wait... I can't pack it with my shirt.");
            return null;
        }

        GiftPaper paper = papers.remove(0);
        paper.wrap(toy);
        toy = null;
        System.out.println("And another kid will be happy!");
        return paper;
    }
}
