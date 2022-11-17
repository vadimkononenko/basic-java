package lab5.special.separatingSigns;

public class ExclamationMark implements SeparatingSign {
    private final char exclamationMark;

    public ExclamationMark() {
        exclamationMark = '!';
    }

    @Override
    public String toString() {
        return exclamationMark + "";
    }
}
