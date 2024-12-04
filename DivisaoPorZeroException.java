

package com.mycompany.mavenproject4;


public class DivisaoPorZeroException extends RuntimeException {
    public DivisaoPorZeroException(String mensagem) {
        super(mensagem); // Envia a mensagem para a classe pai RuntimeException
    }
}
