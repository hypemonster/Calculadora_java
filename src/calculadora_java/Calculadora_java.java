/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_java;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Calculadora_java {

    private static boolean continuar;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double ValorUm;
        double ValorDois;
        String operacao;
        
        do {
            System.out.println("Digite o primeiro número: ");
            ValorUm = scanner.nextDouble();

            System.out.println("Digite a operação(-,+,/,*): ");
            operacao = scanner.next();

            System.out.println("Digite o segundo número: ");
            ValorDois = scanner.nextDouble();
            
            System.out.println("====================");
            System.out.println("Resultado: " + realizarCalculo(ValorUm, ValorDois, operacao));
            System.out.println("====================");
            
            continuar = verificarNovaOperacao();
        } while (continuar);
        
    }
    
    public static boolean verificarNovaOperacao(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Deseja realizar uma nova operação? (S ou N): ");
        return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");
    }
    
    public static Double realizarCalculo(Double valorUm, Double valorDois, String operacao){
        Double respostaCalculo = 0.0;
        
        switch (operacao){
            case "+":
                respostaCalculo = valorUm + valorDois;
                break;
            case "-":
                respostaCalculo = valorUm - valorDois;
                break;
            case "/":
                respostaCalculo = valorUm / valorDois;
                break;
            case "*":
                respostaCalculo = valorUm * valorDois;
                break;
            default:
                System.out.println("A Operação é inválida");
        }
        
        return respostaCalculo;
    }
    
}
