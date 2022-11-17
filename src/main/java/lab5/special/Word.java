package lab5.special;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Word {
    private final Letter[] word;

    public Word(Letter[] word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return Arrays.stream(word).map(String::valueOf).collect(Collectors.joining());
    }
}
