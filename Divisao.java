
package com.mycompany.mavenproject4;


   public class Divisao { 
    public double calcula(double a, double b) {
        if (b == 0) {
            throw new DivisaoPorZeroException("Erro: Divisão por zero não é permitida.");
        }
        return a / b;
    }
} 

