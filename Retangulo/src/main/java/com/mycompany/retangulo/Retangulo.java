
package com.mycompany.retangulo;

import javax.swing.JOptionPane;

public class Retangulo {
    float comprimento = 0, largura = 0, a, b;

    public void infCompLarg(){
        comprimento = Float.parseFloat(JOptionPane.showInputDialog(null, " informe o comprimento do retangulo"));
        largura = Float.parseFloat(JOptionPane.showInputDialog(null, " informe a largura do retangulo "));
    }
    
    public void calcularArea(){
        a = comprimento * largura;
        JOptionPane.showMessageDialog(null, "O resultado da area desse retangulo é: "+ a);    
    }
    
    public void calcularPerimetro(){
        b = (comprimento * 2) + (largura*2);
        JOptionPane.showMessageDialog(null, "O resultado do perimetro desse retangulo é: "+ b);
    }
}
