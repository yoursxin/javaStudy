package test.generic;

public class Pair<T> {
	private T first = null;
	private T second = null;
	public T getFirst() {
		return first;
	}
	public void setFirst(T first) {
		this.first = first;
	}
	public T getSecond() {
		return second;
	}
	public void setSecond(T second) {
		this.second = second;
	}
	public Pair(T first, T second) {		
		this.first = first;
		this.second = second;
	}
	
}
