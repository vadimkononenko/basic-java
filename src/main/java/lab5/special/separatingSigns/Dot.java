package lab5.special.separatingSigns;

public class Dot implements SeparatingSign {
    private final char dot;

    public Dot() {
        dot = '.';
    }

    @Override
    public String toString() {
        return dot + "";
    }
}
