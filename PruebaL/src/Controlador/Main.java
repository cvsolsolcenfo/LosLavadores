package Controlador;
import Vista.*;
import Modelo.*;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Banco banco = new Banco("Banco Los lavadores");
        String nombre;
        String identificacion;
        String fechaNac;
        int edad;
        String direccion;
        int cuentaNumero;
        double saldo;
        boolean ok;
        double importe;
        double debito;
        int opcion;

        do {
            opcion = menu.opciones();
            switch(opcion) {
                case 1:
                    menu.mostrarTexto("Registrar cliente:");
                    nombre = menu.solicitaTexto("Ingrese nombre: ");
                    identificacion = menu.solicitaTexto("Ingrese identificación: ");
                    fechaNac = menu.solicitaTexto("Ingrese fecha de nacimiento: ");
                    edad = menu.solicitaNumeroEntero("Ingrese edad: ");
                    direccion = menu.solicitaTexto("Ingrese dirección de la casa: ");
                    Cliente cliente = new Cliente(nombre,edad,identificacion,fechaNac,direccion);
                    ok = banco.addCliente(cliente);
                    if (ok == true) {
                        menu.mostrarTexto("Cliente ingresado");
                    } else {
                        menu.mostrarTexto("El cliente ya existe!");
                    }
                    break;
                case 2:
                    menu.mostrarTexto("Listado Clientes:");
                    menu.listarClientes(banco.getListaCliente());
                    break;
                case 3:
                    menu.mostrarTexto("Crear cuenta:");
                    identificacion = menu.solicitaTexto("Ingrese identificación del cliente: ");
                    if (banco.existeCliente(identificacion)) {
                        cuentaNumero = menu.solicitaNumeroEntero("Ingrese el numero de cuenta: ");
                        saldo = menu.solicitaNumeroDouble("Ingrese el saldo inicial (debe ser mayor o igual a 50000): ");
                        if (saldo <= 50000) {
                            menu.mostrarTexto("El saldo inicial no puede ser menor a 50000 colones");
                        } else {
                            Cuenta cuenta = new Cuenta(cuentaNumero, saldo);
                            ok = banco.addCuenta(cuenta, identificacion);
                            cuenta.addCuenta(saldo);
                            if (ok == true) {
                                menu.mostrarTexto("Nueva cuenta cliente creada");
                            } else {
                                menu.mostrarTexto("Esta cuenta cliente ya existe!");
                            }
                        }
                    } else {
                        menu.mostrarTexto("El cliente no existe en el banco, debe registrar cliente primero (opc.1)");
                    }

                    break;
                case 4:
                    menu.mostrarTexto("Realizar depósito: ");
                    cuentaNumero = menu.solicitaNumeroEntero("Ingrese número de cuenta: ");
                    importe = menu.solicitaNumeroDouble("Ingrese el monto a depositar: ");
                    if(banco.realizaDeposito(cuentaNumero, importe) == true) {
                        menu.mostrarTexto("Deposito de fondos realizado con éxito");
                    } else {
                        menu.mostrarTexto("Error, deposito de fondos no realizado");
                    }
                    break;
                case 5:
                    menu.mostrarTexto("Realizar retiro: ");
                    cuentaNumero = menu.solicitaNumeroEntero("Ingrese número de cuenta: ");
                    debito = menu.solicitaNumeroDouble("Ingrese el monto a retirar: ");
                    if(banco.realizaRetiro(cuentaNumero, debito) == true) {
                        menu.mostrarTexto("Retiro de fondos realizado con éxito");
                    } else {
                        menu.mostrarTexto("Error, retiro  de fondos no realizado");
                    }
                    break;
                case 6:
                    menu.mostrarTexto("Mostrar saldo de cuenta: ");
                    cuentaNumero = menu.solicitaNumeroEntero("Ingrese número de cuenta: ");
                    saldo = banco.mostrarSaldo(cuentaNumero);
                    if(saldo <= 0) {
                        menu.mostrarTexto("Error, cuenta sin fondos");
                    } else {
                        menu.mostrarTexto("Saldo de la cuenta: " + saldo);
                    }
                    break;
                case 7:
                    menu.mostrarTexto("Gracias por ser parte del Banco Los Lavadores!!");
                    break;
            }
        } while(opcion != 7);

    }

}