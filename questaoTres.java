
/**
 * Escreva uma descrição da classe questaoTres aqui.
 * Faça um programa que recebe um verbo regular terminado em AR e o conjuga no tempo verbal presente.�
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.*;

public class questaoTres
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\fEscolha um verbo regular terminado em 'AR' para ser conjulgado no presente");

        System.out.print("\nEntre com o verbo:");
        String verbo = scanner.nextLine();
        
        if (verbo.endsWith("ar")) //o método .endsWith() verifica se o valor fornecido corresponde com parte da String.
        {     
         System.out.println("\nEu " + verbo.replace("ar", "o")); //o método replace faz uma pesquisa simples e substitui uma parte da string por outra definida no SOP
         System.out.println("Tu "   + verbo.replace("ar", "as"));
         System.out.println("Ele "  + verbo.replace("ar", "a"));
         System.out.println("Nós "  + verbo.replace("ar", "amos"));
         System.out.println("Vós "  + verbo.replace("ar", "ais"));
         System.out.println("Eles " + verbo.replace("ar", "am"));
        } else{
            System.out.println("\nO verbo escolhido não cumpre com o requisito solicitado. \nTente novamente com um verbo terminado em 'AR'.");
        }
        
        }  
    }    

