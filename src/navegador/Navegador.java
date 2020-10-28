package navegador;

public class Navegador {
    private String webActual;

    private Pila pilaEndavant = new Pila();
    private Pila pilaEnrere = new Pila();

    public Navegador(String webActual) {
        this.webActual = webActual;
        pilaEndavant.push(webActual);
    }

    public Pila getPilaEndavant() {
        return pilaEndavant;
    }


    public void anarA(String novaURL) {
        pilaEndavant.push(novaURL);
        webActual = novaURL;
    }

    public void enrere() {
        try {
            pilaEnrere.push(pilaEndavant.pop());
        } catch (PilaBuidaException ex) {
            System.out.println(ex);
        }
    }

    public void endavant() {
        try {
            pilaEndavant.push(pilaEnrere.pop());
        } catch (PilaBuidaException ex) {
            System.out.println(ex);
        }
    }

    public void veureHistorial() {
        for (Object c : getPilaEndavant()) {
            System.out.println(c);
        }

    }

    public void veureVisitades() {

    }

}
