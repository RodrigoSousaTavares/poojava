package classes;

public class Pessoa{
    // atributos da classe
    private String nome;
    private int idade;
    private float altura;

    /* método construtor para criar mensagens, atlerar valor dos atributos da class e para chamar outros métodos,
     podendo passar paramtros para o construtor também */
    // <modificador> <nomeDaClasse>()
    public Pessoa(String nome, int idade, float altura) {
        System.out.println("Uma pessoa acaba de nascer! Parabéns!");
        // alterarando o valor dos atributos
        this.nome = nome; // usando o this.nome para diferenciar que é um atributo de classe
        this.altura = altura;
        this.idade = idade;
        imprimirDados(); // chamando o método
    }

    public void imprimirDados() {
        System.out.format("Nome: %s, Idade: %d e %.2fm \n", nome, idade, altura);
    }

    // métodos getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}