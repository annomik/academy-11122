package by.academy.classwork.lesson12;

public class Box<T> {
    private T[] items;

    public Box() {
        super();
        this.items = (T[]) new Object[10];
    }

    public Box(T[] items) {
        this.items = items;
    }

    public  T[] getItems() {
        return items;
    }

    public void setItems( T[] items) {
        this.items = items;
    }
}