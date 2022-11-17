package lab5.special.separatingSigns;

public class QuestionMark implements SeparatingSign {
    private final char questionMark;

    public QuestionMark() {
        questionMark = '?';
    }

    @Override
    public String toString() {
        return questionMark + "";
    }
}
