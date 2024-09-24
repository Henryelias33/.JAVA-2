import javax.swing.JOptionPane;
public class Solucao1v {
    public static void main(String[] args) {
        // Definindo três números diretamente no código
        int numero1 = 15; // Primeiro número
        int numero2 = 30; // Segundo número
        int numero3 = 20; // Terceiro número

        // Inicializando as variáveis para armazenar os números ordenados
        int maior, intermediario, menor;

        // Determinando o maior número
        if (numero1 > numero2 && numero1 > numero3) {
            maior = numero1;
            if (numero2 > numero3) {
                intermediario = numero2;
                menor = numero3;
            } else {
                intermediario = numero3;
                menor = numero2;
            }
        } else if (numero2 > numero1 && numero2 > numero3) {
            maior = numero2;
            if (numero1 > numero3) {
                intermediario = numero1;
                menor = numero3;
            } else {
                intermediario = numero3;
                menor = numero1;
            }
        } else {
            maior = numero3;
            if (numero1 > numero2) {
                intermediario = numero1;
                menor = numero2;
            } else {
                intermediario = numero2;
                menor = numero1;
            }
        }

        // Imprimindo os números ordenados
        System.out.println("Maior: " + maior);
        System.out.println("Intermediário: " + intermediario);
        System.out.println("Menor: " + menor);
    }
}
