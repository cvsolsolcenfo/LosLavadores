package Modelo;

public class Cuenta {

    private int cuentaNumero;
    private double saldo;

    public Cuenta(int cuentaNumero, double saldo) {
        this.cuentaNumero = cuentaNumero;
        this.saldo = saldo;

    }

    public int getCuentaNumero() {
        return cuentaNumero;
    }

    public boolean deposito (double importe) {
        if (importe <= 0) {
            return false;
        } else {
            saldo += importe;
            return true;
        }

    }
    public boolean retiro (double debito) {
        if (debito <= 0) {
            return false;
        }
        if (debito > saldo) {
            return false;
        } else {
            saldo = saldo - debito;
            return true;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "cuentaNumero=" + cuentaNumero +
                ", saldo=" + saldo +
                '}';
    }

    public double addCuenta(double saldo) {
        return saldo;
    }

}

