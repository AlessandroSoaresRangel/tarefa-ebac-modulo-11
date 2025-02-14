import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite nomes separado por virgula: ");
        String nomes = scanner.nextLine();

        List<String> listaNomes = new ArrayList<>(List.of(nomes.split(",")));
        Collections.sort(listaNomes);
        System.out.println("Nomes digitados: " + listaNomes);
        scanner.close();
    }
}