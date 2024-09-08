package com.mycompany.cuenta.bancaria.poo;

public class CuentaBancaria {

    // TODO: Aquí va el código de la clase CuentaBancaria
    private String titular;
    private String numCuenta;
    private double saldo;
    private double tipoInteres;

    //constructor
    public CuentaBancaria(String titular, String numCuenta, double saldo, double tipoInteres) {
        this.titular = titular;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.tipoInteres = 1.5;
    }

    // getter and setter
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            // saldo = saldo + cantidad; 
            saldo += cantidad;

        }

    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        }
    }

    public double calcularInteres() {
        return saldo * (1 + tipoInteres / 100);
    }

    public void setTipoInteres(double tipoInteres) {
        if (tipoInteres >= 0 && tipoInteres <= 10) {
            this.tipoInteres = tipoInteres;
        }
        else 
            System.out.println("No se puede establecer un interés negativo ni superior al 10%");
    }

    public double getTipoInteres() {
        return tipoInteres;
    }
    
    
}
