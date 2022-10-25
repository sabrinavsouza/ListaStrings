
/**
 * Escreva uma descrição da classe questaoUm aqui.
 * Faça um programa que receba uma frase e escreve a quantidade de vogais contidas nesta frase.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.*;

public class questaoUm
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\fEntre com uma palavra ou frase, e descubra quantas vogais ela possui.");
        String frase = scanner.nextLine();
        int qntVogais = 0;
        int qntConsoantes = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                qntVogais++;
             }
    }
    System.out.print("\n'" + frase + "' possui " + qntVogais + " vogais.");
}
}

