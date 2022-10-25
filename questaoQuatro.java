
/**
 * Escreva uma descrição da classe questao4 aqui.
 * Faça um programa que recebe um verbo regular terminado em AR e o conjuga no tempo verbal presente.�
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.*;

public class questaoQuatro
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\fEntre com uma palavra e descubra se ela é um palíndromo.");

        System.out.print("\nEscolha a palavra:");
        String palavra = scanner.nextLine();
        String auxiliar = palavra;
              
        StringBuilder palindromo = new StringBuilder(palavra);
        palavra = palindromo.reverse().toString();
        
        
        if (auxiliar.equals(palavra))        
        System.out.print("\n" + palavra.toUpperCase() + " é um palíndromo! Pois quando escrita de trás para frente, permanece igual.");
        else 
        System.out.print("A palavra escolhida não é um palíndromo. Pois quando escrita de trás para frente fica: " + palavra.toUpperCase() + ".");
     
    }
 } 
    

