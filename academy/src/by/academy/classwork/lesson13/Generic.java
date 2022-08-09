package by.academy.classwork.lesson13;

public class Generic<T, V, K> {
	private T tVariable;
	private V vVariable;
	private K kKVariable;

	public void printVVariable() {
		System.out.println(vVariable.getClass());
	}

	public Generic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Generic(T tVariable, V vVariable, K kKVariable) {
		super();
		this.tVariable = tVariable;
		this.vVariable = vVariable;
		this.kKVariable = kKVariable;
	}

	public T gettVariable() {
		return tVariable;
	}

	public void settVariable(T tVariable) {
		this.tVariable = tVariable;
	}

	public V getvVariable() {
		return vVariable;
	}

	public void setvVariable(V vVariable) {
		this.vVariable = vVariable;
	}

	public K getkKVariable() {
		return kKVariable;
	}

	public void setkKVariable(K kKVariable) {
		this.kKVariable = kKVariable;
	}
}