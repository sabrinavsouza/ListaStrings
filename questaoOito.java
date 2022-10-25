
/**
 * Escreva uma descrição da classe questaoOito aqui.
 * Construa uma classe em Java que peça ao usuário para digitar um texto em letras maiúsculas e mostre o texto em letra minúscula, em seguida solicite-o um texto em letra minúscula e mostre-o em letra maiúsculas.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.*;

public class questaoOito
{
    public static void main(String[] args) {
        System.out.print("\f");
        
        String palavra = "Java";   
        
        String aux1 = "";
        
        for(int i = 0; i < palavra.length(); i++){ 
            aux1 = aux1 + i;
            System.out.println(aux1);
        
            }
             
            System.out.print("\n");
            
        for(int i = palavra.length()-1; i >= 0; i--){
            for (int j = 0; j <=i; j++){
              System.out.print(palavra.substring(0,4));        
            }
            System.out.println();        
         }
        
         
        
         
        
        
            
            /*
        System.out.println(palavra.substring(0,1));
        System.out.println(palavra.substring(0,2));
        System.out.println(palavra.substring(0,3));
        System.out.println(palavra.substring(0,4));
        System.out.println(palavra.substring(0,3));
        System.out.println(palavra.substring(0,2));
        System.out.println(palavra.substring(0,1));
        
        }*/
               
    }  
}     
    

