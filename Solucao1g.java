import javax.swing.JOptionPane;
public class Solucao1g {
    public static void main(String[] args) {
        // Definindo o nome, sexo e idade diretamente no código
        String nome = "Maria";  // Nome da pessoa
        char sexo = 'F';        // Sexo da pessoa (F para feminino, f também é aceito)
        int idade = 22;         // Idade da pessoa

        // Verificando se a pessoa é do sexo feminino e tem menos de 25 anos
        if ((sexo == 'F' || sexo == 'f') && idade < 25) {
            // Se a condição for verdadeira, imprime "ACEITA"
            System.out.println(nome + ": ACEITA");
        } else {
            // Caso contrário, imprime "NÃO ACEITA"
            System.out.println(nome + ": NÃO ACEITA");
        }
    }
}
