import javax.swing.JOptionPane;
public class Solucao1c {
    public static void main(String[] args) {
        // Definindo o número diretamente no código
        double numero = -4; // Número fixo para este exemplo

        // Verificando se o número é positivo
        if (numero >= 0) {
            // Se for positivo, calcula a raiz quadrada
            double raizQuadrada = Math.sqrt(numero);
            System.out.println("A raiz quadrada do número é: " + raizQuadrada);
        } else {
            // Se for negativo, calcula o quadrado do número
            double quadrado = Math.pow(numero, 2);
            System.out.println("O quadrado do número é: " + quadrado);
        }
    }
}

