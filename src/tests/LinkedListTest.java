package tests;

import collections.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by DioAn1730700 on 2018-03-22.
 */
class LinkedListTest {

    LinkedList<String> test;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        test = new LinkedList<String>();

        String element = "carotte";
        test.add(element);

        String element2 = "brocoli";
        test.add(element2);

        String element3 = "patate";
        test.add(element3);
    }

   /* @Test
    void add() {
        String element5 = "test";
        test.add(element5);
        assertEquals(test.get(3), "test");
    }*/

    @Test
    void add1() {
        String element4 = "navet";
        test.add(2,"navet");
        assertEquals(test.get(2), "navet");
    }

    @Test
    void clear() {
        test.clear();
        assertEquals(test.getTaille(),0);
    }

    @Test
    void remove() {
        test.remove(1);
        assertEquals(test.get(1), "patate");
    }

    @Test
    void set() {
        test.set(2, "courge");
        assertEquals(test.get(2), "courge");
    }

    @Test
    void size() {
        test.size();
        Assertions.assertEquals(test.size(), 3);
    }

    @Test
    void get() {
        test.get(2);
        assertEquals(test.get(2), "patate");
    }

}