package org.example;

public class Calculadora {
    public double calcular(double numero1, double numero2, char operador) {
        switch (operador){
            case '+':{
                return adicionar(numero1, numero2);
            }
            case '-':{
                return subtrair(numero1, numero2);
            }
            case '*':{
                return multiplicar(numero1, numero2);
            }
            case '/':{
                return dividir(numero1, numero2);
            }
            default:
                throw new IllegalArgumentException("Operador não suportado :" + operador);
        }
    }
    private double adicionar(double numero1, double numero2) {
        return numero1 + numero2;
    }
    private double subtrair(double numero1, double numero2) {
        return numero1 - numero2;
    }
    private double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }
    private double dividir(double numero1, double numero2) {
        if (numero2 == 0)
            throw new IllegalArgumentException("Segundo operando deve ser diferente de zero");
        return numero1 / numero2;
    }
}
