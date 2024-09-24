import javax.swing.JOptionPane;
public class Solucao1u {
    public static void main(String[] args) {
        // Definindo dois números diretamente no código
        double numero1 = 9; // Primeiro número
        double numero2 = 25; // Segundo número

        // Determinando o menor e o maior número
        double menor;
        double maior;

        if (numero1 < numero2) {
            menor = numero1;
            maior = numero2;
        } else {
            menor = numero2;
            maior = numero1;
        }

        // Calculando e imprimindo o quadrado do menor número
        double quadrado = menor * menor;
        System.out.println("O quadrado do menor número (" + menor + ") é: " + quadrado);

        // Calculando e imprimindo a raiz quadrada do maior número, se for possível
        if (maior >= 0) {
            double raizQuadrada = Math.sqrt(maior);
            System.out.println("A raiz quadrada do maior número (" + maior + ") é: " + raizQuadrada);
        } else {
            System.out.println("Não é possível calcular a raiz quadrada de um número negativo.");
        }
    }
}


