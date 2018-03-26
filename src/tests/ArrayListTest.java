package tests;

import collections.ArrayList;
import org.junit.jupiter.api.Assertions;

/**
 * Created by DioAn1730700 on 2018-03-19.
 */
class ArrayListTest {
    ArrayList<String> test;

    @org.junit.jupiter.api.BeforeEach
    void setUp(){
        test = new ArrayList<String>();

        String element = "pomme";
        test.add(element);

        String element2 = "orange";
        test.add(element2);

        String element3 = "banane";
        test.add(element3);
    }
   /* @org.junit.jupiter.api.tests   ne sert à rien
    void add() {
        String element = "pomme";
        test.add(element);
        assertEquals(test.get(0),"pomme");

        String element2 = "orange";
        test.add(element2);
        assertEquals(test.get(1), "orange");

        String element3 = "banane";
        test.add(element3);
        assertEquals(test.get(2),"banane");
    }*/
    @org.junit.jupiter.api.Test
    void set() {
        test.set(2, "melon d'eau");
        Assertions.assertEquals(test.get(2), "melon d'eau");

    }

    @org.junit.jupiter.api.Test
    void add1() {
        String element4 = "fraise";
        test.add(1,element4);
        Assertions.assertEquals(test.get(1),"fraise");
    }

    @org.junit.jupiter.api.Test
    void get() {
        test.get(2);
        Assertions.assertEquals(test.get(2), "banane");
    }

    @org.junit.jupiter.api.Test
    void remove() {
        test.remove(1);
        Assertions.assertEquals(test.get(1), "banane");
    }

    @org.junit.jupiter.api.Test
    void size() {
        test.size();
        Assertions.assertEquals(test.size(), 3);

    }

    @org.junit.jupiter.api.Test
    void clear() {
        test.clear();
        Assertions.assertEquals(test.getTaille(),0);
    }

}