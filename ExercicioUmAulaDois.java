package auladois;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExercicioUmAulaDois {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(); //instância
        Scanner sc = new Scanner(System.in);
        int qtd, min, max, valor, soma = 0;
        double med;
        
        System.out.print("Quantos números você vai inserir? ");
        qtd = sc.nextInt();
        
        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            valor = sc.nextInt();
            numeros.add(valor);
        }

        max = Collections.max(numeros);
        min = Collections.min(numeros);
        
        for (Integer j : numeros) { //j recebe cada valor dea lista números a cada interação
            soma += j;
        }
        sc.close();
        med = (double)soma / qtd;
        System.out.println("\nValor máximo: " + max);
        System.out.println("\nValor mínimo: " + min);
        System.out.println("\nMédia: " + med);
    }
}
