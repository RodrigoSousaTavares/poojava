import javax.lang.model.util.ElementScanner14;

public class ContaNetflix {
    // <modificador de acesso> <tipo> <atributo>  
    // <private> <String> <idiomaPreferencial>;
    private String idiomaPreferencial;
    private String resoulucaoTela;

    // <modificador de acesso> <tipo> <atributo>
    // <public> <void> <entrar>;
    public void entrar() {
        busarPreferenciasDoUsuario();
        indentificarResolucao();
    }
    // <modificador de acesso> <tipo> <atributo>
    private void busarPreferenciasDoUsuario() {
        idiomaPreferencial = "PT-BR";
    }
    // <modificador de acesso> <tipo> <atributo>
    private void indentificarResolucao() {
        resoulucaoTela = "Full HD";
    }
    // <modificador de acesso> <tipo> <atributo>
    public void assistirFilme(String nomeFilme) {
        System.out.println("Iniciando o filme " + nomeFilme);
        System.out.println("Carregando o filme na resolução " + resoulucaoTela);
        carregarAudioFilme();
    }
    // <modificador de acesso> <tipo> <atributo>
    private void carregarAudioFilme(){
        if (idiomaPreferencial == "PT-BR" || idiomaPreferencial == "EN-US") {
            System.out.println("Carregando o aúdio em " + idiomaPreferencial);
        } else {
            System.out.println("Carregando o aúdio em  EN-US");
        }
    }

}
