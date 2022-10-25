
/**
 * Escreva uma descrição da classe questaoSete aqui.
 * Construa uma classe em Java que peça ao usuário para digitar um texto em letras maiúsculas e mostre o texto em letra minúscula, em seguida solicite-o um texto em letra minúscula e mostre-o em letra maiúsculas.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.*;

public class questaoSete
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("\fEntre com uma palavra ou texto em letras maíusculas: ");
        String texto1 = scanner.nextLine();
        
        System.out.println(texto1.toLowerCase());
        
        System.out.print("\nEntre com uma palavra ou texto em letras minúsculas: ");
        String texto2 = scanner.nextLine();
        
        System.out.print(texto2.toUpperCase());
        
        

        }
               
    }        
    

