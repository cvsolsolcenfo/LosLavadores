package Vista;
import java.util.Scanner;
import Modelo.Cliente;
import java.util.ArrayList;


public class Menu {
    Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }
    public void mostrar(){
        System.out.println("\nMenú. Por favor seleccione una opción: ");
        System.out.println("1.Registrar clientes");
        System.out.println("2.Listar clientes");
        System.out.println("3.Crear cuenta");
        System.out.println("4.Realizar depósito");
        System.out.println("5.Realizar retiro");
        System.out.println("6.Mostrar saldo de cuenta");
        System.out.println("7.Salir");
        System.out.println("Opción: ");

    }

    public void mostrarOpcionesCuentas(){
        System.out.println("Cual tipo de cuenta desea crear?");
        System.out.println("\nOpciones");
        System.out.println("1. Cuenta Corriente");
        System.out.println("2. Cuenta de ahorros");
        System.out.println("3. Cuenta de ahorro programado");

    }
    public int opcionesCuentas(){
        int opcionElegir = 0;
        while (opcionElegir < 1 || opcionElegir > 3){
            mostrarOpcionesCuentas();
            opcionElegir = Integer.valueOf(scanner.nextLine());
        }
        return opcionElegir;
    }

    public int opciones(){
        int opcionElegir = 0;
        while (opcionElegir < 1 || opcionElegir > 7){
            mostrar();
            opcionElegir = Integer.valueOf(scanner.nextLine());
        }
        return opcionElegir;
    }

    public String solicitaTexto(String info) {
        System.out.println(info);
        String texto = scanner.nextLine();
        return texto;
    }

    public int solicitaNumeroEntero(String info) {
        System.out.println(info);
        int entero = Integer.valueOf(scanner.nextLine());
        return entero;
    }

    public void mostrarTexto(String texto) {

        System.out.println(texto);
    }



    public double solicitaNumeroDouble(String info) {
        System.out.println(info);
        double numero = Integer.valueOf(scanner.nextLine());
        return numero;
    }

    public void listarClientes(ArrayList<Cliente> listado) {
        for (int i = 0; i < listado.size(); i++) {
            System.out.println(listado.get(i));
        }
    }
}