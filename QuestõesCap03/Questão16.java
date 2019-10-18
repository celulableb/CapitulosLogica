
package QuestoesCap3;

import java.util.Scanner;

public class Questão16 {
    public static void main(String[] args) {
        //variaveis
        int c1, c2; 
        int hpnz;
        int ma1, ma2;
        Scanner e = new Scanner(System.in);
        //enteda
        System.out.println("Cateto 1:");
            c1 = e.nextInt();
        System.out.println("Cateto 2:");
            c2 = e.nextInt();
       //Processamento
       
       hpnz = c1^2 + c2^2;
            //saida
      System.out.print("A hipotenuza vale:"+hpnz);
    }
}
