import java.util.Scanner;

public class for_challenge_def {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um número para iniciar o calculo:");
        int numCalc = scanner.nextInt();

        System.out.println("Tabela de valores da função quadratica até "+numCalc+":");
        for (int i = 1; i <= numCalc; i++) {
            int funcQ = i * i;
            System.out.println(i+"² = "+funcQ);
        }
    }
}