package navegador;

import java.awt.print.PrinterIOException;
import java.util.Scanner;

public class Prova {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String web1 = "https://www.google.com/";

        Navegador navegador = new Navegador(web1);
        Prova program = new Prova();
        program.menu(navegador);

    }


    public void menu(Navegador navegador) {
        int opcio = 0;
        boolean programOn = true;
            do {
                    System.out.println("NAVEGADOR\nWeb Actual: " + navegador.mostrarWeb() + "\n1. Anar a: \n2. Anar enrere: \n3. Anar endavant\n4. Mostrar historial\n5. Sortir");
                opcio = scanner.nextInt();
                switch (opcio) {
                    case 1:
                        System.out.println("Introdueix la web a la que vols anar: ");
                        String web = scanner.next();
                        navegador.anarA(web);
                        break;
                    case 2:
                        navegador.enrere();
                        break;
                    case 3:
                        navegador.endavant();
                        break;
                    case 4:
                        navegador.veureHistorial();
                        break;
                    case 5:
                        System.out.println("Tancant el navegador...");
                        programOn = false;
                        break;
                    default:
                        System.out.println("No es una opció válida, torna a provar: ");
                        opcio = scanner.nextInt();
                        break;
                }
            } while (programOn);
    }
}
