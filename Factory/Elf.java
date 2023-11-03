package Factory;

import java.util.List;

public class Elf {

    protected Toy toy;
    protected List<GiftPaper> papers;
    protected Factory factory;

    public Elf(Factory factory){
        this.factory = factory;
    }

    public boolean pickToy(String name){
        if(toy != null){
            System.out.println("Minute please?! I'm not that fast.");
            return false;
        }

        try {
            toy = factory.create(name);
            System.out.println("What a nice one! I would have liked to keep it...");
            return true;
        } catch (NoSuchToyException e) {
            System.out.println("I didn't find any " + name + ".");
            return false;
        }
    }

    public boolean pickPapers(int number){
        papers = factory.getPapers(number);
        return true;
    }

    public GiftPaper pack(){
        if(papers == null || papers.isEmpty()){
            System.out.println("Wait... I can't pack it with my shirt.");
            return null;
        }

        GiftPaper paper = papers.remove(0);
        if(toy == null){
            System.out.println("I don't have any toy, but hey at least it's paper!");
        } else {
            System.out.println("And another kid will be happy!");
            paper.wrap(toy);
        }
        toy = null;
        return paper;
    }

}
