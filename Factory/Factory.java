package Factory;

import java.util.ArrayList;
import java.util.List;

public class Factory {

    public Toy create(String name) throws NoSuchToyException {
        if(name.equals("teddy")) {
            return new TeddyBear();
        } else if(name.equals("gameboy")) {
            return new Gameboy();
        }

        throw new NoSuchToyException("No such toy: " + name + ".");
    }

    public List<GiftPaper> getPapers(int number){
        List<GiftPaper> papers = new ArrayList<>();
        for(int i = 0; i < number; i++){
            papers.add(new GiftPaper());
        }

        return papers;
    }

}
