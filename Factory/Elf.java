package Factory;

public class Elf {
    private Toy toy;
    private GiftPaper papers;
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

    public boolean pickPapers(int nb) {
        papers = factory.getPapers(nb).get(0);
        return true;
    }

    public GiftPaper pack() {
        if (toy == null && papers != null) {
            System.out.println("I don't have any toy, but I've some paper!");
            return null;
        } else if (toy != null && papers == null) {
            System.out.println("Wait... I can't pack it with my shirt.");
            return null;
        } else if (toy != null) {
            papers.wrap(toy);
            toy = null;
            System.out.println("And another kid will be happy!");
            return papers;
        }
        return null;
    }
}
