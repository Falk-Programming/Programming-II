package programming;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class CustomDeque {
    private Deque<Integer> deque;

    public CustomDeque() {
        this.deque = new LinkedList<>();
    }

    public void enqueueFront(int data) {
        deque.addFirst(data);
    }

    public void enqueueRear(int data) {
        deque.addLast(data);
    }

    public int dequeueFront() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        return deque.removeFirst();
    }

    public int dequeueRear() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        return deque.removeLast();
    }
    
    //Added delete and insertion methods.
    public void insertion(int value, int position) {
    	if (isEmpty()) {
    		throw new NoSuchElementException("Deque is empty.");
    	}
    	int i = 0;
    	//Moves all of the numbers out of the way to reach current position to insert
    	while(i < position) {
    		i++;
    		int current = deque.peekFirst();
    		deque.addLast(current);
    		deque.removeFirst();
    	}
    	deque.addFirst(value);
    	int j = 0;
    	while(j < position) {
    		j++;
    		int current = deque.peekLast();
    		deque.addFirst(current);
    		deque.removeLast();
    	}
    	
    	
    }
    public void delete(int position) {
    	int i = 0;
    	//Moves all of the numbers out of the way to reach current position to delete
    	while(i < position ) {
    		i++;
    		int current = deque.peekFirst();
    		deque.addLast(current);
    		deque.removeFirst();
    	}
    	//Deletes chosen position
    	deque.removeFirst();
    	
    	int j = 0;
    	while(j < position) {
    		j++;
    		int current = deque.peekLast();
    		deque.addFirst(current);
    		deque.removeLast();
    	}
    }
    

    public Iterator<Integer> iterator() {
        return new DequeIterator();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    private class DequeIterator implements Iterator<Integer> {
        private Iterator<Integer> iterator = deque.iterator();

        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return iterator.next();
        }
    }

    public static void main(String[] args) {
        CustomDeque customDeque = new CustomDeque();
      
        
        // Enqueue elements
        customDeque.enqueueFront(1);
        customDeque.enqueueRear(2);
        customDeque.enqueueFront(3);
        customDeque.enqueueFront(12);
        customDeque.enqueueRear(74);
        customDeque.enqueueRear(8);
        customDeque.enqueueRear(0);
        customDeque.enqueueFront(7);
        customDeque.enqueueFront(9);
        customDeque.enqueueRear(82);
        
        // Iterate and display elements
        Iterator<Integer> iterator = customDeque.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}