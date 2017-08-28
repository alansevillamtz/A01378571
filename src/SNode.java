
public class SNode<T> {
	public T value;
	public SNode next;
	
	public SNode() {
		value = null;
		next = null;
	}
	
	public SNode(T value) {
		this.value = value;
		next = null;
	}
	
}
