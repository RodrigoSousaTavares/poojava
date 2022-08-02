import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome("Caroline");
        pessoa.setAltura(1.6);
        pessoa.setIdade(19);
        // printando o métodos
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());

        Conta conta = new Conta();
        System.out.println(conta.getSaldo());
        conta.depositar(300);
        System.out.println(conta.getSaldo());

    }
}
