package lab5.special.separatingSigns;

public class Dash implements SeparatingSign {
    private final char dash;

    public Dash() {
        dash = '-';
    }

    @Override
    public String toString() {
        return dash + "";
    }
}
