package Modelo;

import java.util.ArrayList;

public class Banco {

    private String bancoNombre;
    private ArrayList<Cuenta> listaCuentasCliente;
    private ArrayList<Cliente> listaCliente;

    public Banco(String bancoNombre) {
        this.bancoNombre = bancoNombre;
        listaCuentasCliente = new ArrayList<Cuenta>();
        listaCliente = new ArrayList<Cliente>();

    }

    public boolean addCliente(Cliente cliente) {
        for (int i = 0; i < listaCliente.size(); i++) {
            if (cliente.getIdentificacion().equals(listaCliente.get(i).getIdentificacion())) {
                return false;
            }
        }
        listaCliente.add(cliente);
        return true;
    }

    public boolean addCuenta(Cuenta cuenta, String identificacion) {
        for (int i = 0; i < listaCuentasCliente.size(); i++) {
            if (cuenta.getCuentaNumero() == (listaCuentasCliente.get(i).getCuentaNumero())){
                return false;
            }
        }
        listaCuentasCliente.add(cuenta);
        for (int i = 0; i < listaCliente.size(); i++) {
            if (listaCliente.get(i).getIdentificacion().equalsIgnoreCase(identificacion)){
                listaCliente.get(i).agregarCuenta(cuenta);
            }
        }
        return true;
    }

    public boolean existeCliente(String id) {
        for (int i = 0; i < listaCliente.size(); i++) {
            if (listaCliente.get(i).getIdentificacion().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public boolean realizaDeposito(int numeroCuenta, double importe) {
        for (int i = 0; i < listaCuentasCliente.size(); i++) {
            if(listaCuentasCliente.get(i).getCuentaNumero() == numeroCuenta) {
                if(listaCuentasCliente.get(i).deposito(importe)) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean realizaRetiro(int numeroCuenta, double debito) {
        for (int i = 0; i < listaCuentasCliente.size(); i++) {
            if(listaCuentasCliente.get(i).getCuentaNumero() == numeroCuenta) {
                if(listaCuentasCliente.get(i).retiro(debito)) {
                    return true;
                }
            }
        }
        return false;
    }

    public double mostrarSaldo(int numeroCuenta) {
        double saldo = -1;
        for (int i = 0; i < listaCuentasCliente.size(); i++) {
            if(listaCuentasCliente.get(i).getCuentaNumero() == numeroCuenta) {
                saldo = listaCuentasCliente.get(i).getSaldo();
            }
        }
        return saldo;
    }
}