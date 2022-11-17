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
        return Arrays.stream(sentences)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
