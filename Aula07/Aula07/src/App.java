import javax.swing.JOptionPane;

import classes.Personagem;
import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        String nome = JOptionPane.showInputDialog(null, "Nome do personagem: ");
        String classe = JOptionPane.showInputDialog(null, "Classe do personagem: ");

        Personagem personagem = new Personagem(nome, classe);
        personagem.mostrarStatus();
    }
}
