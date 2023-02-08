package dyn;

public class DynArray<T> {
    private Object[] array;
    private int maxSize;
    private int currentSize;

    public DynArray() {
        this.maxSize = 2;
        this.currentSize = 0;
        this.array = new Object[this.maxSize];
    }

    public void add(T hello) {
        if (this.currentSize == (this.maxSize - 1)) {
            Object[] temp = new Object[this.maxSize];
            System.arraycopy(this.array, 0, temp, 0, this.currentSize);

            this.maxSize *= 2;
            this.array = new Object[this.maxSize];
            System.arraycopy(temp, 0, this.array, 0, this.currentSize);
        }

        this.array[this.currentSize] = hello;
        this.currentSize++;
    }

    public void remove(int i) {
        this.array[i] = null;
        this.currentSize--;
    }

    @SuppressWarnings("unchecked")
    public T get(int i) {
        if (i < this.maxSize) {
            return (T) this.array[i];
        } else {
            return null;
        }
    }
}
