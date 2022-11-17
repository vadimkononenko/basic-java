package lab5;

import lab5.special.Letter;
import lab5.special.Sentence;
import lab5.special.Text;
import lab5.special.Word;
import lab5.special.separatingSigns.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainLab5 {
    public static void main(String[] args) {
        System.out.println("\n------- Experimental string -------");
        System.out.println(mockText());
        findUniqueWord(mockText());
    }

    private static String mockText() {
        Letter a = new Letter('a');
        Letter b = new Letter('b');
        Letter c = new Letter('c');
        Letter d = new Letter('d');
        Letter e = new Letter('e');
        Letter f = new Letter('f');
        Letter g = new Letter('g');
        Letter h = new Letter('h');
        Letter i = new Letter('i');
        Letter j = new Letter('j');
        Letter k = new Letter('k');
        Letter l = new Letter('l');
        Letter m = new Letter('m');
        Letter n = new Letter('n');
        Letter o = new Letter('o');
        Letter p = new Letter('p');
        Letter q = new Letter('q');
        Letter r = new Letter('r');
        Letter s = new Letter('s');
        Letter t = new Letter('t');
        Letter u = new Letter('u');
        Letter v = new Letter('v');
        Letter w = new Letter('w');
        Letter x = new Letter('x');
        Letter y = new Letter('y');
        Letter z = new Letter('z');

        Comma comma = new Comma();
        Dot dot = new Dot();
        ExclamationMark exclamationMark = new ExclamationMark();
        QuestionMark questionMark = new QuestionMark();
        Space space = new Space();

        Word hello = new Word(new Letter[]{h, e, l, l, o});
        Word world = new Word(new Letter[]{w, o, r, l, d});
        Word my = new Word(new Letter[]{m, y});
        Word name = new Word(new Letter[]{n, a, m, e});
        Word is = new Word(new Letter[]{i, s});
        Word vadym = new Word(new Letter[]{v, a, d, y, m});
        Word lol = new Word(new Letter[]{l, o, l});

        // sentence 1
        Word[] helloWorldLol = new Word[]{
                hello,
                world,
                lol,
                lol
        };
        SeparatingSign[] helloWorldLolSS = new SeparatingSign[]{
                comma,
                space,
                space,
                exclamationMark
        };

        // sentence 2
        Word[] helloWorld = new Word[]{
                hello,
                world
        };
        SeparatingSign[] helloWorldSS = new SeparatingSign[]{
                comma,
                exclamationMark
        };

        // sentence 3
        Word[] myNameIsVadym = new Word[]{
                my,
                name,
                is,
                vadym
        };
        SeparatingSign[] myNameIsVadymSS = new SeparatingSign[]{
                space,
                space,
                space,
                dot
        };

        // sentence 4
        Word[] nameVadym = new Word[]{
                name,
                vadym
        };
        SeparatingSign[] nameVadymSS = new SeparatingSign[]{
                space,
                dot
        };

        Sentence helloWorldLolSentence = new Sentence(helloWorldLol, helloWorldLolSS);
        Sentence helloWorldSentence = new Sentence(helloWorld, helloWorldSS);
        Sentence myNameIsVadymSentence = new Sentence(myNameIsVadym, myNameIsVadymSS);
        Sentence nameVadymSentence = new Sentence(nameVadym, nameVadymSS);

        Sentence[] sentences = new Sentence[]{
                helloWorldLolSentence,
                helloWorldSentence,
                myNameIsVadymSentence,
                nameVadymSentence
        };

        Text text = new Text(sentences);
        return text.toString();
    }

    private static void findUniqueWord(String text) {
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

        if (firstSentencesWords.size() == 0) {
            System.out.println("0 unique words");
            return;
        }
        System.out.println(firstSentencesWords.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", ")));

    }
}
