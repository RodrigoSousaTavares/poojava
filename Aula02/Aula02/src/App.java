public class App {
    public static void main(String[] args) throws Exception {
        Personagem heroi = new Personagem();
        heroi.nome = "Hércules";
        heroi.nivel = 2;
        heroi.forca = 16;

        Personagem heroi2 = new Personagem();
        heroi2.nome = "Zeus";
        heroi2.nivel = 50;
        heroi2.forca = 360;

        // chamando o método mostrarStatus para mostrar o status do personagem.
        heroi.mostrarStatus();
        heroi2.mostrarStatus();
        // chamando o método atacar e como argumento uma String "Hydra".
        heroi.atacar("Hydra", "Super soco");
        heroi2.atacar("Hydra", "Raios");
    }
}
