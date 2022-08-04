package classes;

import javax.swing.JOptionPane;

public class Personagem {
    // atributos da classe
    private String nome;
    private int nivel;
    private int forca;
    private int vida;
    private String classe;

    // método construtor
    public Personagem(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
        nivel = 10; // definindo um atributo no método construtor
        vida = nivel * 5000; // definindo um atributo no método construtor
        // vai comparar o objeto classe, se for "Guerreiro"
        if(classe.equals("Guerreiro")){
            forca = nivel * 2;
        } else {
            forca = nivel * 1;
        }
    }

    // métodos específicos
    public void mostrarStatus() {
        // variavel de tipo Stringo com format definido
        String status = String.format("Nome: %s\nNível: %d\nVida: %d\nClasse: %s\nForça: %d",
         nome,
          nivel,
           vida,
            classe,
             forca);
             // imprime mensagem
             JOptionPane.showMessageDialog(null, status, "Status do Personagem", JOptionPane.INFORMATION_MESSAGE);
    }

    // métodos getter e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

}
