import java.util.Scanner;
public class verificadorDePrimos {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int numeroUsuario;

        System.out.println("Digite um número:");
        numeroUsuario = dado.nextInt();
        
        boolean primo = true;

        if (numeroUsuario <= 1) {
            System.out.println("O número NÃO é Primo!");
        }
        else {
            for (int i = 2; i <= numeroUsuario / 2; i++) {
                if (numeroUsuario % i == 0) {
                    primo = false;
                    break;
                }
        if (primo) {
            System.out.println("O número É PRIMO!");
        }
        else {
            System.out.println("O número NÃO é Primo!");
        }
            }
        }
    }
}
