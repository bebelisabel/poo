package aulaum;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c, f;
        System.err.println("Digite a temperatura em Celsius: ");
        c = sc.nextDouble();
        f = (c * 9/5) + 32;
        System.out.print("\nA temperatura em Fahrenheit é: " + f);
        sc.close();
    }
}
