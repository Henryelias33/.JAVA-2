import javax.swing.JOptionPane;
public class Solucao1t {
    public static void main(String[] args) {
        // Definindo três números diretamente no código
        int numero1 = 12; // Primeiro número
        int numero2 = 25; // Segundo número
        int numero3 = 8;  // Terceiro número

        // Inicializando a variável maior com o primeiro número
        int maior = numero1;

        // Comparando para encontrar o maior número
        if (numero2 > maior) {
            maior = numero2; // Atualiza maior se numero2 for maior
        }
        if (numero3 > maior) {
            maior = numero3; // Atualiza maior se numero3 for maior
        }

        // Imprimindo o maior número
        System.out.println("O maior número é: " + maior);
    }
}
