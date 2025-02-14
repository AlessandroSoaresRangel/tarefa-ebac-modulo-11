import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite nomes separado por virgula: ");
        String nomes = scanner.nextLine();

        List<String> listaNomes = List.of(nomes.split(","));

        System.out.println("Nomes digitados: " + listaNomes);
        scanner.close();
    }
}