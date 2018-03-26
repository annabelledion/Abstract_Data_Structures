package collections;

import collections.List;
import collections.Node;

import java.util.Scanner;

/**
 * Created by DioAn1730700 on 2018-03-12.
 */
public class LinkedList <T> implements List<T> {

    private Node<T> head = null;
    private Node<T> tail = null;
    private int taille;

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
public void add(int index, T element){
    Node<T> nodeElement =  new Node<>();
    nodeElement.setValue(element);
    Node<T> current = head;
    if (taille == 0){
        tail = nodeElement;
    }
    if (index != taille && index != 0 ){
        Node<T> previous = null;
        for (int i = 0; i < index; i++){
            previous = current;
            current = current.getNext();
        }
        previous.setNext(nodeElement);
        nodeElement.setNext(current);
    }
    if (index == 0){
        nodeElement.setNext(head);
        head = nodeElement;

    }
    else if (index == taille ) {
        tail.setNext(nodeElement);
        tail = nodeElement;
    }
    taille++;
}
    @Override
    public void add(T element){
        Node<T> nodeElement =  new Node<>();
        nodeElement.setValue(element);
        if (taille == 0){
            head = nodeElement;
        }
        else{
            tail.setNext(nodeElement);
        }
        tail = nodeElement;
        taille++;
    }

    @Override
    public int clear() {
    taille = 0;
    head = null;
    tail = null;
    return taille;
    }
    @Override
    public void remove(int index) {
        Node<T> current = head;
        if (index == 0){
            head = head.getNext();
        }
        else if (index != 0){
            Node<T> previous = null;
            for (int i = 0; i < index; i++){
               previous = current;
               current = current.getNext();
            }
            previous.setNext(current.getNext());

            if (index == taille){

                tail = previous;
            }
        }
        taille--;
    }
    @Override
    public void set(int index, T element) {
    Node<T> nodeSet = new Node<>();
    nodeSet.setValue(element);
    Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        current.setValue(nodeSet.getValue());
        }
    @Override
    public int size() {
    return taille;
    }

    @Override
    public T get(int index) {
    Node<T> current = head;
    for (int i = 0; i < index; i++){
        current = current.getNext();
    }
    return current.getValue();
    }
}
