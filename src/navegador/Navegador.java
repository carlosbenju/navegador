package navegador;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Navegador {
    private String webActual;

    private Pila pilaEndavant = new Pila();
    private Pila pilaEnrere = new Pila();
    private ArrayList<String> historial = new ArrayList();

    public Navegador(String webActual) {
        this.webActual = webActual;
        pilaEndavant.push(webActual);
    }

    public Pila getPilaEndavant() {
        return pilaEndavant;
    }


    public void anarA(String novaURL) {
        pilaEndavant.push(novaURL);
        historial.add(novaURL);
    }

    public void enrere() {
        try {
            pilaEnrere.push(pilaEndavant.pop());
        } catch (PilaBuidaException ex) {
        }
    }

    public String mostrarWeb() {
        try {
            return (String) pilaEndavant.peek();
        } catch (PilaBuidaException ex) {
        }
        return webActual;
    }

    public void endavant() {
        try {
            pilaEndavant.push(pilaEnrere.pop());
        } catch (PilaBuidaException ex) {
        }
    }

    public void veureHistorial() {
        for (String c : historial) {
            System.out.println(c);
        }

    }

    public void veureVisitades() {

    }

}
