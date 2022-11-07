package Modelo;

import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private int edad;
    private String identificacion;
    private String nacimiento;
    private String direccion;
    private ArrayList<CuentaCorriente> cuentaCorrientes;


    public Cliente(String nombre, int edad, String identificacion, String nacimiento, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
        this.nacimiento = nacimiento;
        this.direccion = direccion;
        cuentaCorrientes = new ArrayList<CuentaCorriente>();
    }

    public String getIdentificacion() {
        return identificacion;
    }


    public void agregarCuenta(CuentaCorriente cuentaCorriente) {
        cuentaCorrientes.add(cuentaCorriente);
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
        texto += "\tCantidad de cuentas: " + cuentaCorrientes.size() + "\n";
        for (int i = 0; i < cuentaCorrientes.size(); i++) {
            texto += "\t" + cuentaCorrientes.get(i).toString() + "\n";
        }
        return texto;
    }
}
