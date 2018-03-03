/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerbanco;

/**
 *
 * @author User
 */
public class cuentaCorriente {

    private Cliente titular;
    private int nroCuenta;
    private double saldo;

    public cuentaCorriente(Cliente c1, int cuenta, double saldo) {
        this.titular = c1;
        this.saldo = saldo;
        this.nroCuenta = cuenta;

    }

    public cuentaCorriente(Cliente nuevoCliente, int cuenta) {
        this.titular = nuevoCliente;
        this.nroCuenta = cuenta;

    }

    public double depositar(double deposito) {
        saldo += deposito;
        return saldo;
    }

    public double extraer(double extraccion) {
        if (extraccion > saldo) {
            System.out.println("La extracción que quiere realizar es mayor al monto. Su saldo ha quedado en 0");
            return saldo;

        }
        return saldo - extraccion;

    }

    public void mostrarDatos() {
        System.out.println("Titular :" + titular.getApellido() + " , " + titular.getNombre());
        System.out.println("Edad : " + titular.getEdad());

    }

    public boolean compararCuentas(cuentaCorriente cun1) {
        if (this.nroCuenta == cun1.nroCuenta) {
            return false;
        }
        return true;

    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
