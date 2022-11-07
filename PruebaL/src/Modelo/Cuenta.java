package Modelo;

public abstract class Cuenta {

    protected String cuentaNumero;
    protected double saldo;

    public Cuenta(String cuentaNumero, double saldo) {
        this.cuentaNumero = cuentaNumero;
        this.saldo = saldo;

    }
    public String getCuentaNumero() {
        return cuentaNumero;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract boolean retiro (double debito);

}
