package Ex45;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class wordReplaceTest {

    @Test
    public void replaceWord() {
        String sentence_1 =  "One should never utilize the word \"utilize\"" +
                " in writing. Use \"use\" instead.";
        String sentence_2 = "For example, \"She uses an IDE to write her Java programs\"" +
                " instead of \"She";
        String sentence_3 = "utilizes an IDE to write her Java programs\".";

        String mod_sentence_1 = "One should never use the word \"use\"" +
                " in writing. Use \"use\" instead.";
        String mod_sentence_2 = "For example, \"She uses an IDE to write her Java programs\"" +
                " instead of \"She";
        String mod_sentence_3 = "uses an IDE to write her Java programs\".";

        ArrayList<String> sentences = new ArrayList<>();
        sentences.add(sentence_1);
        sentences.add(sentence_2);
        sentences.add(sentence_3);

        List<String> mod_sentences = new ArrayList<>();
        mod_sentences.add(mod_sentence_1);
        mod_sentences.add(mod_sentence_2);
        mod_sentences.add(mod_sentence_3);
        wordReplace wr = new wordReplace();

        assertEquals(mod_sentences,wr.replaceWord(sentences));
        // I was doing wr.replaceWord(mod_sentences,wr.replaceWord(sentences))
        // and wondering why it wasn't working. :kekw:
    }
}