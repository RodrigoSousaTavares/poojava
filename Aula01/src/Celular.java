public class Celular {
    // Características -> atributos
    String nome;                    // atributo chamado nome do tipo String
    String sistemaOperacional;      // atributo chamado sistemaOperacional do tipo String
    int espacoArmazenamento;        // atributo chamado espacoArmazenamento do tipo int
    float tamanhoTela;              // atribudo chamado tamanhoTela do tipo float


    // método void que vai ter saída -> "Celular" +  nome + " com tela de " tamanhoTela ", com " + espacoArmazenamento + "e SO " + sistemaOperacional
    void mostrarSobre() {
        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s.\n",
         nome, tamanhoTela, espacoArmazenamento, sistemaOperacional);
    }


    // método desbloquear celular e fazer ligação para os contatos
    void ligaDesliga (int botao, int contatos) {
        if (botao == 1) {
            System.out.println("Tela ligada, pronta para ligação");
            if (contatos == 1) {
                System.out.println("Ligando para mãe...");
            } else if (contatos == 2) {
                System.out.println("Ligando para pai...");
            }
        } else if (botao == 0){
            System.out.println("Tela desligada");
        } else {
            System.out.println("Encerrando...");
        }
    }

}

