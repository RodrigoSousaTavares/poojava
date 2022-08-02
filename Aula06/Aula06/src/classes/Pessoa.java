package classes;

public class Pessoa {
    // sempre colocar atributo de classe com modificador <private>
    private String nome = "Rodrigo";
    private int idade;
    private double altura;


    // <modificador-acesso> <retorno> nomeDoMetodo()
    public String getNome() {
        return nome;
    }
    // <modificador-acesso> <retorno> nomeDoMetodo()
    public void setNome(String nome) {
    // o "this.nome" está se referindo ao atributo "nome" da class Pessoa, recebendo o parametro do método "String nome"
        this.nome = nome;
    }
    // <modificador-acesso> <retorno> nomeDoMetodo()
    public int getIdade() {
        return idade;
    }
    // <modificador-acesso> <retorno> nomeDoMetodo()
    public void setIdade(int idade) {
        // o "this.idade" está se referindo ao atributo "idade" da class Pessoa, recebendo o parametro do método "int idade"
        this.idade = idade;
    }
    // <modificador-acesso> <retorno> nomeDoMetodo()
    public double getAltura() {
        return altura;
    }
    // <modificador-acesso> <retorno> nomeDoMetodo()
    public void setAltura(double altura) {
        // o "this.altura" está se referindo ao atributo "altura" da class Pessoa, recebendo o parametro do método "double altura"
        this.altura = altura;
    }
    
}
