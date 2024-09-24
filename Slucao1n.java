import javax.swing.JOptionPane;
public class Slucao1n {
    public static void main(String[] args) {
        // Definindo o número diretamente no código
        int numero = 50;

        // Verificando divisibilidade por 10, 5 e 2
        if (numero % 10 == 0) {
            System.out.println("O número " + numero + " é divisível por 10.");
        } else if (numero % 5 == 0) {
            System.out.println("O número " + numero + " é divisível por 5.");
        } else if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é divisível por 2.");
        } else {
            System.out.println("O número " + numero + " não é divisível por 10, por 5 ou por 2.");
        }
    }
}
