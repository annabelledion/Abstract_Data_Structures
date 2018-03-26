package collections;

/**
 * Created by DioAn1730700 on 2018-03-12.
 */
public interface List <T>{

    public void add(int index, T element);

    public void add(T element);

    public void set(int index, T element);

    public void remove(int index);

    public int size();

    public int clear();

    public T get(int index);

    }
