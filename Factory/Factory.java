package Factory;

import java.util.ArrayList;
import java.util.List;

public class Factory {

    public Toy create(String type) throws NoSuchToyException {
        switch (type.toLowerCase()) {
            case "teddy":
                return new TeddyBear();
            case "gameboy":
                return new Gameboy();
            default:
                throw new NoSuchToyException(type);
        }
    }

    public List<GiftPaper> getPapers(int n) {
        List<GiftPaper> papers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            papers.add(new GiftPaper());
        }
        return papers;
    }
}
