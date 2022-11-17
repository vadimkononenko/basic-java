package lab5.special.separatingSigns;

public class Semicolon implements SeparatingSign {
    private final char semicolon;

    public Semicolon() {
        semicolon = '-';
    }

    @Override
    public String toString() {
        return semicolon + "";
    }
}
