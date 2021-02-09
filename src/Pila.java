import java.util.ArrayDeque;
import java.util.Iterator;
/**
 * Clase pila con los metodos para utilizar las diferentes opciones de la pila.
 * @author Carlos Benjumea
 * @version 1.0
 *
 */
public class Pila<E> implements Iterable<E> {

    private ArrayDeque<E> pila = new ArrayDeque<>();

    /**
     * Comprueba si la pila está vacia o no.
     * @return devuelve True si la pila está vacia y false en case contrario.
     */
    public boolean empty() {
        return pila.isEmpty();
    }

    /**
     * En caso de que la pila esté vacia lanza una excepción, si no lo está recoge el último elemento.
     * @return Devuelve el último elemento que hay en la pila.
     * @throws PilaBuidaException Lanza esta excepción en caso de que la pila esté vacía.
     */
    public E peek() throws PilaBuidaException {
        if (pila.isEmpty()) {
            throw new PilaBuidaException();
        } else {
            return pila.peekLast();
        }
    }

    /**
     * En caso de que la pila esté vacia lanza una excepción, si no lo está elimina el último elemento.
     * @return Devuelve el último elemento que hay en la pila antes de borrarlo.
     * @throws PilaBuidaException Lanza esta excepción en caso de que la pila esté vacía.
     */
    public E pop() throws PilaBuidaException {
        if (pila.isEmpty()) {
            throw new PilaBuidaException();
        } else {
            return pila.removeLast();
        }
    }

    /**
     * Añade un elemento a la pila.
     * @param e Cualquier elemento que querámos introducir en la pila.
     */
    public void push(E e) {
        pila.addLast(e);
    }

    /**
     * Elimina todos los elementos de la pila.
     */
    public void removeAllElements() {
        pila.clear();
    }

    @Override
    public String toString() {
        return "Pila{" +
                "pila=" + pila +
                '}';
    }

    @Override
    public Iterator iterator() {
        return pila.iterator();
    }
}
