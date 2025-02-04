package list;

import java.util.Arrays;

public class ArrayList<E> implements List<E> {
    static int DefaultSize = 10;
    E[] data;
    int listSize;

    public ArrayList() {
        this(DefaultSize);
    }

    public ArrayList(int size) {
        listSize = 0;
        data = (E[]) new Object[size];
    }

    @Override
    public void clear() {
        listSize = 0;
    }

    @Override
    public void insert(int pos, E item) {
        for (int i = listSize; i > pos; i--) {
            data[i] = data[i - 1];
        }
        data[pos] = item;
        listSize++;
    }

    @Override
    public void append(E item) {
        // data[listSize] = item;
        // listSize += 1;
        data[listSize++] = item;
    }

    @Override
    public void update(int pos, E item) {
        data[pos] = item;
    }

    @Override
    public E getValue(int pos) {
        return data[pos];
    }

    @Override
    public E remove(int pos) {
        E ret = data[pos];
        listSize--;

        for (int i = pos; i < listSize; i++) {
            data[i] = data[i + 1];
        }
        data[listSize] = null;

        return ret;
    }

    @Override
    public int length() {
        return listSize;
    }
}
