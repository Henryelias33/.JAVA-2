import javax.swing.JOptionPane;
public class Solucao1b {
    public static void main(String[] args) {
        // Definição dos números fixos
        int num1 = 8;  // Primeiro número fixo
        int num2 = 10; // Segundo número fixo

        // Soma dos dois números
        int soma = num1 + num2;

        // Verificação: se a soma for menor ou igual a 20
        if (soma <= 20) {
            // Subtrai 5 da soma e exibe o resultado
            int resultado = soma - 5;
            System.out.println("A soma menos 5 é: " + resultado);
        }
    }
}
