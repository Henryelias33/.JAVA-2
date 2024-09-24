import javax.swing.JOptionPane;
public class Solucao1L {
    public static void main(String[] args) {
        // Definindo o número diretamente no código
        int numero = 21;

        // Verificando se o número é divisível por 3 e por 7
        if (numero % 3 == 0 && numero % 7 == 0) {
            System.out.println("O número " + numero + " é divisível por 3 e por 7.");
        } else {
            System.out.println("O número " + numero + " não é divisível por 3 e por 7.");
        }
    }
}
