package by.academy.homework4;

import java.util.Iterator;

public class MainIterator <T> implements Iterator<T> {

		private T[]array;
	    private int index;
	    
	    public MainIterator() {
	        super();
	    }
	    
	    public MainIterator(T[] array) {
	        this.array = array;
	    }

	    @Override
	    public boolean hasNext() {
	        if (array == null || array.length <= index) {
	            return false;
	        }
	        return array[index] != null;
	    }

	    @Override
	    public T next() {
	        return array[index++];
	    }

}
