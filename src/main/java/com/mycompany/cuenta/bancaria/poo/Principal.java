package com.mycompany.cuenta.bancaria.poo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // Crear una nueva instancia de CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria("Yakelin", "1234", 1220, 1.5);
        Scanner sc = new Scanner(System.in);

        // Mostrar el titular, el número de cuenta y el saldo inicial
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Numero de cuenta: " + cuenta.getNumCuenta());
        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        // Ingresar una cantidad a la cuenta
        System.out.println("ingresar la cantidad deseada ");
        double ingresar = sc.nextDouble();
        cuenta.ingresar(ingresar);
        System.out.println("Saldo despues de ingresar: " + ingresar + " Es " + cuenta.getSaldo());

        // Intentar retirar una cantidad de la cuenta
        System.out.println("ingresar la cantidad que quieres retirar");
        double retirar = sc.nextDouble();
        cuenta.retirar(retirar);
        System.out.println("Saldo despues de retirar: " + retirar + " Es " + cuenta.getSaldo());

        // Intentar retirar una cantidad mayor al saldo actual (debe fallar)
        System.out.println("ingresar la cantidad que quieres retirar excediendo el saldo");
        double retirarDos = sc.nextDouble();
        cuenta.retirar(retirarDos);
        System.out.println("Intento de retirar: " + retirarDos + "(no deberia cambiar el saldo): " + cuenta.getSaldo());

        // Calcular el interés actual
        System.out.println("Saldo con interes aplicado: " + cuenta.calcularInteres());

        // Cambiar el tipo de interés
        System.out.println("Ingresar el tipo de interés:");
        double interes = sc.nextDouble();
        if (interes >= 0 && interes <= 10) {
            cuenta.setTipoInteres(interes);
            System.out.println("Nuevo saldo con interés: " + interes + " Es " + cuenta.calcularInteres());
        } else {
            System.out.println("No se puede establecer un interés negativo ni superior al 10%");
        }

    }
    //copiado desde el otro repositorio que era individual
}
