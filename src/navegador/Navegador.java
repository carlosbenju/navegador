package navegador;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Navegador {
    private String webActual;

    private Pila pilaEndavant = new Pila();
    private Pila pilaEnrere = new Pila();
    private ArrayList<String> historial = new ArrayList();
    private HashMap<String, Integer> webs = new HashMap<>();


    /**
     * Constructor de la clase navegador, recibe una web por defecto y la mete en la ArrayList del historial y en la pila de webs.
     * @param webActual String de la página web que queremos que cargue por defecto.
     */
    public Navegador(String webActual) {
        this.webActual = webActual;
        pilaEndavant.push(webActual);
        historial.add(webActual);

    }

    /**
     * Recibe una String de una página web y la introduce en la pila y en la ArrayList del historial.
     * @param novaURL String de la siguiente página web a la que queremos ir.
     */
    public void anarA(String novaURL) {
        pilaEndavant.push(novaURL);
        historial.add(novaURL);
    }

    /**
     * Retira el último elemento añadido a la pila y lo introduce en una nueva pila auxiliar.
     */
    public void enrere() {
        try {
            pilaEnrere.push(pilaEndavant.pop());
        } catch (PilaBuidaException ex) {
        }
    }

    /**
     * Devuelve una string con la última web que hay guardada en la pila.
     * @return Devuelve una string con la última web que hay guardada en la pila.
     */
    public String mostrarWeb() {
        try {
            return (String) pilaEndavant.peek();
        } catch (PilaBuidaException ex) {
        }
        return webActual;
    }


    /**
     * Retira el último elemento en la pila auxiliar, y lo introduce en la pila.
     */
    public void endavant() {
        try {
            pilaEndavant.push(pilaEnrere.pop());
        } catch (PilaBuidaException ex) {
        }
    }

    /**
     * Muetra todas las páginas webs visitadas guardadas en la ArrayList.
     */
    public void veureHistorial() {
        for (String c : historial) {
            System.out.println(c);
        }

    }

    /**
     * Muestra un historial con un contador de la cántidad de veces que has visitado una web.
     */
    public void veureVisitades() {
        for (String key : webs.keySet()) {
            System.out.println(key);
            }
        }

    }

