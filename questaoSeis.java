
/**
 * Escreva uma descrição da classe questaoSeis aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.*;

public class questaoSeis
{
    public static void main(String[] args) {
        System.out.print("\f");
        
        String palavra = "Java";
        String aux1 = "";        
        
        for(int i = 0; i < palavra.length()-1; i++){ 
            aux1 = aux1 + palavra.charAt(i);
            System.out.println(aux1);                     
            }

        for(int i = palavra.length()-1; i >= 0; i--){
            for (int j = 0; j <=i; j++){
              System.out.print(palavra.charAt(j));        
            }
            System.out.println();        
         }
      
}
}

