import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        parteUm();
        parteDois();
    }

    private static void parteUm() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite três nomes separados por vírgula: ");
        String texto = s.nextLine();

        String[] nomes = texto.split(",");
        Arrays.sort(nomes);

        System.out.println("Nomes ordenados em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
    private static void parteDois() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes e sexos separados hífen e virgula: ");
        String texto = s.nextLine();

        String[] pessoas = texto.split(",");

        System.out.println("Pessoas do sexo masculino:");
        for (String pessoa : pessoas) {
            String[] partes = pessoa.split("-");
            if (partes.length == 2) {
                String nome = partes[0];
                String sexo = partes[1];
                if (sexo.equals("M")) {
                    System.out.println(nome);
                }
            }
        }

        System.out.println("Pessoas do sexo feminino:");
        for (String pessoa : pessoas) {
            String[] partes = pessoa.split("-");
            if (partes.length == 2) {
                String nome = partes[0];
                String sexo = partes[1];
                if (sexo.equals("F")) {
                    System.out.println(nome);
                }
            }
        }
    }
}
