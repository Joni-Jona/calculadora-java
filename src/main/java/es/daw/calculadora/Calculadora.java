/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package es.daw.calculadora;

/**
 *
 * @author jonat
 */
public class Calculadora {

    // Suma dos números 
    public double sumar(double a, double b) {
        return a + b;
    }

    // Resta el segundo número al primero 
    public double restar(double a, double b) {
        return a - b;
    }

    // Multiplica dos números 
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Divide el primer número entre el segundo 
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException(
                    "No se puede dividir entre cero"
            );
        }
        return a / b;
    }
    
    // Calcula la potencia (base elevado al exponente)
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
    
    // Calcula el módulo (resto de la división entre a y b)
    public double modulo(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException(
                    "No se puede calcular el módulo entre cero"
            );
        }
        return a % b;
    }
}
