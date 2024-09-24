import javax.swing.JOptionPane;
public class Solucao1o {
    public static void main(String[] args) {
        // Definindo o ano de nascimento e o ano atual diretamente no código
        int anoNascimento = 1990; // Exemplo de ano de nascimento
        int anoAtual = 2024;      // Exemplo de ano atual

        // Verificando se o ano de nascimento é válido
        if (anoNascimento <= 0 || anoNascimento > anoAtual) {
            System.out.println("Ano de nascimento inválido.");
        } else {
            // Calculando a idade
            int idade = anoAtual - anoNascimento;
            System.out.println("A idade da pessoa é: " + idade + " anos.");
        }
    }
}
