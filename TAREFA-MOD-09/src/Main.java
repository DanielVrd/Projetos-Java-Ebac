public class Main {

    public static void main(String[] args) {
        Teste teste = new Teste();
        teste.codigo2.byteValue();
        /*
        Instanciei o teste apenas para ver se o "teste.codigo2." estariam com os comandos
        adicionais provenientes do "Integer". Coloquei o byteValue apenas para o print rodar.
         */

        long num1 = 1234567891;
        System.out.println("Valor primitivo: " +num1);
        Long num2 = Long.valueOf(num1);
        System.out.println("Valor wrapper: " +num2);

        long numX = 999999999;
        int numY = (int) numX;
        System.out.println("Valor Casting " +numY);

    }
}