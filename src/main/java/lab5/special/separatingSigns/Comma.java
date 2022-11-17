package lab5.special.separatingSigns;

public class Comma implements SeparatingSign {
    private final char comma;

    public Comma() {
        comma = ',';
    }

    @Override
    public String toString() {
        return comma + "";
    }
}
