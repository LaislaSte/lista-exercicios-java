
package com.mycompany.lernota;

import javax.swing.JOptionPane;

public class lerNota {

    public static void main(String args[]) {
        lerNota();
        
    }	

    static void lerNota(){
	double n1, n2; String nome;
        nome = JOptionPane.showInputDialog(null, "Digite um nome: ");
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota"));
        JOptionPane.showMessageDialog(null, nome);
        calcularMedia(n1, n2);
	}

    private static void calcularMedia(double a1, double a2){
	double md;
	md = (a1+a2)/2;
	if (md>=7){
            JOptionPane.showMessageDialog(null, "Média: " +md +"\n"+"Aprovado(a)");
	}else if (md <= 7){
                    JOptionPane.showMessageDialog(null, "Média: " +md +"\n"+"Reprovado(a)");
		}

    }
}
