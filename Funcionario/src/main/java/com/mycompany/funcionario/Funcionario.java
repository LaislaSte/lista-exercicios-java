
package com.mycompany.funcionario;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Funcionario {
   private String nome;
   private String nasc;
   private int idade;
   private double salario;

    //getters e setters
      public String getNome(){
         return this.nome;
      }
      public void setNome(String n){
         this.nome = n;
         }
      public int getIdade(){
         return this.idade;
      }
      public void setIdade(int i){
         this.idade = i;
      }
      public Double getSalario(){
         return this.salario;
      }
      public void setSalario(Double s){
         this.salario = s;
      }
      public String getNasc(){
         return this.nasc;
      }   
      public void setNasc(String nasc){
         this.nasc = nasc;
      }
      
      //preenchimento de informações
      public void setNomeSalario(){
         setNome(JOptionPane.showInputDialog(null, "Insira o nome do funcionario"));
         setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o salario do funcionario")));
      }

     //calculos 
      public int calcularIdade(){
         Calendar cal = GregorianCalendar.getInstance();
         int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
         int mesAtual = cal.get(Calendar.MONTH) + 1;
         int anoAtual = cal.get(Calendar.YEAR);

         int diaNasc = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o dia de nascimento "));
         if ((diaNasc<=0) && (diaNasc>31)){
            JOptionPane.showMessageDialog(null, "Sia inválido");
         } else {
            int mesNasc = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o mês de nascimento "));
            if ((mesNasc<=0) && (mesNasc>12)){
               JOptionPane.showMessageDialog(null, "Mês inválido ");
            } else {
               int anoNasc = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o ano de nascimento"));
               if ((anoNasc<=0) && (anoNasc>anoAtual)){
                  JOptionPane.showMessageDialog(null, "Ano inválido ");
               } else {
                  int Nasc = anoNasc*365;
                  Nasc = Nasc+(mesNasc*31);
                  Nasc = Nasc+diaNasc;
                  int Atual = anoAtual*365;
                  Atual = Atual+(mesAtual*31);
                  Atual = Atual+diaAtual;
                  int idadeFuncionario = anoAtual - anoNasc;
                  setIdade(idadeFuncionario);
                  setNasc(diaNasc +"/"+mesNasc+"/"+anoNasc);
               }
            }
         }
         return 0;
      }

      private Double calcularDesconto(){
         this.salario = this.salario - ((12/100)*this.salario);
         return salario;
      }

      public void getInf(){
         JOptionPane.showMessageDialog(null, "Nome do funcionario: "+getNome() + "\n Salario: "+getSalario()+ "\n Idade: "+getIdade()+ "\n Nascimento: "+getNasc()+ "\n Desconto do salario: "+calcularDesconto());
      }
}