import javax.swing.JOptionPane;
public class Solucao1R{
    public static void main(String[] args) {
        // Definindo dois números diretamente no código
        int numero1 = 25; // Primeiro número
        int numero2 = 10; // Segundo número

        // Verificando a ordem e imprimindo os números em ordem crescente
        if (numero1 < numero2) {
            System.out.println("Números em ordem crescente: " + numero1 + ", " + numero2);
        } else {
            System.out.println("Números em ordem crescente: " + numero2 + ", " + numero1);
        }
    }
}
