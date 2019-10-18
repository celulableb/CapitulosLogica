package QuestoesCap3;

import javax.swing.JOptionPane;

public class questao6 {
    public static void main(String[] args) {
        double salario; double vendas; double comi;double salarioFinal;
        salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o salário","R$"));
        vendas = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o o valor das vendas","R$"));
        
        comi = (vendas * 4)/100;
        salarioFinal = salario + comi;
        
        JOptionPane.showMessageDialog(null,"Valor da comissão: R$" + comi);
        JOptionPane.showMessageDialog(null,"Salário final: R$" + salarioFinal);
        
        
    }
}
