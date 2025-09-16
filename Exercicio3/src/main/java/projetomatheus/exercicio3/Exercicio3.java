package projetomatheus.exercicio3;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
       double precoVista;
       int qtdParcela;
       double totalParcelado;
       double valorJuros = 0.05;
       double valorParcela;
       
       // Instanciando o scanner para capturar a entrada do usuário
      
       Scanner scanner = new Scanner(System.in);
       // Solicitando e capturando o valor à vista
       System.out.print("Digite o valor a vista: ");
       precoVista = scanner.nextDouble();

       // Solicitando e capturando a quantidade de parcelas
       System.out.print("Digite a quantidade de parcelas: ");
       qtdParcela = scanner.nextInt();

       // Calculando o total parcelado e o valor da parcela
       totalParcelado = calcularParcelas(precoVista, qtdParcela, valorJuros);
       valorParcela = totalParcelado / qtdParcela;
       
       // Exibindo os resultados
       System.out.println("O total parcelado é: R$ " + totalParcelado);
       System.out.println("O valor de cada parcela é: R$ " + valorParcela);

       // Fechando o scanner
       scanner.close();
    }

    // Método para calcular o total parcelado
    public static double calcularParcelas(double precoVista, int qtdParcela, double valorJuros) {
        return precoVista * (1 + (qtdParcela * valorJuros));
    }
}
