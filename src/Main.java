import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o valor a ser convertido:");
        double valor = scanner.nextDouble();

        System.out.println("Digite a moeda de origem (por exemplo, USD):");
        String moedaOrigem = scanner.next().toUpperCase();


        System.out.println("Digite a moeda de destino (por exemplo, EUR):");
        String moedaDestino = scanner.next().toUpperCase();

        try {
            double valorConvertido = ConversorMoedas.converterMoeda(valor, moedaOrigem, moedaDestino);
            System.out.println(valor + " " + moedaOrigem + " equivalem a " + valorConvertido + " " + moedaDestino);
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao converter moeda: " + e.getMessage());
        }
    }
}
