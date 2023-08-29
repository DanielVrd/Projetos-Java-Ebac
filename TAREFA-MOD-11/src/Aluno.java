

public class Aluno implements Comparable<Aluno> {

    private int numero;

    private String nome;

    private double nota;

    public Aluno (int numero, String nome, double nota){
        this.numero=numero;
        this.nome=nome;
        this.nota=nota;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "Nome='" + nome + '\'' +
                '}';
    }

    @Override
    public int compareTo(Aluno nome) {
        return this.nome.compareTo(nome.getNome());
    }
}
