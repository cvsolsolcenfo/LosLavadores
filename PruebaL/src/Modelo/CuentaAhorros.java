package Modelo;

public class CuentaAhorros extends Cuenta {

    /*
    Se quiere que la clase CuentaAhorro
    maneje una tasa de interés, pero que la tasa de interés
    sea la misma para todas las instancias de la clase. Un detalle importante de diseño es que
    VARIABLES DE CLASE (STATIC)
    Las variables de clase son atributos diferentes de las variables de instancia. Las variables de clase implican una sola zona de memoria reservada para todas las instancias de la clase, y no una copia por objeto, como sucede con las variables de instancia.
     */
    // si es static no se si lleva contructor?
    // TODO MAYUSCULA POR SER CONSTANTE

    private static final double INTERES = 0.07;

    public CuentaAhorros(String cuentaNumero, double saldo) {
        super(cuentaNumero, saldo);
    }

    @Override
    public boolean retiro(double debito) {
        return false;
    }


}


