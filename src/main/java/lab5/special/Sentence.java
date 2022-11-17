package lab5.special;

import lab5.special.separatingSigns.SeparatingSign;

public class Sentence {

    private final Word[][] words;
    private final SeparatingSign[] separatingSigns;

    public Sentence(Word[][] words, SeparatingSign[] separatingSigns) {
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
            StringBuilder wordsRes = new StringBuilder();
            for (int j = 0; j < words[i].length; j++) {
                wordsRes.append(words[i][j]);
                if (j != words[i].length - 1) {
                    wordsRes.append(" ");
                }
            }
            sentence.append(wordsRes);
            sentence.append(separatingSigns[i]);
        }
        return sentence.toString();
    }

}
