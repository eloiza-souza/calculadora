package com.eloiza.calculadora;

public class Calculator {

    public static double sum(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public static double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double divide(double firstNumber, double secondNumber) {
        if (secondNumber == 0)
            throw new ArithmeticException("ERRO: não é permitido divisão por zero");
        return firstNumber / secondNumber;
    }

    public static double pow(double base, double expoent) {
        return Math.pow(base, expoent);
    }

    public static double root(double number, double index) {
        if (index == 0) {
            throw new ArithmeticException("ERRO: índice da raiz não pode ser zero");
        }
        return Math.pow(number, 1/index);
    }

    public static double percentual(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber / 100;
    }

    public static double log10(double number) {
        if (number <= 0) {
            throw new IllegalArgumentException("ERRO: logaritmo não definido para números menores ou " +
                    "iguais a zero");
        }
        return Math.log10(number);
    }

}
