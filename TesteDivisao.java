
package com.mycompany.mavenproject4;


public class TesteDivisao {
  public static void main(String[] args) {
        Divisao divisao = new Divisao();

        try {
            double resultado = divisao.calcula(10, 0); //  divisão por zero
            System.out.println("Resultado: " + resultado);
        } catch (DivisaoPorZeroException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        //  divisão válida
        try {
            double resultadoValido = divisao.calcula(10, 2);
            System.out.println("Resultado: " + resultadoValido);
        } catch (DivisaoPorZeroException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
