package lab5.special.separatingSigns;

public class Tab implements SeparatingSign {
    private final char tab;

    public Tab() {
        tab = '\t';
    }

    @Override
    public String toString() {
        return tab + "";
    }
}
