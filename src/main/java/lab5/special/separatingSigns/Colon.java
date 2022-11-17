package lab5.special.separatingSigns;

public class Colon implements SeparatingSign {
    private final char colon;

    public Colon() {
        colon = '.';
    }

    @Override
    public String toString() {
        return colon + "";
    }
}
