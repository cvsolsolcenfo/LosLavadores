package Modelo;

public class CuentaAhorroProgramado extends Cuenta {


    public CuentaAhorroProgramado(String cuentaNumero, double saldo) {
        super(cuentaNumero, saldo);
    }

    @Override
    public boolean retiro(double debito) {
        return false;
    }
}
