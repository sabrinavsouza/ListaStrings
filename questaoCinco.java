
/**
 * Escreva uma descrição da classe questaoCinco aqui.
 * Faça um programa em Java que peça ao usuário para digitar um texto e informe quantos caracteres possui o texto informado pelo usuário.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.*;

public class questaoCinco
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\fEntre com um texto, e descubra quantos caracteres o texto possui.");

        System.out.print("\nEntre com o texto:");
        String texto = scanner.nextLine();
        
  
        int contaCaractere = 0;
        
        for (int i = 0; i < texto.length(); i++){
            contaCaractere++;
        }
        
        System.out.print("\nO texto possui " + contaCaractere + " caracters.");  
        }
               
    }        
    

