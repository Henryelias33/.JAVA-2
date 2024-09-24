import javax.swing.JOptionPane;
public class Solucao1d {
    public static void main(String[] args) {
        // Definindo três números diferentes
        int num1 = 5;
        int num2 = 2;
        int num3 = 8;

        // Criando uma variável temporária para a ordenação
        int temp;

        // Ordenando os números em ordem crescente
        if (num1 > num2) {
            // Troca num1 com num2
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num1 > num3) {
            // Troca num1 com num3
            temp = num1;
            num1 = num3;
            num3 = temp;
        }

        if (num2 > num3) {
            // Troca num2 com num3
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        // Exibindo os números em ordem crescente
        System.out.println("Números em ordem crescente: " + num1 + ", " + num2 + ", " + num3);
    }
}
