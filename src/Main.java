import br.com.crazyaudio.modelo.Colecao;
import br.com.crazyaudio.modelo.Musica;
import br.com.crazyaudio.modelo.Podcast;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Musica musica1 = new Musica();
        musica1.setTituloDoAudio("Friday I'm Love");
        musica1.setAlbum("The Best Ever");
        musica1.setDuracaoDoAudio(210);
        musica1.setTotalDeCurtidas();
        musica1.setTotalDeReproducoes();
        musica1.setTotalDeReproducoes();
        musica1.setTotalDeClassificacoes();
        musica1.setNotaDeClassificacao(2);
        musica1.setTotalDeClassificacoes();
        System.out.println("\n*****MÚSICA*****");
        System.out.println("Título: " + musica1.getTituloDoAudio());
        System.out.println("Álbum: " + musica1.getAlbum());
        System.out.println("Duração: " + musica1.getDuracaoDoAudio() + " segundos");
        System.out.println("Total de visualizações: " + musica1.getTotalDeReproducoes());
        System.out.println("Curtidas: " + musica1.getTotalDeCurtidas());
        System.out.println("Total de Classificações: " + musica1.getTotalDeClassificacoes());
        System.out.println("Nota de Avaliação: " + musica1.getNotaDeClassificacao() +
                ". Avaliação: " + musica1.classificar());


        Musica musica2 = new Musica();
        musica2.setTituloDoAudio("Jumpsy");
        musica2.setAlbum("Grunge");
        musica2.setDuracaoDoAudio(110);
        musica2.setTotalDeCurtidas();
        musica2.setTotalDeReproducoes();
        musica2.setTotalDeClassificacoes();
        musica2.setNotaDeClassificacao(8);
        System.out.println("\n*****MÚSICA*****");
        System.out.println("Título: " + musica2.getTituloDoAudio());
        System.out.println("Álbum: " + musica2.getAlbum());
        System.out.println("Duração: " + musica2.getDuracaoDoAudio() + " segundos");
        System.out.println("Total de visualizações: " + musica2.getTotalDeReproducoes());
        System.out.println("Curtidas: " + musica2.getTotalDeCurtidas());
        System.out.println("Total de Classificações: " + musica2.getTotalDeClassificacoes());
        System.out.println("Nota de Avaliação: " + musica2.getNotaDeClassificacao() +
                ". Avaliação: " + musica2.classificar());


        Podcast podcast1 = new Podcast();
        podcast1.setTituloDoAudio("Mentes abertas são melhores");
        podcast1.setNumeroDoEpisodio(1);
        podcast1.setDuracaoDoAudio(5610);
        podcast1.setTotalDeCurtidas();
        podcast1.setTotalDeReproducoes();
        podcast1.setTotalDeClassificacoes();
        podcast1.setNotaDeClassificacao(9);
        System.out.println("\n*****PODCAST*****");
        System.out.println("Título: " + podcast1.getTituloDoAudio());
        System.out.println("Nº do Episódio: " + podcast1.getNumeroDoEpisodio());
        System.out.println("Duração: " + podcast1.getDuracaoDoAudio() + " segundos");
        System.out.println("Total de visualizações: " + podcast1.getTotalDeReproducoes());
        System.out.println("Curtidas: " + podcast1.getTotalDeCurtidas());
        System.out.println("Total de Classificações: " + podcast1.getTotalDeClassificacoes());
        System.out.println("Nota de Avaliação: " + podcast1.getNotaDeClassificacao() +
                ". Avaliação: " + podcast1.classificar());


        Colecao colecao1 = new Colecao();
        colecao1.setTituloDoAudio("Músicas Clássicas");
        colecao1.setCategoria("Clássicos");
        colecao1.setDuracaoDoAudio(110);
        colecao1.setTotalDeCurtidas();
        colecao1.setTotalDeReproducoes();
        colecao1.setTotalDeClassificacoes();
        colecao1.setNotaDeClassificacao(8);
        System.out.println("\n*****COLEÇÃO*****");
        System.out.println("Título: " + colecao1.getTituloDoAudio());
        System.out.println("Nº do Episódio: " + colecao1.getCategoria());
        System.out.println("Duração: " + colecao1.getDuracaoDoAudio() + " segundos");
        System.out.println("Total de visualizações: " + colecao1.getTotalDeReproducoes());
        System.out.println("Curtidas: " + podcast1.getTotalDeCurtidas());
        System.out.println("Total de Classificações: " + colecao1.getTotalDeClassificacoes());
        System.out.println("Nota de Avaliação: " + colecao1.getNotaDeClassificacao() +
                ". Avaliação: " + colecao1.classificar());


    }
}