package br.com.crazyaudio.modelo;
import br.com.crazyaudio.classificacao.classificavel;

public class Musica extends Audio implements classificavel {
    private String album;

    //private String resultadoDaClassificacao;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }


    @Override
    public String classificar() {

        if (getNotaDeClassificacao() >= 8) {
            resultadoDaClassificacao = "Excelente";
            return resultadoDaClassificacao;
        } else if (getNotaDeClassificacao() >= 5 && getNotaDeClassificacao() < 8) {
            resultadoDaClassificacao = "Bom";
            return resultadoDaClassificacao;
        } else if (getNotaDeClassificacao() >=2 && getNotaDeClassificacao() <=5) {
            resultadoDaClassificacao = "Ruim";
            return resultadoDaClassificacao;
        } else {
            resultadoDaClassificacao = "Péssimo";
            return resultadoDaClassificacao;
        }
    }
}
