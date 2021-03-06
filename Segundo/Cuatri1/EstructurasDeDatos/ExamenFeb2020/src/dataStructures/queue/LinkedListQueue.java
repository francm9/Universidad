/**
 * @author Paco Gutiérrez, Data Structures, Grado en Informática. UMA.
 *
 * Queue implemented using java´s linked lists.
 */

package dataStructures.queue;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListQueue<T> implements Queue<T> {
    protected LinkedList<T> elements;

    /**
     * Creates an empty queue.
     * <p>
     * Time complexity: O(1)
     */
    public LinkedListQueue() {
        elements = new LinkedList<>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * Time complexity: O(1)
     */
    @Override
    public void enqueue(T elem) {
        elements.addLast(elem);
    }

    /**
     * {@inheritDoc}
     * <p>
     * Time complexity: O(1)
     */
    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    /**
     * {@inheritDoc}
     * <p>
     * Time complexity: O(1)
     *
     * @throws EmptyQueueException
     *             {@inheritDoc}
     */
    @Override
    public T first() {
        if (isEmpty()) {
            throw new EmptyQueueException("first on empty queue");
        }
        return elements.getFirst();
    }

    /**
     * {@inheritDoc}
     * <p>
     * Time complexity: O(1)
     *
     * @throws EmptyQueueException
     *             {@inheritDoc}
     */
    @Override
    public void dequeue() {
        if (isEmpty()) {
            throw new EmptyQueueException("dequeue on empty queue");
        }
        elements.removeFirst();
    }

    /**
     * Returns representation of queue as a String.
     */
    @Override
    public String toString() {
        String className = getClass().getSimpleName();
        String text = className + "(";
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            text += it.next() + (it.hasNext() ? "," : "");
        }
        return text + ")";
    }
}
