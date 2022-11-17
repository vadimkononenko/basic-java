import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*

C3 = 2
C17 = 2

- String
- Знайти таке слово в першому реченні заданого тексту,
якого не має в жодному з наступних.

 */

public class Lab3 {
    public static void main(String[] args) {
        String input = "vadym name word ios name. My  is. ios is Vadym.";
        findUniqWord(input);
    }

    private static void findUniqWord(String text) {
        if (text == null)
            throw new IllegalStateException("String must be not null");

        String[] sentences = text.split("[.!?]");
        List<String> firstSentencesWords = new ArrayList<>();
        List<String> otherWords = new ArrayList<>();

        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sentences[i]
                    .trim()
                    .replaceAll(" +", " ")
                    .replaceAll("[\\-:;]", " ")
                    .replaceAll("!", "")
                    .replaceAll(",", " ")
                    .toLowerCase();
            if (i == 0) {
                firstSentencesWords.addAll(List.of(sentences[i].split(" ")));
            } else {
                otherWords.addAll(Arrays.asList(sentences[i].split(" ")));
            }
        }

        firstSentencesWords = firstSentencesWords.stream().distinct().collect(Collectors.toList());
        otherWords = otherWords.stream().distinct().collect(Collectors.toList());

        for (String word: otherWords) {
            firstSentencesWords.remove(word);
        }

        System.out.println("\n------- Unique words -------");
        System.out.println(firstSentencesWords.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", ")));
    }
}
