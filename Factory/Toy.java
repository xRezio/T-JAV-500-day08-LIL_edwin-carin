package Factory;

public abstract class Toy {
    private String title;

    public Toy(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
