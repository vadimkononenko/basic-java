package lab5.special;

import lab5.special.separatingSigns.SeparatingSign;
import lab5.special.separatingSigns.Space;

public class Sentence {

    private final Word[] words;
    private final SeparatingSign[] separatingSigns;

    public Sentence(Word[] words, SeparatingSign[] separatingSigns) {
        if (words.length == separatingSigns.length) {
            this.words = words;
            this.separatingSigns = separatingSigns;
        } else {
            throw new IllegalStateException("Length of words must be equal to separating signs");
        }
    }

    @Override
    public String toString() {
        StringBuilder sentence = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sentence.append(words[i]);
            sentence.append(separatingSigns[i]);
        }
        return sentence.toString();
    }

}
