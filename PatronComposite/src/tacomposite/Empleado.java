/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tacomposite;

/**
 *
 * @author rn_dr
 */
public class Empleado implements ISueldo{
    private String nombreCompleto, cargo;
    private double sueldo;

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public double getSueldo() {
        return sueldo;
    }
    
    public Empleado(String nombreCompleto, String cargo, double sueldo){
        setNombreCompleto(nombreCompleto);
        setCargo(cargo);
        setSueldo(sueldo);
    }
}
