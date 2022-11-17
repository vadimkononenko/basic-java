package lab5;

import lab5.special.Letter;
import lab5.special.Sentence;
import lab5.special.Text;
import lab5.special.Word;
import lab5.special.separatingSigns.Comma;
import lab5.special.separatingSigns.Dot;
import lab5.special.separatingSigns.SeparatingSign;

import java.util.ArrayList;
import java.util.Arrays;

public class MainLab5 {
    public static void main(String[] args) {
        Letter a = new Letter('a');
        Letter b = new Letter('b');
        Letter c = new Letter('c');
        Word abc = new Word(new Letter[]{a, b, c});
        Word aaa = new Word(new Letter[]{a, a, a});
        Word bbb = new Word(new Letter[]{b, b, b});
        Comma comma = new Comma();
        Dot dot = new Dot();
//        System.out.println(a + "" + comma + " " + abc);

        Word[][] words = new Word[][] {
                {abc, aaa},
                {bbb, abc},
                {aaa}
        };
        SeparatingSign[] ss = new SeparatingSign[] {
                comma,
                comma,
                dot
        };
        Sentence sentence = new Sentence(words, ss);
        Sentence sentence1 = new Sentence(words, ss);
        Sentence sentence2 = new Sentence(words, ss);
        System.out.println(sentence);

        Text text = new Text(new Sentence[]{sentence, sentence1, sentence2});
        System.out.println(text);
    }
}
