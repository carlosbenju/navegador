package navegador;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Pila<E> implements Iterable<E> {

    private ArrayDeque<E> pila;

    public boolean empty() {
        return pila.isEmpty();
    }

    public E peek() throws PilaBuidaException {
        if (pila.isEmpty()) {
            throw new PilaBuidaException();
        } else {
            return pila.peekLast();
        }
    }

    public E pop() throws PilaBuidaException {
        if (pila.isEmpty()) {
            throw new PilaBuidaException();
        } else {
            return pila.removeLast();
        }
    }

    public void push(E e) {
        pila.addLast(e);
    }

    public void removeAllElements() {
        pila.remove();
    }

    @Override
    public Iterator iterator() {
        return pila.iterator();
    }
}
