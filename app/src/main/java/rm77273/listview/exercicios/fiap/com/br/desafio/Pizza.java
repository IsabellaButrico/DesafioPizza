package rm77273.listview.exercicios.fiap.com.br.desafio;

import java.io.Serializable;

/**
 * Created by logonrm on 30/03/2017.
 */

public class Pizza  implements Serializable {

    private String nome;
    private String descricao;
    private String ingredientes;
    private String pontuacao;
    private String alergia;
    private int imgpizza;
    private String valorp;

    public Pizza(String nome, String descricao, String ingredientes, String pontuacao, String alergia, int imgpizza, String valorp) {
        this.nome = nome;
        this.descricao = descricao;
        this.ingredientes = ingredientes;
        this.pontuacao = pontuacao;
        this.alergia = alergia;
        this.imgpizza = imgpizza;
        this.valorp = valorp;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(String pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getImgpizza() {
        return imgpizza;
    }

    public void setImgpizza(int imgpizza) {
        this.imgpizza = imgpizza;
    }

    public String getValorp() {
        return valorp;
    }

    public void setValorp(String valorp) {
        this.valorp = valorp;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }
}

