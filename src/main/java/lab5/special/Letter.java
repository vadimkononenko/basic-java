package lab5.special;

public class Letter {
    private final char letter;

    public Letter(char letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return letter + "";
    }
}
