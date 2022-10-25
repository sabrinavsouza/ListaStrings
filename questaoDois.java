
/**
 * Escreva uma descrição da classe questaoDois aqui.
 * Faça um programa que receba uma frase e uma palavra e escreve a quantidade de vezes que esta palavra apareceu nesta frase.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.*;

public class questaoDois
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\fEntre com uma palavra e um texto, e descubra quantas vezes a palavra aparece no texto.");

        System.out.print("\nEntre com a palavra:");
        String palavra = scanner.nextLine();
        
        System.out.print("Entre com a frase ou texto:");
        String frase = scanner.nextLine();
        
        int contaPalavra = 0;
        
        for (int i = 0; i < frase.length(); i++){
            if (frase.substring(i).startsWith(palavra)) //O método startsWith() compara se a string começa com os caracteres de uma determinada string
                contaPalavra++;
    
        }
        
        System.out.print("\nA quantidadede de vezes que a palavra " + palavra + " aparece no texto digitado é: " + contaPalavra + ".");  
        }
               
    }        
    

