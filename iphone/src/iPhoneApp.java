import aparelho.AparelhoTelefonico;
import aparelho.Telefone;
import navegador.NavegadorInternet;
import navegador.PaginaWeb;
import reprodutor.Musica;
import reprodutor.ReprodutorMusical;

public class iPhoneApp {

    public static void main(String[] args) {
        // Criar objetos
        Musica musica = new Musica("Música 1", "Artista 1");
        Telefone telefone = new Telefone("123-456-789");
        PaginaWeb paginaWeb = new PaginaWeb("https://www.example.com");

        // Reprodutor Musical
        ReprodutorMusical reprodutor = new ReprodutorMusical() {
            @Override
            public void tocar() {
                System.out.println("Tocando música.");
            }

            @Override
            public void pausar() {
                System.out.println("Pausando música.");
            }

            @Override
            public void selecionarMusica(Musica musica) {
                System.out.println("Selecionando música: " + musica.getTitulo());
            }
        };

        reprodutor.tocar();
        reprodutor.selecionarMusica(musica);
        reprodutor.pausar();

        // Aparelho Telefônico
        AparelhoTelefonico telefoneApp = new Telefone(telefone.toString());

        telefoneApp.ligar();
        telefoneApp.atender();
        telefoneApp.iniciarCorreioVoz();

        // Navegador na Internet
        NavegadorInternet navegador = new NavegadorInternet() {
            @Override
            public void exibirPagina(PaginaWeb pagina) {
                System.out.println("Exibindo página: " + pagina.getUrl());
            }

            @Override
            public void adicionarNovaAba(PaginaWeb pagina) {
                System.out.println("Abrindo nova aba com página: " + pagina.getUrl());
            }

            @Override
            public void atualizarPagina(PaginaWeb pagina) {
                System.out.println("Atualizando página: " + pagina.getUrl());
            }
        };

        navegador.exibirPagina(paginaWeb);
        navegador.adicionarNovaAba(new PaginaWeb("https://www.example2.com"));
        navegador.atualizarPagina(paginaWeb);
    }
}
