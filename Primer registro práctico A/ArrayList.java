import java.util.NoSuchElementException;
public class ArrayList<E> implements List<E> {
	public Object[] top;
	private int size;
	private int initialCapacity = 5;
	private int extraCapacity = 5;
	
	/**
	 * Creates a new ArrayList instance with the default initial capacity.
	 */
	public ArrayList() {
		top = new Object[initialCapacity];
		size = 0;
	}
	
	/**
	 * Increases the capacity of this ArrayList instance so that it 
	 * can hold at least extraCapacity elements more.
	 * This method allocates a new array with greater capacity than the
	 * current one (top.length + extraCapacity) and copies all elements
	 * from top to the newly allocated array. The reference top is then
	 * updated to point to the new array. 
	 * @param extraCapacity increase the capacity of this ArrayList by this amount
	 */
	private void reserveExtraCapacity(int extraCapacity) {
            Object [] = new Object [];
            top = new Object[top.length+extraCapacity];
            
            size=initialCapacity;
	}
	
	/**
	 * Increases the capacity of this list if its size equals the length of the array
	 * where the data is stored. This method calls reserveExtraCapacity when (size() >= top.length).
	 * reserveExtraCapacity is called using the instance variable extraCapacity.
	 */
	private void ensureCapacity() {
            if (size() >= top.length ){
                
            }
            else{
                reserveExtraCapacity(extraCapacity);
            }
	}
	
	/**
	 * Shifts elements in the array (top) to the right, starting at the given position.
	 * @param index the position in which the shift will begin
	 * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index > size())
	 */
	private void shiftContentsRight(int index) {
            
            if(index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
            if (Object[index].next == null){
                throw new NoSuchElementException();
            
            }
            else{
                for (int x=index; x<=top.length; x++){

                }
            }    
            
            
            
            
            
            
            
            
            
	}
	
	@Override
	public void addFirst(E e) {
            	Object[] newRaton = new Object[](e);
                
		newRaton.next = top.next;
		top.next = newRaton;
		size++;
	}

	@Override
	public void addLast(E e) {
            Object[] newRaton = new Object[](e);
            Object[] cu = top;
            while(cu.next != null)
                cu=cu.next;
            
            cu.next=newRaton;
            size++;
            
	}

	@Override
	public void add(int index, E element) {
            if(index < 0 || index > size()) {
			throw new IndexOutOfBoundsException();
		}
		
		Object [] newRaton = new Object[](element);
		
		Object [] current = top;
		for(int i = 0; i < index; i++)
			current = current.next;
		
		newRaton.next = current.next;
		current.next = newRaton;
		size++;
	}
	

	@Override
	public E getFirst() {
		if(top.next == null) {
			throw new NoSuchElementException();
		}
		
		return top.next.value;
	}

	
	@Override
	public E getLast() {
		if(top.next == null) {
			throw new NoSuchElementException();
		}
		
		Object [E] current = top.next;
		while(current.next != null)
			current = current.next;
		
		return current.value;
	}

	
	@Override
	public E get(int index) {
		if(index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		
		Object[E] current = top.next;
		for(int i = 0; i < index; i++)
			current = current.next;
		
		return current.value;
	}

	@Override
	public E set(int index, E element) {
		if(index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		
		Object[E] current = top.next;
		for(int i = 0; i < index; i++)
			current = current.next;
		
		E previousValue = current.value;
		current.value = element;
		
		return previousValue;
	}

	@Override
	public void clear() {
            top.next = null;
		size = 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public String toString() {
		if(top.next == null)
			return "[]";
                Object[] current = top.next;
                String returnValue = "[" + current.value;
		while(current.next != null) {
			current = current.next;
			returnValue += ", " + current.value;
		}
		
		returnValue += "]";
		return returnValue;
	}
	}
}
