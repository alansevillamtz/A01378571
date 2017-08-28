
public class IntegerLinkedList {
	public IntegerNode top = null;
	
	public IntegerLinkedList() {
		top = new IntegerNode();
	}
	
	public void addFirst(int element) {
		IntegerNode newNode = new IntegerNode(element);
		newNode.next = top.next;
		top.next = newNode;
	}
	
	public void addLast(int element) {
		IntegerNode newNode = new IntegerNode(element);
		
		IntegerNode current = top;
		while(current.next != null) {
			current = current.next;
		}
		
		current.next = newNode;
	}
	
	public String toString() {
		if(top.next == null)
			return "[]";
		
		IntegerNode current = top.next;
		String returnValue = "[" + current.value;
		
		while(current.next != null) {
			current = current.next;
			returnValue += ", " + current.value;
		}
		
		returnValue += "]";
		return returnValue;
	}
}
