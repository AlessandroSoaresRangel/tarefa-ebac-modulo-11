package tarefaParte2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TarefaParte2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite nomes separado por virgula com o sexo M ou F separado por /: ");
        String nomes = scanner.nextLine();
        scanner.close();
        List<String> listaNomesComSexo = List.of(nomes.split(","));
        System.out.println("Nomes digitados: " + listaNomesComSexo);
        List<String> listaNomes = new ArrayList<>();
        List<String> listaSexo = new ArrayList<>();

        for (String nomeComSexo : listaNomesComSexo) {
            List<String> nomeESexo = List.of(nomeComSexo.split("/"));
            String nome = nomeESexo.get(0);
            listaNomes.add(nome);
            String sexo = nomeESexo.get(1);
            listaSexo.add(sexo);
            System.out.println("Nome: " + nome + " Sexo: " + sexo);
        }
    }
}
