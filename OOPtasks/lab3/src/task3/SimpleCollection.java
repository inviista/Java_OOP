package task3;

import java.util.ArrayList;

public class SimpleCollection<E> implements MyCollection<E> {
    private ArrayList<E> elements;

    public SimpleCollection() {
        this.elements = new ArrayList<>();
    }

    @Override
    public boolean add(E e) {
        return elements.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return elements.remove(o);
    }

    @Override
    public boolean contains(Object o) {
        return elements.contains(o);
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public void clear() {
        elements.clear();
    }
}