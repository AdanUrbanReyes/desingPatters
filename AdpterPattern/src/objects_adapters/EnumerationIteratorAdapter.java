package objects_adapters;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIteratorAdapter<E> implements Iterator<E>{

	private Enumeration<E> enumeration;
	
	public EnumerationIteratorAdapter(Enumeration<E> enumeration) {
		this.enumeration = enumeration;
	}
	
	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public E next() {
		return enumeration.nextElement();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
	
}
