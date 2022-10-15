package Modelo;

import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private int edad;
    private String identificacion;
    private String nacimiento;
    private String direccion;
    private ArrayList<Cuenta> cuentas;


    public Cliente(String nombre, int edad, String identificacion, String nacimiento, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
        this.nacimiento = nacimiento;
        this.direccion = direccion;
        cuentas = new ArrayList<Cuenta>();
    }

    public String getIdentificacion() {
        return identificacion;
    }


    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    @Override
    public String toString() {
        String texto ="Cliente{" +
                " nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", identificacion='" + identificacion + '\'' +
                ", nacimiento='" + nacimiento + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
        texto += "\tCantidad de cuentas: " + cuentas.size() + "\n";
        for (int i = 0; i < cuentas.size(); i++) {
            texto += "\t" + cuentas.get(i).toString() + "\n";
        }
        return texto;
    }
}
