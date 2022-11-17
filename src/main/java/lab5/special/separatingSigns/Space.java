package lab5.special.separatingSigns;

public class Space implements SeparatingSign {
    private final char space;

    public Space() {
        space = ' ';
    }

    @Override
    public String toString() {
        return space + "";
    }
}
