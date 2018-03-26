package collections;

import java.util.Scanner;

/**
 * Created by DioAn1730700 on 2018-03-12.
 */
public class ArrayList <T> implements List<T> {
    private T[] tabArray = (T[]) new Object[10];
    private T element;
    private int taille = 0;

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public T[] getTabArray() {
        return tabArray;
    }

    public void setTabArray(T[] tabArray) {
        this.tabArray = tabArray;
    }
    public T getElement() {
        return element;
    }

    public void setElement(int inedx, T element) {
        this.element = element;
    }

    public void add(int index, T element){
        if (taille == tabArray.length){

            T[] tabArray2 = (T[]) new Object[tabArray.length * 2];

            for (int i = 0; i < tabArray.length; i++) {
                tabArray[i] = tabArray2[i];
            }
        }

        for (int i = taille - 1; i >= index; i--) {
            tabArray[i+1] = tabArray[i];
        }
        tabArray[index] = element;
        taille++;
    }
    public void set(int index, T element){
        tabArray[index] = element;
    }
    public void add(T element){
        this.add(taille,element);
    }
    public T get(int index){return tabArray[index]; }

    public void remove(int index){
        for (int i = index; i < tabArray.length - 1 ; i++) {
            tabArray[i] = tabArray[i + 1];

        } taille--;
    }

    public int size(){
        return taille;

    }
    public int clear(){
        taille = 0;
        return taille;

    }
}
