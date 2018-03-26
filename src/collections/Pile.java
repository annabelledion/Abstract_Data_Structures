package collections;

/**
 * Created by DioAn1730700 on 2018-03-12.
 */
public class Pile<T> {

    private LinkedList<T> liste  = new LinkedList();

    public void push(T element){
        liste.add(0,element);
    }
    public T pop(){
        T value = liste.get(0);
        liste.remove(0);
        return value;
    }
    public T peek(){
        return liste.get(0);
    }
    public int clear(){
        liste.clear();
        return liste.getTaille();
    }
    public int size(){
        return liste.size();
    }
}
