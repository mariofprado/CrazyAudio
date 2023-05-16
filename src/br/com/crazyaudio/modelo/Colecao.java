package br.com.crazyaudio.modelo;

import br.com.crazyaudio.classificacao.classificavel;

public class Colecao extends Audio implements classificavel {
    private String categoria;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String classificar() {
            if (getNotaDeClassificacao() >= 7) {
                resultadoDaClassificacao = "Excelente";
                return resultadoDaClassificacao;
            } else if (getNotaDeClassificacao() >= 4 && getNotaDeClassificacao() < 7) {
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
