package br.com.crazyaudio.modelo;

public class Audio {
    private String tituloDoAudio;
    private int duracaoDoAudio;
    private int totalDeReproducoes;
    private int totalDeCurtidas;
    private int totalDeClassificacoes;
    private double notaDeClassificacao;
    protected String resultadoDaClassificacao;

    public String getTituloDoAudio() {
        return tituloDoAudio;
    }

    public void setTituloDoAudio(String tituloDoAudio) {
        this.tituloDoAudio = tituloDoAudio;
    }

    public int getDuracaoDoAudio() {
        return duracaoDoAudio;
    }

    public void setDuracaoDoAudio(int duracaoDoAudio) {
        this.duracaoDoAudio = duracaoDoAudio;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes() {
        this.totalDeReproducoes++;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public void setTotalDeCurtidas(int totalDeCurtidas) {
        this.totalDeCurtidas = totalDeCurtidas;
    }

    public double getNotaDeClassificacao() {
        return notaDeClassificacao;
    }

    public void setNotaDeClassificacao(double notaDeClassificacao) {
        this.notaDeClassificacao = notaDeClassificacao / totalDeClassificacoes;
    }

    public int getTotalDeClassificacoes() {
        return totalDeClassificacoes;
    }

    public void setTotalDeClassificacoes() {
        this.totalDeClassificacoes++;
    }
}
