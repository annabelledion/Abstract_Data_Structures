package collections;

/**
 * Created by DioAn1730700 on 2018-03-12.
 */
public class File<T> {

    private int taille;
    private LinkedList<T> liste = new LinkedList<T>();

    public void add(T element){
        liste.add(element);
    }
    public T remove(){
        T value = liste.get(0);
        liste.remove(0);
        return value;
    }
    public T peek(){
        return liste.get(0);
    }
    public int clear(){
        liste.clear();
        return taille;
    }
    public int size(){
        return liste.size();
    }
}
