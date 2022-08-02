public class App {
    public static void main(String[] args) throws Exception {
        // Iphone 12, tela 6.1', 64gb
        // Xiaomi Mi 9T, tela 6.39', 64gb
        // Galaxy Note 20 Ultra, tela de 6.9', 256gb

        // declarando um objeto do tipo Celular = Instanciando um objeto
        Celular celularA = new Celular(); 
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 64;
        celularA.sistemaOperacional = "iOS";

        Celular celularB = new Celular(); 
        celularB.nome = "Xiaomi Mi 9T";
        celularB.tamanhoTela = 6.39f;
        celularB.espacoArmazenamento = 64;
        celularB.sistemaOperacional = "Android";

        Celular celularC = new Celular(); 
        celularC.nome = "Galaxy Note 20 Ultra";
        celularC.tamanhoTela = 6.9f;
        celularC.espacoArmazenamento = 256;
        celularC.sistemaOperacional = "Android";


        // chamando o método mostrarSobre
        celularA.mostrarSobre();
        celularB.mostrarSobre();
        celularC.mostrarSobre();

        // chamando o método ligaDesliga que faz ligação com argumentos botao e contatos
        // primeiro argumento: 0 = tela desligada, 1 = tela ligada
        // segundo argumento: 1 = mãe, 2 = pai
        celularA.ligaDesliga(1, 1);

    }
}
