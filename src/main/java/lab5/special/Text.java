package lab5.special;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Text {
    private final Sentence[] sentences;

    public Text(Sentence[] sentences) {
        this.sentences = sentences;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < sentences.length; i++) {
            text.append(sentences[i]);
            if (i != sentences.length - 1) {
                text.append(" ");
            }
        }

        return text.toString();
    }
}
