import java.util.Scanner;

public class for_atv_def2 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número entre 1 e 10 para a produção da Tabuada:");
        int numT = scanner.nextInt();

        //Teste de valores.
        if (numT <= 10) {
            System.out.println("A tabuada do "+numT+" é:");
            for (int i = 1; i <= 10; i++) {
                int result = numT * i;
                System.out.println(numT+" X "+i+" = "+result);
            }
        } else {
            System.out.println("Insira um valor valido.");
        }

        scanner.close();
    }
}
