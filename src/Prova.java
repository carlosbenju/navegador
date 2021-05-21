import java.util.Scanner;

/**
 * Clase que utilitza las funcionalitats del navegador.
 * @author Carlos Benjumea
 * @version 1.0
 */
public class Prova {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String web1 = "https://www.google.com/";

        Navegador navegador = new Navegador(web1);
        Prova program = new Prova();
        program.menu(navegador);

    }

    /**
     * Muestra un menú con las opciones del navegador.
     * @param navegador Recibe un objeto de la clase navegador para utilizar sus métodos.
     */
    public void menu(Navegador navegador) {
        int opcio;
        boolean programOn = true;
            do {
                    System.out.println("NAVEGADOR\nWeb Actual: " + navegador.mostrarWeb() + "\n1. Ir a: \n2. Web anterior: \n3. Web siguiente:\n4. Mostrar historial:\n5. Salir");
                opcio = scanner.nextInt();
                switch (opcio) {
                    case 1:
                        System.out.println("Introduce la URL de la web a la que quieres ir: ");
                        String web = scanner.next();
                        String regex = "[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
                        if (web.matches(regex)) {
                            navegador.anarA(web);
                        } else {
                            System.out.println("No es una URL válida.");
                        }
                        break;
                    case 2:
                        navegador.enrere();
                        break;
                    case 3:
                        navegador.endavant();
                        break;
                    case 4:
                        System.out.println("---HISTORIAL---");
                        navegador.veureHistorial();
                        break;
                    case 5:
                        System.out.println("Cerrando el navegador...");
                        programOn = false;
                        break;
                    default:
                        System.out.println("No es una opción válida, vuelve a probar: ");
                        opcio = scanner.nextInt();
                        break;
                }
            } while (programOn);
    }
}
