package tests;

import collections.File;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by DioAn1730700 on 2018-03-26.
 */
class FileTest {

    File<String> test;

    @BeforeEach
    void setUp() {

        test = new File<String>();

        String element = "café";
        test.add(element);

        String element2 = "lait";
        test.add(element2);

        String element3 = "jus";
        test.add(element3);
    }

    @Test
    void add() {
        String element4 = "limonade";
        test.add(element4);
        assertEquals(test.peek(), "café");
    }

    @Test
    void remove() {
        String element5 = "eau";
        test.add(element5);
        test.remove();
        assertEquals(test.peek(), "lait");
    }

    /*@Test    ne sert à rien
    void peek() {
    }*/

    @Test
    void clear() {
        test.clear();
        assertEquals(test.size(),0);
    }

    @Test
    void size() {
        test.size();
        assertEquals(test.size(), 3);
    }

}