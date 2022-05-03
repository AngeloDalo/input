import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual e il tuo nome? ");
        String nome = scanner.nextLine();
        System.out.println("Qual e la tua eta? ");
        int eta = scanner.nextInt(); //non va a capo
        //se ci fosse stato qualche altro dato da inserire avrebbe dato errore
        scanner.nextLine(); //va a capo
        System.out.println("ciao " + nome + " hai " + eta + " anni");
    }
}
