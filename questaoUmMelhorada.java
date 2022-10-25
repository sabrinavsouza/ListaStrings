
/**
 * Escreva uma descrição da classe CopyOfquestaoMelhorada aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.*;

public class questaoUmMelhorada
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a frase");
        String frase = scanner.nextLine();
        int qntVogais = 0;
        int qntConsoantes = 0;
        int qntEspaco = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                qntVogais++;
            }else if (frase.charAt(i) != ' '){
                qntConsoantes ++;
            } else{
                qntEspaco ++;
            }
        }

        System.out.println("Quantidade de letras na frase: " + (frase.length() - qntEspaco) );
        System.out.println("Quantidade de vogais na frase: " + qntVogais);
        System.out.println("Quantidade de consoantes na frase: " + qntConsoantes);
    }
}
