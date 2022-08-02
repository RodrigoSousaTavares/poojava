import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    // declarando um método void. (significa que não está retornando nada)
    void mostrarStatus() {
        System.out.format("Personagem: %s (%d) com %d de força.\n", nome, nivel, forca);
    }

    // declarando um método int. (significa que vai retornar um número inteiro)
    // importando a classe Random que gera números aleatorios e criando um objeto com nome de gerador
    // declarando uma variavel dado20Faces  que vai simular um dado de 20 faces com um valor máximo de 20
    // como o nextInt começa gerando de 0 até o máximo que definirmos então precisamos subtrair o valor que vai ficar
    // nextInt(): 0...19 e como nós precisa que comece no número 1 então vamos somar 1 + valor do nextInt()
    // declarando uma variavel dano que vai calcular o dano e o calculo vai ser a forca do personagem (16) mais o
    // o valor aleatorio que o dados20Faces gerar, como eu quero retornar a variavel dano vou usar return
    int calcularDano() { 
        Random gerador = new Random();
        int dado20Faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20Faces;
        return dano;
    }

    // declarando um método void, com o parâmetro "alvo" e "habilidade" de tipo String.
    void atacar(String alvo, String habilidade) {
        // chamando o método calcularDano para o método atacar
        int danoCausado = calcularDano();
        // "" o tamanho (.length) é igual 0
        if (habilidade.length() == 0) {
            System.out.format("%s atacou %s e causou %d de dano.\n", nome, alvo, danoCausado);
        } else {
            System.out.format("%s usou a '%s' contra %s e causou %d de dano.\n",
                                     nome, habilidade, alvo, danoCausado);
        }
    }
}