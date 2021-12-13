package ru.mirea.task13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MyArrayList<T> {
    private static final int DefaultSize = 4;
    private static final Object[] EmptyData = {};
    private Object[] data;
    private int size = 0;

    public MyArrayList() {
        this.data = EmptyData;
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.data = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.data = EmptyData;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
    }

    public MyArrayList(Collection<? extends T> collection) {
        Object[] a = collection.toArray();
        if ((size = a.length) != 0) {
            if (collection.getClass() == ArrayList.class) {
                this.data = a;
            } else {
                this.data = Arrays.copyOf(a, size, Object[].class);
            }
        } else {
            this.data = EmptyData;
        }
    }

    public T get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index Out Of Bounds: " + index);
        }
        return (T) data[index];
    }

    public void add(T item) {
        ensureCapacity();
        data[size++] = item;
    }

    public T set(int index, T item) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index Out Of Bounds: " + index);
        }
        T oldValue = (T) data[index];
        data[index] = item;
        return oldValue;
    }

    public T remove(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index Out Of Bounds: " + index);
        }
        T oldValue = (T) data[index];
        data[index] = null;
        if (index == size - 1) {
            size--;
        } else {
            for (int i = index; i < size; --i) {
                data[i] = data[i + 1];
            }
        }
        return oldValue;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return data.length;
    }

    public Object[] toArray() {
        return Arrays.copyOf(data, size);
    }

    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            return (T[]) Arrays.copyOf(data, size, a.getClass());
        }
        System.arraycopy(data, 0, a, 0, size);
        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }

    private void ensureCapacity() {
        if (size >= data.length) {
            Object[] newData = new Object[Math.max(1, data.length) * 2];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            this.data = newData;
        }
    }
}
