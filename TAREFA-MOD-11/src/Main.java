import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
    listaOrdenada();
    }

    private static void listaOrdenada() {
        List<Aluno> listaAluno = new ArrayList<>();

        Aluno Daniel = new Aluno(10, "Daniel",10);
        Aluno Bruno = new Aluno(15, "Bruno",5);
        Aluno Amanda = new Aluno(20,"Amanda",7);

        listaAluno.add(Daniel);
        listaAluno.add(Bruno);
        listaAluno.add(Amanda);
        Collections.sort(listaAluno);
        System.out.println(listaAluno);
    }
}