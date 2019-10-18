package QuestoesCap3;

import java.util.Scanner;

public class questao17 {
    public static void main(String[] args) {
        double raio; double comp , volume; 
        Scanner entrad= new Scanner (System.in);
        System.out.println("Informe o raio");
        raio = entrad.nextDouble();
        
        comp = Math.PI * raio *2;
        volume = (3/4) * Math.PI * Math.pow(raio, 3);
        
        System.out.println("O comprimento é: "+comp);
        System.out.println("O volume é: "+volume);
    }
    
}
