package Tarefa;

public class Programa {

    public static void main (String[]args) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setCodigo(1l);
        pessoaFisica.setNome("Daniel");
        pessoaFisica.setSobrenome("Verdi");
        pessoaFisica.setCpf(123456789l);
        System.out.println(pessoaFisica.getNome() + " tem o cpf: " + pessoaFisica.getCpf());

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setCodigo(2l);
        pessoaJuridica.setNome("Empresa X");
        pessoaJuridica.setSobrenome("y");
        pessoaJuridica.setCnpj(987654321l);
        System.out.println(pessoaJuridica.getNome() + " tem o cnpj: " + pessoaJuridica.getCnpj());
    }
}
