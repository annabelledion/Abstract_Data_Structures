package tests;

import collections.Pile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by DioAn1730700 on 2018-03-26.
 */
class PileTest {

    Pile<String> test;

    @BeforeEach

    void setUp() {
        test = new Pile<String>();

        String element = "barbe à papa";
        test.push(element);

        String element2 = "jujube";
        test.push(element2);

        String element3 = "gomme";
        test.push(element3);
    }

    @Test
    void push() {
        String element4 = "chocolat";
        test.push(element4);
        assertEquals(test.peek(), "chocolat");

    }

    @Test
    void pop() {
        String element5 = "chips";
        test.push(element5);
        test.pop();
        assertEquals(test.peek(), "gomme");
    }

    /*@Test   ne sert à rien
    void peek() {
    }*/

    @Test
    void clear() {
        test.clear();
        assertEquals(test.size(), 0);
    }

    @Test
    void size() {
        test.size();
        assertEquals(test.size(), 3);
    }

}