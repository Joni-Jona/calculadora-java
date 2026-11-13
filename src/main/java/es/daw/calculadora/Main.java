/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.calculadora;

/**
 *
 * @author jonat
 */
public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        double numero1 = 20;
        double numero2 = 5;

        System.out.println("CALCULADORA JAVA");
        System.out.println("----------------");

        System.out.println("Suma: " + calculadora.sumar(numero1, numero2));

        System.out.println("Resta: " + calculadora.restar(numero1, numero2));

        System.out.println("Multiplicación: " + calculadora.multiplicar(numero1, numero2));

        System.out.println("División: " + calculadora.dividir(numero1, numero2));

        System.out.println("Potencia (2^3): " + calculadora.potencia(2, 3));
    
        System.out.println("Módulo (20 % 6): " + calculadora.modulo(20, 6));
    
    }
}
